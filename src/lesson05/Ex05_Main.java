package lesson05;
//인터페이스와 다형성 활용
interface Cleaner {
    void clean();
}

interface Cooker {
    void cook();
}

interface Singer {
    void sing();
}

interface Dancer {
    void dance();
}

abstract class Robot {
    String modelName;

    public Robot(String modelName) {
        this.modelName = modelName;
    }

    public void identify() {
        System.out.println("🤖 안녕하세요! 저는 " + modelName + " 로봇입니다.");
    }
}

class MultiRobot extends Robot implements Cleaner, Cooker, Singer, Dancer {  //implements: 구현하여 사용

    public MultiRobot(String modelName) {
        super(modelName);
    }

    @Override
    public void clean() {
        System.out.println("🧹 [" + modelName + "] 청소를 시작합니다.");
    }

    @Override
    public void cook() {
        System.out.println("🍳 [" + modelName + "] 요리를 시작합니다.");
    }

    @Override
    public void sing() {
        System.out.println("🎵 [" + modelName + "] 노래를 부릅니다.");
    }

    @Override
    public void dance() {
        System.out.println("💃 [" + modelName + "] 멋지게 춤을 춥니다!");
    }
}


public class Ex05_Main {
    public static void performFunction(Cleaner cleaner) { //Cleaner: 인터페이스  //다형성 활용
        cleaner.clean();
    }
    public static void performFunction(Cooker cooker) {
        cooker.cook();
    }
    public static void performFunction(Singer singer) {
        singer.sing();
    }
    public static void performFunction(Dancer dancer) {
        dancer.dance();
    }

    public static void main(String[] args) {
        MultiRobot roboX = new MultiRobot("Robo-X");
        roboX.identify();

        System.out.println("\n[일반 호출]");
        roboX.clean();
        roboX.cook();
        roboX.sing();
        roboX.dance();

        System.out.println("\n[다형성 활용: 기능별 인터페이스로 호출]");
        performFunction((Cleaner) roboX);
        performFunction((Cooker) roboX);
        performFunction((Singer) roboX);
        performFunction((Dancer) roboX);
    }
}

/*
1. 인터페이스
- 각각 청소, 요리, 노래, 춤 기능을 정의한 추상적인 계약입니다.
- implements 키워드를 통해 클래스를 만들 때 이 기능들을 구현(override) 해야 합니다.

2. 추상클래스(Robot)
- abstract이므로 직접 객체를 만들 수는 없습니다.
- 공통 속성(모델 이름)과 동작(identify)을 포함합니다.

3. MultiRobot 클래스
- Robot 클래스를 상속하고
- 4개의 인터페이스를 모두 구현합니다.
- 다양한 기능을 하나의 클래스에 담아낸 다중 인터페이스 구현 예시입니다.

다형성 활용
- 인터페이스 타입으로 메서드를 정의함으로써, 어떤 객체든 해당 인터페이스를 구현했다면 호출 가능합니다.
- MultiRobot은 모든 인터페이스를 구현했기 때문에 아래처럼 캐스팅해서 호출 가능합니다:
        performFunction((Cleaner) roboX);

<학습 포인트>
| 개념         | 설명                       |
| ---------- | ------------------------ |
| 인터페이스      | 공통 기능 정의, 다형성의 핵심        |
| 추상 클래스     | 공통 필드/메서드를 자식 클래스에 전달    |
| implements | 여러 인터페이스를 동시에 구현 가능      |
| 다형성        | 같은 메서드가 다양한 객체에서 다르게 실행됨 |

*/