package lesson08;

class Ex09_PrintTask implements Runnable {
    private String message;

    public Ex09_PrintTask(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println(message + " - " + i);
        }
    }
}

public class Ex09_Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Ex09_PrintTask("김사과"));
        Thread t2 = new Thread(new Ex09_PrintTask("반하나"));
        Thread t3 = new Thread(new Ex09_PrintTask("오렌지"));
        t1.start();
        t2.start();
        t3.start();
    }
}
