package lesson04;

public class Ex04_Main {
    public static void main(String[] args) {
        Ex04_Person person = new Ex04_Person(); //객체 생성
        System.out.println(person.name);
//        System.out.println(person.age); //private로 막아둠(04_Person)
        System.out.println(person.hobby);
        System.out.println(person.job);

    }
}
