package oop_basics.day08.task3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = (interestRate >= 0 && interestRate <= 100) ? interestRate : 0;
    }
    public void addInterest() {
        balance += balance * interestRate / 100;
    }
    @Override
    public void printBalance() {
        System.out.printf("Сберегательный счет, баланс: %.2f, процентная ставка: %.1f%n", balance, interestRate);
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
        savingsAccount.printBalance();
        savingsAccount.addInterest();
        savingsAccount.printBalance();
    }

}
