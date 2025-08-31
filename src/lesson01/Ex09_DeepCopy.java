package lesson01;

public class Ex09_DeepCopy {
    public static void main(String[] args) {
        int [] a = {1,2,3};  //int 타입의 배열 a를 만들고, 그 안에 3개의 값을 미리 저장

        int [] b = new int[3];  //크기가 3인 정수형 배열 생성. (초기값은 0)

        b[0] = a[0];
        b[1] = a[1];
        b[2] = a[2];

        System.out.println("a[0]: = " + a[0]);
        System.out.println("b[0]: = " + b[0]);
        System.out.println("--------------------");
        b[0] =99;
        System.out.println("a[0]: = " + a[0]);
        System.out.println("b[0]: = " + b[0]);

    }
}
/*
자바에서 new 키워드로 배열을 생성하면, 모든 요소가 기본값으로 초기화됩니다.
- int 배열의 기본값은 0
- double 배열은 0.0
- boolean 배열은 false
- 참조형 배열은 null
 */