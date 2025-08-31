package lesson03;

public class Ex02_Main {
    public static void main(String[] args) {
        Ex02_Dog dog = new Ex02_Dog(); ///객체 생성
        dog.name = "동동";
        dog.age = 3;         // 스택에 있는 변수dog가 힙에 있는 name과 age를 참조함.
        dog.introduce();  //메소드 호출
        dog.bark();

        Ex02_Dog dog2 = new Ex02_Dog();
        dog2.name = "바둑";   //dog와 dog2는 다른 메모리에 저장됨. (형태는 같다.)
        dog2.age = 4;
        dog2.introduce();
        dog2.bark();
    }
}
