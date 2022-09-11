package org.example;

public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAmount(150.00);
        bankAccount.deposit(20000);
        while (true) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage() + "  " + e.getRemainingAmount());
                try {
                    bankAccount.getAmount();
                    break;

                } finally {
                    System.out.println("You can withdraw : " + bankAccount.getAmount() +
                    "\nYou withdraw: " + bankAccount.getAmount());
                }
            }
        }
    }
}













