package lesson07;

import java.util.Comparator;
import java.util.TreeSet;

class Ex04_Student {
    String name;
    int score;
    public Ex04_Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + "(" + score + "점)";
    }
}


public class Ex04_Main {
    public static void main(String[] args) {
        Comparator<Ex04_Student> comparator = (a, b) -> Integer.compare(b.score,a.score);
        //람다식을 이용한 Comparator객체 생성. 이름 내림차순 정렬.
        TreeSet<Ex04_Student> set = new TreeSet<>(comparator);  //TreeSet에 위에서 만든 비교 기준을 넣어줌
        set.add(new Ex04_Student("김사과", 90));
        set.add(new Ex04_Student("반하나", 85));
        set.add(new Ex04_Student("오렌지", 95));
        set.add(new Ex04_Student("이메론", 92));
        set.add(new Ex04_Student("배애리", 85));

        System.out.println("🏅 점수 내림차순 정렬:");
        for (Ex04_Student s : set) {
            System.out.println("- " + s);
        }
    }
}

/*
 Comparable vs Comparator
| 구분           | 설명                                            |
| ------------ | --------------------------------------------- |
| `Comparable` | 객체 자기 자신이 정렬 기준을 직접 정의 (`compareTo()` 사용) |
| `Comparator` | 외부에서 정렬 기준을 주입 (`compare()` 사용)           |

*/



