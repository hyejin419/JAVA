package lesson02;

import java.util.Scanner;

public class Ex14_Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("문장을 입력하세요 (종료하려면 exit 입력): ");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;  // 반복 종료
            }

            System.out.println("입력한 문장: " + input);
        }

        sc.close();
    }
}

//중첩 반복문에서는 break를 쓰면 가장 가까운 바깥 반복문 한 개만 종료됩니다.
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                if (j == 2) break;  // 안쪽 반복문만 멈춤
//                System.out.println("i=" + i + ", j=" + j);
//            }
//        }
//        sc.close();
//    }
//}


//라벨(label)은 반복문 앞에 이름을 붙여서, break가 어느 반복문을 종료할지 명확하게 지정할 수 있게 합니다.
//        outer:
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                if (j == 2) break outer;  // 바깥 반복문까지 종료!
//                System.out.println("i=" + i + ", j=" + j);
//            }
//        }
//    }
//}