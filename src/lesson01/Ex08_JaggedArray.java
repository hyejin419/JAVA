package lesson01;
//가변 배열(Jagged Array) > 메모리를 절약하고 유연한 구조 가능
public class Ex08_JaggedArray {
    public static void main(String[] args) {
        // 3행짜리 배열 만들기 (열 크기는 정해지지 않음)
        int [][] jagged = new int [3][];

        jagged[0] = new int [] {1, 2};      //2열
        jagged[1] = new int [] {3, 4, 5};   //3열
        jagged[2] = new int [] {6};         //1열

        System.out.println("Jagged [0][0]: " + jagged[0][0]);  //1
        System.out.println("Jagged [0][1]: " + jagged[0][1]);  //2

        System.out.println("Jagged [1][0]: " + jagged[1][0]);  //3
        System.out.println("Jagged [1][1]: " + jagged[1][1]);  //4
        System.out.println("Jagged [1][2]: " + jagged[1][2]);  //5

        System.out.println("Jagged [2][0]: " + jagged[2][0]);  //6
    }
}
