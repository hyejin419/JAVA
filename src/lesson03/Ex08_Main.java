package lesson03;

class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + "는 먹습니다.");
    }
    public final void sleep() {
        System.out.println(name + "는 조용히 잠듭니다.");
    }
    public void speak() {
        System.out.println(name + "가 소리를 냅니다.");
    }
}


class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + "가 멍멍 짖습니다!");
    }
    //speak()메서드를 오버라이딩해서 강아지 전용 소리로 변경
    public void bark() {
        System.out.println("멍멍!");
    }
    public void bark(String target){
        System.out.println(target + "를 보고 멍멍!");
    }
    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("멍!");
        }
        System.out.println();
    //bark()메서드는 오버로딩. 인자없음: 기본짖음/ String인자: 대상을 보고 짖음/ int인자: 주어진 횟수만큼 짖음
    }
}

public class Ex08_Main {
    public static void main(String[] args) {
        Dog dongdong = new Dog("동동이");
        dongdong.eat();
        dongdong.sleep();
        dongdong.speak();
        dongdong.bark();
        dongdong.bark("택배 아저씨");
        dongdong.bark(3);
    }
}
/*
오버라이딩: speak()메서드를 Dog에서 재정의
오버로딩: bark()메서드를 여러버전으로 정의 (매개변수 다름)
final메서드: sleep()은 자식 클래스에서 재정의할 수 없음
*/