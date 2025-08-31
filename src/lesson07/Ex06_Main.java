package lesson07;
// DTO, Controller, Service, Repository 계층
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

class WordDTO {
    private String word;
    private String meaning;
    private String level;
    private LocalDate regDate;

    public WordDTO(String word, String meaning, String level) {
        this.word = word;
        this.meaning = meaning;
        this.level = level;
        this.regDate = LocalDate.now();
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

    @Override
    public String toString() {
        return "[단어]"+ word + " | 뜻: " + meaning + " | 레벨: "+ level ;
    }
}

class WordController {
    private final WordService service = new WordService();

    public void register(String word, String meaning, int levelNum) {
        String level = convertLevel(levelNum);
        if (level == null) {
            System.out.println("잘못된 레벨입니다.(1:초급, 2:중급, 3:고급");
            return;
        }
        try {
            WordDTO dto = new WordDTO(word, meaning, level);
            service.registerWord(dto);
        }catch(IllegalArgumentException e) {
            System.out.println("등록 실패: " + e.getMessage());
        }
    }
    public void printAllWords() {
        List<WordDTO> list = service.getAllWords();
        if(list.isEmpty()) {
            System.out.println("등록된 단어가 없습니다.");

        }else{
            System.out.println("등록된 단어 목록");
            for (WordDTO dto : list) {
                System.out.println(dto);
            }
        }
    }
    public void printOneWord(String word) {
        WordDTO dto = service.getWord(word);
        if(dto == null) {
            System.out.println("해당 단어가 등록되어 있지 않습니다.");
        } else {
            System.out.println(dto);
        }
    }

    private String convertLevel(int levelNum) {
        return switch (levelNum) {
            case 1 -> "초급";
            case 2 -> "중급";
            case 3 -> "고급";
            default -> null;
        };
    }
}

class WordService {
    private final WordRepository repository = new WordRepository();

    public void registerWord (WordDTO dto) {
        if(dto.getWord().isBlank() || dto.getMeaning().isBlank()) {
            throw new IllegalArgumentException("단어와 뜻은 반드시 입력해야 합니다.");
        }
        repository.save(dto);
    }
    public List<WordDTO> getAllWords() {
        return repository.findAll();
    }
    public WordDTO getWord(String word) {
        return repository.findByWord(word);
    }
}

class WordRepository {
    private final Map<String, WordDTO> wordMap = new HashMap<>();  //자료형<> 변수명 = 객체

    public void save(WordDTO dto) {
        wordMap.put(dto.getWord(), dto);
        System.out.println("저장 완료: " + dto.getWord());
        }

    public List<WordDTO> findAll() {  //value만 뽑아서 arraylist에 담기
        return new ArrayList<>(wordMap.values());
    }

    public WordDTO findByWord(String word) {  //단어하나를 받아서 객체를 불러옴
        return wordMap.get(word);
    }

}



public class Ex06_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordController controller = new WordController();

        while(true) {
            System.out.println("영어 단어 사전");
            System.out.println("1. 단어 등록");
            System.out.println("2. 전체 단어 목록 보기");
            System.out.println("3. 단어 상세 조회");
            System.out.println("0. 종료");
            System.out.print("선택: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch(choice) {
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                }
                case 1 -> {
                    System.out.print("영단어 입력: ");
                    String word = sc.nextLine();
                    System.out.print("뜻 입력: ");
                    String meaning = sc.nextLine();
                    System.out.print("레벨 선택(1: 초급, 2: 중급, 3: 고급): ");
                    int level = Integer.parseInt(sc.nextLine());
                    controller.register(word, meaning, level);
                }
                case 2 -> controller.printAllWords();
                case 3 -> {
                    System.out.print("조회할 영단어 입력: ");
                    String word = sc.nextLine();
                    controller.printOneWord(word);
                }
            }
        }
    }
}
