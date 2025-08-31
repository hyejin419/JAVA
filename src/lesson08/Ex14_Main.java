package lesson08;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

class Ex14_Order {
    private final int orderId;

    public Ex14_Order(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }
}

class Ex14_OrderProcessor implements Callable<String> {
    private final Ex14_Order order;
    private final String workerName;
    private static final Random random = new Random();

    private static final Map<String, int[]> workerSpeedMap = Map.of(
            "김사과", new int[]{1000, 2000},
            "반하나", new int[]{2000, 3000},
            "오렌지", new int[]{3000, 4000}
    );
    private static final AtomicInteger totalProcessed = new AtomicInteger(0);
    private static final Map<String, Integer> workerStats = new ConcurrentHashMap<>(); //ConcurrentHashMap: 여러 작업을 해도 충돌이 없는

    public Ex14_OrderProcessor(Ex14_Order order, String workerName) {
        this.order = order;
        this.workerName = workerName;
    }

    @Override
    public String call() throws Exception {
        int[] speedRange = workerSpeedMap.get(workerName);
        int prepTime = random.nextInt(speedRange[1] - speedRange[0] +1) + speedRange[0];
        Thread.sleep(prepTime);
        totalProcessed.incrementAndGet();
        //주문 1건이 처리되었으니, 전체 주문 수를 1 증가
        workerStats.merge(workerName, 1,Integer::sum);
        //workerName: 알바생 이름
        //1: 처리한 주문 수
        //merge(key,value,function)
        //알바생의 이름이 Map에 없으면 (workerName, 1)로 추가
        //이미 있다면 ("김사과", 기존값+1)로 업데이트
        return workerName + " - 주문 " + order.getOrderId() + "번 완료 (소요시간: " + prepTime + "ms)";
    }
    public static int getTotalProcessed() {
        return totalProcessed.get();
    }

    public static void printStats() {
        System.out.println("점원 별 처리 주문 수: ");
        workerStats.forEach((name, count) -> System.out.println(name + ": " + count + "건"));
    }
}

public class Ex14_Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int totalOrders = 10;
        List<String> workers = List.of("김사과","반하나","오렌지");
        ExecutorService executor = Executors.newFixedThreadPool(workers.size());
        List<Future<String>> futures = new ArrayList<>();
        for (int i =1; i <=totalOrders; i++) {
            String worker = workers.get(i % workers.size());
            Ex14_Order order = new Ex14_Order(i);
            futures.add(executor.submit(new Ex14_OrderProcessor(order, worker)));
        }
        for(Future<String> future : futures) {
            System.out.println(future.get());
        }
        executor.shutdown();
        Ex14_OrderProcessor.printStats();
        System.out.println("총 주문 처리 수: " + Ex14_OrderProcessor.getTotalProcessed() + "건");
    }
}
