package lesson04;

class Ex06_Animal {
    public void speak() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Ex06_Cat extends Ex06_Animal {
    @Override
    public void speak() {
        System.out.println("야옹~");
    }
}
class Ex06_Dog extends Ex06_Animal {
    @Override
    public void speak() {
        System.out.println("멍멍!");
    }
}


public class Ex06_Main {
    public static void main(String[] args) {
        Ex06_Animal a1 = new Ex06_Cat(); //업캐스팅
        Ex06_Animal a2 = new Ex06_Dog();
        a1.speak();
        a2.speak();
    }
}
