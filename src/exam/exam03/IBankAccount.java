package exam.exam03;

public interface IBankAccount {

    void deposit(String accountNumber, double amount);  // 주어진 계좌에 입금하는 메서드

    void withdraw(String accountNumber, double amount); // 주어진 계좌에서 출금하는 메서드

    void deposit(double amount);

    void withdraw(double amount);
}
