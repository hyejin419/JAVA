package lesson07;

import java.util.Objects;
import java.util.Scanner;

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other) {
        int dx = this.x - other.x;
        int dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }   //VO

    // VO의 핵심: 값이 같으면 동일한 객체로 간주
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point)) return false;
        Point other = (Point) obj;
        return x == other.x && y == other.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

    class StoreService {
        private final Point storeLocation = new Point(0, 0);

        public boolean canDeliver(Point customerLocation) {
            double distance = storeLocation.distanceTo(customerLocation);
            System.out.println("거리 계산: " + distance);
            return distance <= 5.0;
        }

    }


public class Ex07_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StoreService service = new StoreService();
        System.out.println("가게 기준점은 (0, 0)입니다.");
        System.out.print("고객 위치 X좌표 입력: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("고객 위치 Y좌표 입력: ");
        int y = Integer.parseInt(sc.nextLine());

        Point customer = new Point(x, y);
        System.out.println("고객 위치: " + customer);

        if (service.canDeliver(customer)) {
            System.out.println("배달 가능 지역입니다.");
        } else {
            System.out.println("배달 불가능한 지역입니다.");
        }

        sc.close();
    }
}
