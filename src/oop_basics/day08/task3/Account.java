package oop_basics.day08.task3;

public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = (balance > 0) ? balance : 0;
    }
    public void deposit(double amount) {
        this.balance += (amount > 0) ? amount : 0;
    }
    public void printBalance() {
        System.out.printf("Баланс : %.2f\n", balance);
    }
}
