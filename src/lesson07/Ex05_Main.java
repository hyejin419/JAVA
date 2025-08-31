package lesson07;
//HashMap
import java.util.HashMap;
import java.util.Map;

public class Ex05_Main {
    public static void main(String[] args) {
        HashMap<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("김사과", 90);
        scoreMap.put("반하나", 85);
        scoreMap.put("오렌지", 95);
        scoreMap.put("이메론", 82);
        scoreMap.put("배애리", 92);

        System.out.println(scoreMap.entrySet());
        for (Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + "점");
        }

        String name = "오렌지";
        System.out.println(name + "의 점수: " + scoreMap.get(name));

        scoreMap.put("김사과", 100);
        System.out.println("김사과의 점수 수정 후: " + scoreMap.get("김사과") + "점");

        scoreMap.remove("반하나");
        for (Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
            //반하나 = 85
            System.out.println(entry.getKey() + " : " + entry.getValue() + "점");
        }

        System.out.println("전체 학생 수: " + scoreMap.size() + "명");
    }
}
