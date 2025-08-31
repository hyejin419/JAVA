package lesson04;
//싱글톤 패턴
class Singleton {
    private static final Singleton instance = new Singleton(); //자기 자신의 객체 생성

    private Singleton() {
        System.out.println("싱글톤 객체 생성됨"); //내부에서 객체가 생성되었으므로 pirvate이여도 상관 없음
    }

    public static Singleton getInstance() {  //외부에서 사용 가능
        return instance; //내부에서 만든 객체 리턴
    }

    public void printMessage() {
        System.out.println("싱글톤 패턴으로 실행중입니다.");
    }
}

public class Ex12_Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance(); //같은 객체를 공유한다.
        s1.printMessage();
        System.out.println(s1 == s2);
    }
}
/*
디자인 패턴
- 자주 반복되는 문제 해결방법을 재사용 가능한 코드 형태로 정리해 놓은 설계
- 객체지향 원칙을 기반으로 설계

    사용이유
- 유지보수가 쉬운 코드를 만들기 위해 사용
- 재사용 가능하고 확장성있는 구조를 만들기 위해 사용
- 여러 개발자가 협업할 때 일관성 있는 코드 설계를 위해 사용

    디자인 패턴 3가지
- 생성 패턴 : 객체 생성 방식에 관련된 패턴
- 구조 패턴 : 클래스나 객체를 조합하여 더 큰 구조를 만드는 패턴
- 행위 패턴 : 객체들 간의 책임분배와 메시지 교환방식을 정의하는 패턴

GoF 디자인 패턴
*/