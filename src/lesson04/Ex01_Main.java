package lesson04;

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 나이: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  //주소 비교
        if (obj == null || getClass() != obj.getClass()) return false;  //타입비교
        Person other = (Person) obj; //강제형변환
        return this.name.equals(other.name) && this.age == other.age;  //실제값 비교
    }
}

public class Ex01_Main{
    public static void main(String[] args) {
        Person p1 = new Person("김사과", 20);
//        System.out.println(p1.toString());
        Person p2 = new Person("반하나", 25);
        Person p3 = new Person("김사과", 20);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}

/*
- toString() : 객체를 문자열로 표현할 때 호출됨(출력문에서 자동 호출)
- equals(): 두 객체의 값이 같은지 비교하기 위해 재정의
- this == obj: 주소값이 같은 경우 true
- name.equals(): 문자열 값 비교(내용 비교)
*/
