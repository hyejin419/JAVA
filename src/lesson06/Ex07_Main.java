package lesson06;

class InvalidUserException extends RuntimeException {
    public InvalidUserException(String message) {
        super(message);
    }
}
class UncheckedException {
    public static void validateUserName (String name) {
        if(name == null || name.isEmpty()){
            throw new InvalidUserException("사용자 이름은 비어 있을 수 없습니다.");
        }
        System.out.println("사용자 이름: " + name);
    }
}

public class Ex07_Main {
    public static void main(String[] args) {
 //       UncheckedException ue = new UncheckedException
        try {
            UncheckedException.validateUserName("");
        } catch (InvalidUserException e) {
            System.out.println("예외 처리됨: " + e.getMessage());
        }
    }
}
