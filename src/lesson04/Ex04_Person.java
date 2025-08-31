package lesson04;

public class Ex04_Person {
    public String name = "김사과";
    private int age = 20;
    protected String hobby = "코딩";
    String job = "개발자";

    public void showInfo() {
        System.out.println("이름: "+name);
        System.out.println("나이: " + age);
        System.out.println("취미: " + hobby);
        System.out.println("직업: " +job);
    }
}
