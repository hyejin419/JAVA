package lesson04;

class Animal {
    public void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        super.sound();
        System.out.println("멍멍!!");
    } //오버라이딩: 부모기능 + 멍멍!

    public void wagTail(){
        System.out.println("꼬리를 흔듭니다.");
    }
}

public class Ex02_Main {
    public static void main(String[] args) {
        Dog dog = new Dog(); //dog: Animal을 상속받음.
        dog.sound();  //오버라이딩된 메서드
        dog.wagTail();  //강아지 기능

        Animal animal = dog; //업캐스팅 (Animal로 animal객체를 만듦)
        animal.sound();  //다형성 -> Dog의 sound() 실행
//        animal.wagTail(); //형태는 부모형태이므로 error

        Dog dog2 = (Dog) animal; //다운캐스팅
        dog2.sound();
        dog2.wagTail();
    }
}

/*
- 업캐스팅: Dog → Animal로 참조형을 변환. 형태는 부모지만, 오버라이딩된 메서드는 자식 것이 호출됨.
- 다형성: 부모 타입 참조가 자식의 메서드를 실행 가능(오버라이딩된 것만)
- 다운캐스팅: Animal → Dog로 다시 변환. 자식 고유 기능(wagtail) 사용 가능.
(다운캐스팅은 반드시 자식 타입으로 생성된 객체일 때만 유효!!)
*/
