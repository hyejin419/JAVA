package lesson05;
//추상 클래스, 다형성, 상속
abstract class Ex01_Animal {
    String name;

    public Ex01_Animal(String name) {
        this.name = name;
    }
    abstract void sound(); //추상메서드

    void sleep() {         //일반메서드
        System.out.println(name + "(이)가 잠을 잡니다.");
    }
}

    class Dog extends Ex01_Animal {
        public Dog(String name) {
            super(name);
        }
            @Override
            void sound () {
                System.out.println(name + "(이)가 멍멍 짖습니다.");
            }
            void eat() {
                System.out.println(name + "(이)가 먹습니다.");

            }
        }

public class Ex01_Main {
    public static void main(String[] args) {
//        Ex01_Animal animal = new animal("동물")
        Dog dog = new Dog("바둑");
        dog.sound();
        dog.sleep();
        dog.eat();

        Ex01_Animal dog2 = new Dog("장군");  //다형성: 부모타입인 Ex01_Animal으로 Dog객체를 참조할 수 있다.
        dog2.sound();
        dog2.sleep();
//        dog2.eat(); 참조 타입이 Ex01_Animal이기 때문에, Ex01_Animal에 정의된 메서드만 사용 가능
    }
}


/*다형성: 부모 타입으로 자식 객체 참조 가능(공통 메서드만 호출 가능)*/