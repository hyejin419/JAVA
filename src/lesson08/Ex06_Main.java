package lesson08;
//스레드
class Ex06_MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("스레드 실행중! - " + Thread.currentThread().getName());
    }
}
/*
- Thread 클래스를 상속하고 run() 메서드를 오버라이드하여 스레드 실행 시 실행될 작업 정의
- Thread.currentThread().getName()으로 현재 실행 중인 스레드 이름 출력
 */

public class Ex06_Main {
    public static void main(String[] args) {
        Ex06_MyThread t1 = new Ex06_MyThread();
        t1.start();
    }
}
