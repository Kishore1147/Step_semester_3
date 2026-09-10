package oop.class_problems;

public class MessWallet {

    private double balance;

    public MessWallet(double openingBalance) {

        if (openingBalance < 0){
            balance = 0;
            System.out.println("Negative opening balance , Starting at 0");
        }
        else {
            balance = openingBalance;
        }
    }

    public void topup(double amount){

        if (amount <= 0){
            System.out.println("Topup rejected: Amount should be greater than 0");
        }
        else {
            balance += amount;
        }
    }

    public void deduct(double amount){

        if (amount > balance){
            System.out.println("Deduct rejected: insufficient balance");
        }
        else {
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args){
        MessWallet wallet = new MessWallet(500);
        wallet.topup(200);
        System.out.println("Balance after top-up: " + wallet.getBalance());
        wallet.deduct(1000);
        System.out.println("Final balance: " + wallet.getBalance());
    }
}