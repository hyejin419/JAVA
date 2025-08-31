package lesson06;

public class Ex08_Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello world");
        sb.append(" ");
        sb.append("world");
        sb.insert(6, "Java");
        sb.delete(0, 6);
        sb.reverse();

        System.out.println(sb.toString());

        StringBuffer sb2 = new StringBuffer("hello");
        sb2.append(" Thread");
        sb2.insert(5, " Safe");

        System.out.println(sb2.toString());
    }
}
