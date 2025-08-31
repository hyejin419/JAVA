package lesson07;
//HashSet
import java.util.HashSet;

/*hash: 고정된 길이의 데이터로 변환하는 것. 같은 글자를 해시화하면 항상 같다.
* set: 순서가 없다.중복 불허용*/
public class Ex01_Main {
    public static void main(String[] args) {
        // 1. HashSet 생성
        HashSet<String> set = new HashSet<>();

        // 2. 출석 체크
        set.add("김사과");
        set.add("반하나");
        set.add("오렌지");
        set.add("이메론");
        set.add("배애리");
        System.out.println(set);
        //중복 데이터
        set.add("김사과");
        set.add("반하나");

        // 3. 전체 명단 출력
        System.out.println("📋 출석한 학생 명단:");
        for (String name :set) {
            System.out.println("- " + name);
        }

        //4. 특정 학생 출석 여부 확인
        System.out.println("\n🔍 '오렌지' 출석 여부: " + set.contains("오렌지"));
        System.out.println("🔍 '박수박' 출석 여부: " + set.contains("박수박"));

        // 5. 학생 삭제
        set.remove("이메론");
        System.out.println("\n🗑️ '이메론' 삭제 후 출석 명단:");
        for (String name : set) {
            System.out.println("- " + name);
        }
    }
}
