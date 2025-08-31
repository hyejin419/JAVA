package lesson08;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex12_Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            System.out.println("복잡한 계산 중...");
            Thread.sleep(2000);
            return 42;
        };

        Future<Integer> future = executor.submit(task);
        System.out.println("메인 스레드는 다른 작업 중...");
        Integer result = future.get(); //결과가 나올때까지 기다림
        System.out.println("계산 결과: " + result);
        executor.shutdown();  //하나만 만들었으므로(newSingleThreadExecutor()) 자원을 반납하기 위해 작성.
    }
}
