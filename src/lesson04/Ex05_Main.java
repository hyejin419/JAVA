package lesson04;

class Account {
    private int balance = 0;

    public void deposit(int amount) {
        if(amount > 0) balance += amount;
    }

    public int getBalance() {
        return balance;
        //getBalance(): 현재 잔액을 외부에 알려주는 Getter 메서드
    }
}

public class Ex05_Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000);
//        account.balance = 10000
        System.out.println("잔액: " + account.getBalance());
    }
}
