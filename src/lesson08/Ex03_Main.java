package lesson08;
//Stream3 (문자 스트림을 이용하여 텍스트 파일 복사)
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03_Main {
    public static void main(String[] args) {
        try(
                FileReader reader = new FileReader("input.txt");
                FileWriter writer = new FileWriter("output2.txt");
            ) {
            int ch;
            while((ch = reader.read()) !=-1 ) {
                writer.write(ch); //한 글자씩 읽어서 출력 파일에 그대로 쓴다.-1은 더 이상 읽을 데이터가 없음을 의미
            }

            System.out.println("파일 복사 완료(문자스트림)");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}  //try-with-resources를 사용하여 reader와 writer를 자동으로 닫아준다.
