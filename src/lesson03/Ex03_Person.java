package lesson03;

public class Ex03_Person { //클래스 Ex03_Person: 사람 객체를 정의하는 클래스
    String name; //이름을 저장하는 문자열 변수
    int age;  //나이를 저장하는 정수형 변수

    public Ex03_Person(String name, int age){  //생성자(Constructor): 객체 생성 시 필드 초기화
        this.name = name;
        this.age = age;
        //필드: name, age (객체의 상태,데이터를 저장하는 변수)
        //객체를 생성할 때 이름과 나이를 전달받아 필드에 값을 초기화한다.
        //this.name = name: 왼쪽은 클래스의 멤버 변수, 오른쪽은 생성자 매개변수.

    }
}

    class Ex03_Main {  /// 하나의 파일에는 하나의 public 클래스만 만들 수 있다. (public class Main → X)
    public static void main(String[] args) {
        Ex03_Person person = new Ex03_Person("김사과", 20);
        //Ex03_Person 클래스의 인스턴스(객체)를 생성
        //생성자에 "김사과"와 20을 전달하여 name, age 초기화.
        System.out.println(person.name + ", " + person.age) ;
    }
    //main() 메서드는 자바 프로그램 실행 시 가장 먼저 호출되는 메서드이다.
}
