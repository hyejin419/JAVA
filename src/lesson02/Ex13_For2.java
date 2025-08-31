package lesson02;

import java.util.Random;
import java.util.Scanner;

public class Ex13_For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("주사위를 몇 번 던질까?");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int dice = rand.nextInt(6) + 1;
            System.out.println(i + "번째 주사위: 🎲 " + dice);
        }
        sc.close();
    }
}
