package lesson07;
//익명 클래스를 이용하여 ButtonClickListener 인터페이스 구현

interface Ex11_ButtonClickListener{
    void onClick();
}
public class Ex11_Main {
    public static void main(String[] args) {
        //익명클래스
        Ex11_ButtonClickListener listener = new Ex11_ButtonClickListener() {
            @Override
            public void onClick() { //익명클래스가 인터페이스를 구현한 정식 메서드
                System.out.println("버튼이 클릭되었습니다.");
            }
        };
        //익명클래스
        listener.onClick();
    }
}
/*
익명클래스를 사용하여 onClick()메서드를 구현한 객체를 생성하고, listener변수에 저장.
new Ex11_ButtonClickListener()는 단순한 인터페이스 인스턴스 생성이 아니고,
Ex11_ButtonClickListener를 구현한 익명 클래스의 객체를 생성하는 특별한 문법이다.
(인터페이스는 단독으로 인스턴스 생성안되지만, 익명클래스를 통해 즉석에서 구현하여 객체를 만들 수 있다.)

-----람다식-----
Ex11_ButtonClickListener listener = () -> System.out.println("버튼이 클릭되었습니다.");
listener.onClick();

 */