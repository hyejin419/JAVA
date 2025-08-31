package lesson02;

import java.util.Scanner;

public class Ex17_Coord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("맵의 행 수를 입력해: ");
        int rows = sc.nextInt();
        System.out.print("맵의 열 수를 입력해: ");
        int cols = sc.nextInt();

        System.out.println("[맵 좌표 출력]");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("(" + i + "," + j + ")");

            }System.out.println();  //한 줄 끝나면 줄 바꿈
        }
    }
}
