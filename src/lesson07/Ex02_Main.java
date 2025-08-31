package lesson07;
//TreeSet<String>을 이용해 문자열(학생 이름)을 자동으로 정렬하고, 이름의 순서를 기준으로 특정 조건의 요소를 조회
import java.util.TreeSet;

public class Ex02_Main {
    public static void main(String[] args) {
        // 1. TreeSet 생성 (문자열 타입)
        TreeSet<String> set = new TreeSet<>();

        // 2. 학생 이름 추가
        set.add("김사과");
        set.add("반하나");
        set.add("오렌지");
        set.add("이메론");
        set.add("배애리");

        // 3. 중복 추가 시도
        set.add("김사과");  // 무시됨
        System.out.println(set);

        // 4. 자동 정렬된 학생 목록 출력
        System.out.println("📚 이름순으로 정렬된 학생 명단:");
        for(String name: set) {
            System.out.println("- " + name);
        }
        System.out.println("오렌지보다 앞에 오는 이름: "+ set.lower("오렌지"));
        System.out.println("오렌지보다 뒤에 오는 이름: "+ set.higher("오렌지"));
    }
}
