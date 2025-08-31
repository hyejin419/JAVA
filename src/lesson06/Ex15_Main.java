package lesson06;
//linked list
import java.util.LinkedList;

public class Ex15_Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("김사과");
        ll.add("반하나");
        ll.add("오렌지");

        ll.addFirst("이메론");
        System.out.println(ll);

        System.out.println("현재 대기열: ");
        for (String s : ll) {
            System.out.println("- " + s);
        }

        while(!ll.isEmpty()) {
            ll.removeFirst();
            System.out.println("결과: " + ll);
        }

        System.out.println("남은 요소: "+ ll.size());
    }
}
