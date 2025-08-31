package lesson04;
//이종모음(Object 배열): 다양한 타입의 데이터를 하나의 배열에 넣고, 각 요소를 순회하면서 해당 타입에 맞게 처리하는 방식
class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }
    public void read(){
        System.out.println("책\"" + title + "\"을 읽습니다.");
    }
}

public class EX03_Main {
    public static void main(String[] args) {
        Object[] items = new Object[3];
        items[0] = "안녕하세요";
        items[1] = 100;
        items[2] = new Book("자바의 정석");
        //Object 타입 배열을 생성해 문자열, 정수, 사용자 정의 클래스 인스턴스를 담는다.
        //이처럼 Object 배열을 활용하면 서로 다른 타입의 객체들을 한 배열에 저장할 수 있다.

        //배열 순회하며 타입 확인 및 처리
        for (Object obj : items) {
            if (obj instanceof String) {
                System.out.println("문자열: " + obj);
            } else if (obj instanceof Integer num) {
                System.out.println("정수: " + num);
            } else if (obj instanceof Book book) {
                book.read(); //자동으로 book타입으로 다운캐스팅
            }
        }
    }
}