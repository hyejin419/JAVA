package lesson07;
//TreeSet과 Comparable 인터페이스를 이용해 Student 객체를 점수 오름차순으로 정렬
import java.util.TreeSet;

class Student implements Comparable<Student> {  //implements Comparable<Student>:인터페이스 구현 (정렬 기준 제공)
    String name;
    int score;  //클래스의 필드 (속성)

    public Student(String name, int score) {
        this.name = name;  //매개변수 값을 인스턴스 변수에 저장
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {  //Comparable 인터페이스의 메서드
        /*
            a < b : -1
            a == b : 0
            a > b : 1
        */
        return Integer.compare(this.score, o.score);  //오름차순
        //return Integer.compare(o.score, this.score);  //내림차순

    }//Student 클래스가 Comparable 인터페이스의 compareTo() 메서드를 반드시 구현해야 한다는 약속

    @Override
    public String toString() {
        return name + "(" + score + "점)";
    }
}

public class Ex03_Main {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student("김사과", 90));
        set.add(new Student("반하나", 85));
        set.add(new Student("오렌지", 95));
        set.add(new Student("이메론", 92));
        set.add(new Student("배애리", 85)); // 같은 점수 → 중복으로 간주되어 추가X

            System.out.println("🏅 점수 오름차순 정렬:");
            for (Student s : set) {
                System.out.println("- " + s);
        }

    }
}
/*
1. Student클래스
- name, score를 필드로 가짐
- Comparable<Student>를 구현해서 compareTo()메서드로 정렬 기준 설정
2. TreeSet<Student>
- TreeSet은 내부적으로 이진 트리 구조를 사용해 자동정렬 + 중복제거
- compareTo()기준으로 정렬
* */