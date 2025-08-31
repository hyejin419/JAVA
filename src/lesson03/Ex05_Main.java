package lesson03;

class Ex05_Animal {
    public void eat(){  // eat이라는 메서드를 가짐
        System.out.println("먹는다");
    }
}

class Ex05_Dog extends Ex05_Animal {// Animal을 상속받음
    public void bark(){
        System.out.println("멍멍 짖는다");
    }
}

public class Ex05_Main {
    public static void main(String[] args) {
        Ex05_Dog dog = new Ex05_Dog();
        dog.eat();   // 부모 클래스의 메서드
        dog.bark();  // 자식 클래스 고유 메서드
    }
}



