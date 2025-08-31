package lesson05;
//추상클래스, 다형성 예제
abstract class Shape {
    abstract double getArea();  //추상메서드
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double getArea() {
        return radius * radius * Math.PI;
    }
}

class Rectangle extends Shape {
    double width, height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double getArea() {
        return width*height;
    }

}

public class Ex02_Main {
    public static void main(String[] args) {
        Shape s1= new Circle(5);
        System.out.println("원 면적: "+ s1.getArea());
        Shape s2 = new Rectangle(4,5);
        System.out.println("사각형 면적: "+s2.getArea());
    }
}
