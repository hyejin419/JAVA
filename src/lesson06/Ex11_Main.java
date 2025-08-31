package lesson06;
//제네릭
class Box<T> {
    private T item;
    public void set(T item) {
        this.item = item;
    }
    public T get() {
        return item;
    }
}

public class Ex11_Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("banana");
        String fruit = stringBox.get();
        System.out.println("과일: " + fruit);

        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        int number = intBox.get();  //형변환없이 꺼냄
        System.out.println("숫자: " + number);
    }
}
