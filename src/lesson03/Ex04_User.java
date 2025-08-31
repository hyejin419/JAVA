package lesson03;

import org.w3c.dom.ls.LSOutput;

public class Ex04_User {
    String name;
    int age;

    public Ex04_User(){  ///매개변수가 없는 생성자 생성
         this("이름없음", 0); /// this(): 같은 클래스의 생성자를 부르는 함수
        System.out.println("기본 생성자 호출됨");
    }

    public Ex04_User(String name) {
        this(name, 0);
        System.out.println("이름만 받는 생성자 호출됨");
    }

    public Ex04_User(String name, int age) {
        System.out.println("이름과 나이를 받는 생성자 호출됨");
        if(age<0) {
            System.out.println("나이는 음수가 될 수 없습니다.");
            this.age = 0;
            } else {
            this.age = age;
        }
        if(name == null || name.trim().isEmpty()) {
            this.name = "이름없음";
        } else {
            this.name = name;
        }
    }


    public void introduce(){
        System.out.println("안녕하세요, 제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
    }

    public static void main(String[] args) {
        Ex04_User u1 = new Ex04_User();
        Ex04_User u2 = new Ex04_User("김사과");
        Ex04_User u3 = new Ex04_User("반하나", 25);

        u1.introduce();
        u2.introduce();
        u3.introduce();  ///이름과 나이가 세팅이 안되어있으므로 u1, u2는 (String,참조형의 기본값)null, (int의 기본값)o
    }
}  //같은 이름의 메소드를 여러개 만드는 것 : 오버로딩