package lesson06;

class Printer {
    public <T> void print(T item) {
        System.out.println("출력: " + item);
    }
}


public class Ex13_Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("안녕!");
        printer.print(123);
        printer.print(3.14);
//        printer.print(ture);
    }
}
