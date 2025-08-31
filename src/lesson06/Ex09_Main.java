package lesson06;

public class Ex09_Main {
    public static void main(String[] args) {
        long start, end;
        start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "a";
        }
        end = System.currentTimeMillis();
        System.out.println("String 시간: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder 시간: " + (end - start) + "ms");
    }
}
