package lesson06;

class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}

public class Ex06_Main {
    public static void checkSocre(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("점수는 0에서 100사이여야 합니다.");
        }
        System.out.println("유효한 점수입니다.: " + score);
    }
    public static void main(String[] args) {
        try{
            checkSocre(150); //예외 발생
        } catch (InvalidScoreException e) {
            System.out.println("예외 처리됨: " + e.getMessage());
        }
    }
}
