package org.example;

public class BankAccount {
    private Double amount;

    public void setAmount (Double amount) {
        this.amount = amount;
    }
    // остаток на счете

    public Double getAmount() {
        return amount;
    } //- возвращает текущий остаток на счете


    //- положить деньги на счет
    public void deposit(double sum) {
        amount = amount + sum ;
        System.out.println( " You put money into account : " + sum);
    }

    //- снимает указанную сумму со счета.

    public void withDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("Withdrawal NOT possible, insufficient FUNDS : ", amount);
        } else {
            amount = amount - sum;
            System.out.println("You withdraw : " + sum);

        }



    }

}
