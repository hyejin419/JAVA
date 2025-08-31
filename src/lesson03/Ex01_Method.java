package lesson03;

public class Ex01_Method {
    public void printHello() {
        System.out.println("안녕하세요!");
    }

    public void printName(String name) {
        System.out.println("이름: " + name);
    }

    public int getRandomNumber() {
        return (int)(Math.random() * 100);

    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int sumAll(int... numbers) {
        int sum = 0;
        for (int n:numbers) {
            sum += n;
        }
        return sum;
    }


    public static void main(String[] args) {
        Ex01_Method ex01_Method = new Ex01_Method();
        ex01_Method.printHello();
        ex01_Method.printName("김사과");

        int rand = ex01_Method.getRandomNumber();
        System.out.println("랜덤 숫자: " + rand);

        int result = ex01_Method.multiply(4, 5);
        System.out.println("4*5 = " + result);

        int total = ex01_Method.sumAll(1,2,3,4,5);
        System.out.println("1부터 5까지의 합: " + total);
        System.out.println("합(없음): " + ex01_Method.sumAll()); ///빈 배열이 만들어짐


    }
    }
