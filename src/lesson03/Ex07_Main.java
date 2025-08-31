package lesson03;

class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
    public void greet() {
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
    }
}

class Student extends Person {
    String school;
    public Student(String name, String school) {
        super(name); //부모의 생성자 호출
        this.school=school;  //Student 클래스의 필드 초기화
    }

    @Override
    public void greet() {
        super.greet();  ///부모의 greet() 먼저 호출
        System.out.println("학교는 " + school + "입니다.");
    }
}


public class Ex07_Main {
    public static void main(String[] args) {
        Person person = new Person("김사과");
        person.greet();

        Student student = new Student("이메론", "코리아");
        student.greet();
    }
}
/*실행순서
1. Person("김사과") 객체 생성
- greet() 호출 → 안녕하세요, 저는 김사과입니다. 출력
2. Student("이메론", "코리아") 객체 생성
- super(name) → 부모 생성자 실행
- greet() 호출
-- 부모의 greet() → 안녕하세요, 저는 이메론입니다.
-- 자식의 println → 학교는 코리아입니다.
*/

/*오버라이딩: 부모의 메서드를 자식 클래스에서 재정의*/
/*다형성: 같은 greet() 메서드라도 객체에 따라 다른 동작 수행*/