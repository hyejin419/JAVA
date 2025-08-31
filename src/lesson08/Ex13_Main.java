package lesson08;
//ExecutorService를 활용해 3개의 Callable 작업을 동시에 실행하고 결과를 수집
import java.util.List;
import java.util.concurrent.*;

public class Ex13_Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3); //스레드 풀을 3개로 설정 → 동시에 최대 3개의 작업 수행 가능

        List<Callable<String>> tasks = List.of(
                () -> {Thread.sleep(500); return "🍎사과";},
                () -> {Thread.sleep(300); return "🍌바나나";},
                () -> {Thread.sleep(700); return "🍇포도";}
        );
        List<Future<String>> futures = executor.invokeAll(tasks);

        for (Future<String> f : futures) {
            try {
                System.out.println("결과: " + f.get());
            }catch(ExecutionException e){
                System.out.println("작업 중 예외 발생: " + e.getCause());
            }
        }
        executor.shutdown();
    }
}

/*
- Callable은 Runnable과 달리 값을 반환할 수 있음
- invokeAll()은 모든 작업이 완료될 때까지 대기 후, Future 리스트 반환
- Future.get()은 해당 작업이 끝날 때까지 대기하고, 결과를 반환
- 예외 발생 시 ExecutionException으로 래핑됨
- invokeAll()은 모든 작업이 완료될 때까지 기다린 후 결과를 일괄 반환하므로, get() 호출 순서와 상관없이 결과는 원래 순서대로 나옴.
 */
