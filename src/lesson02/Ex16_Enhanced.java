package lesson02;

public class Ex16_Enhanced {
    public static void main(String[] args) {
        String[] names = {"김사과", "오렌지", "이메론", "반하나"};

        for (int i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
