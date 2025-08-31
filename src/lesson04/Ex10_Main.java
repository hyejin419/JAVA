package lesson04;
//static 블록 실행
class Config {
    static int maxUsers;
    static {
        maxUsers = 100;
        System.out.println("Config 클래스가 로딩되면서 초기화 됨!");
    }
}

public class Ex10_Main {
    public static void main(String[] args) {
        System.out.println("최대 사용자 수: " + Config.maxUsers); //직접 접근

    }
}
/*
Config클래스가 JVM에 의해 처음 로딩되며,
→ static블록이 먼저 실행되고
→ 그 다음 maxUsers값이 출력된다.
*/