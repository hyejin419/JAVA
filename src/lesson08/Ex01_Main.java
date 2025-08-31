package lesson08;
//Stream: 데이터를 순차적으로 처리하는 파이프라인
import java.util.Arrays;
import java.util.List;

public class Ex01_Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "banana", "apple");
        System.out.println(fruits);

        /*
            String::toUpperCase
            - 메서드 참조
            s -> s.toUpperCase() (:문자열 s를 받아서 대문자로 변환)와 같은 람다식을 더 간단하게 표현
            String클래스의 toUpperCase() 인스턴스 메서드를 현재 스트림의 각 요소에 대해 호출하겠다는 뜻
         */
        fruits.stream() //리스트를 스트림으로 변환
                .filter(f -> f.startsWith("a"))
                //stream에서 하나씩 꺼내서 f에 대입, f: 매개변수/a로 시작하는 문자를 반환. 스트림 객체로 반환
                .map(String::toUpperCase)  //대문자로 변환
                .distinct()  //중복 제거
                .forEach(System.out::println);   //결과를 하나씩 출력
    }
}
