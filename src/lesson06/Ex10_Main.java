package lesson06;
//제네릭을 사용하지 않은 클래스(ObjectBox)의 한계
class ObjectBox {
    private Object item;
    public void set(Object item) {
        this.item = item;
    }
    public Object get() {
        return item;
    }
}

public class Ex10_Main {
    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        box.set("apple");
        Object obj = box.get();
        String fruit = (String) obj; //강제형변환
        System.out.println("과일: " + fruit);

        box.set(123);
        obj = box.get();
//      String fruit = (String) obj;  //잘못된 형 변환 시 에러 발생
    }
}
