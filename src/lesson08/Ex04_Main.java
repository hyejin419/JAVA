package lesson08;
//객체 직렬화를 이용해 Student 객체를 파일(student.ser)에 저장
//직렬화: 객체를 byte 형태로 변환하여 파일, 네트워크 등으로 전송하거나 저장하는 것
//다시 읽을 때는 **역직렬화(Deserialization)**로 복원
//serialVersionUID(버전)으로 파일을 구분.....
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {  //이 클래스는 직렬화가 될 클래스이다.
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "학생 이름: " + name + ", 나이: " + age;
    }
}

public class Ex04_Main {
    public static void main(String[] args) {
        Student s = new Student("김사과", 20);
        try (
                FileOutputStream fos = new FileOutputStream("student.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos); //Object와 함께
                ) {
            oos.writeObject(s); //직렬화 //객체를 파일로 내보낼 수 있다.
            System.out.println("객체를 파일에 저장했습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// serialVersionUID : 클래스의 버전 지정