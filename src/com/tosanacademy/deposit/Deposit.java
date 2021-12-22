package com.tosanacademy.deposit;

public abstract class Deposit {
    private String depositNumber;
    private String customer;
    private int balance;

    public Deposit(){

    }

    public Deposit(String depositNumber, String customer){
        setCustomer(customer);
        setDepositNumber(depositNumber);
    }

    public abstract String getTitle();

    // no child can override this method
    public final void showBalance(){
        System.out.println(getTitle() + " " + getDepositNumber() + " " + getBalance());
    }

    // overload
    public void showBalance(String date){
        System.out.println(getTitle() + " " + getDepositNumber() + " until " + date + " is " + getBalance());
    }

    public void defray(int balance){
        if(balance >= 0){
            setBalance(getBalance() + balance);
        } else {
            System.out.println("Invalid balance");
        }
    }

    public void withdrawal(int balance){
        if(balance >= 0){
            if(getBalance() >= balance){
                setBalance(getBalance() - balance);
            } else {
                System.out.println("Deposit balance is not enough");
            }
        } else {
            System.out.println("Invalid balance");
        }
    }

    protected void setBalance(int balance) {
        if(balance >= 0){
            this.balance = balance;
        }
    }

    protected void setCustomer(String customer) {
        this.customer = customer;
    }

    protected void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    protected int getBalance() {
        return balance;
    }

    protected String getCustomer() {
        return customer;
    }

    protected String getDepositNumber() {
        return depositNumber;
    }
}
