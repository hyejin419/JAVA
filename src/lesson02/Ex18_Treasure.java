package lesson02;

import java.util.Scanner;
import java.util.Random;

public class Ex18_Treasure {
    public static void main(String[] args) {
            final int SIZE = 5;
            char[][] map = new char[SIZE][SIZE];

            // 초기 맵은 모두 '-'로 표시
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = '-';
                }
            }

            // 보물 위치 설정
            Random rand = new Random();
            int treasureRow = rand.nextInt(SIZE);
            int treasureCol = rand.nextInt(SIZE);

            Scanner sc = new Scanner(System.in);
            boolean found = false;

            while (!found) {
                // 현재 맵 출력
                System.out.println("\n[맵 상태]");
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        System.out.print(map[i][j] + " ");
                    }
                    System.out.println();
                }

                // 사용자 입력
                System.out.print("\n행 번호 (0~4): ");
                int row = sc.nextInt();
                System.out.print("열 번호 (0~4): ");
                int col = sc.nextInt();

                // 입력 유효성 검사
                if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                    System.out.println("⚠️ 유효한 좌표를 입력하세요.");
                    continue;
                }

                // 보물 발견 여부 확인
                if (row == treasureRow && col == treasureCol) {  /// equals: 문자열 비교시 사용
                    map[row][col] = '🎁';
                    found = true;
                    System.out.println("\n🎉 축하합니다! 보물을 찾았습니다!");
                } else {
                    if (map[row][col] == '❌') {
                        System.out.println("😅 이미 시도한 위치입니다.");
                    } else {
                        map[row][col] = '❌';
                        System.out.println("🙁 여긴 아니에요. 다시 시도하세요.");
                    }
                }
            }

            // 최종 맵 출력
            System.out.println("\n[최종 맵]");
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }

            sc.close();
        }
    }