package com.internship.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC1001", 5000.0);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(1500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        boolean withdrawn = account.withdraw(2000.0);
        System.out.println(withdrawn ? "Withdrawal successful." : "Insufficient balance.");
        System.out.println("Final Balance: " + account.getBalance());

        try {
            account.setBalance(-100.0);
        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid balance: " + exception.getMessage());
        }
    }
}
