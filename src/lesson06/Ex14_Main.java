package lesson06;
//ArrayList활용 (리스트 추가, 수정, 삭제, 출력)
import java.util.ArrayList;

public class Ex14_Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("김사과");
        students.add("반하나");
        students.add("오렌지");

        students.add(1, "이메론");
        System.out.println(students);
        for (String name : students) {
            System.out.println("-" + name);
        }

        String student = students.get(2);
        System.out.println("\n2번 인덱스의 학생: " + student);

        students.set(2, "배애리");
        System.out.println("\n수정 후 2번 인덱스의 학생: " + student);

        students.remove("이메론");
        System.out.println(students);
        students.remove(0);
        System.out.println(students);

        System.out.println("\n현재 학생 수: " + students.size());

        System.out.println("\n최종 학생 목록");
        for (int i=0; i<students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
