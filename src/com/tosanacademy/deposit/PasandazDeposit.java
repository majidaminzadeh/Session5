package com.tosanacademy.deposit;

public final class PasandazDeposit extends Deposit {
    private final String title = "پس انداز";

    public PasandazDeposit(){
    }

    public PasandazDeposit(String depositNumber, String customer){
        super(depositNumber, customer);
    }

    // implementation
    public String getTitle(){
        return title;
    }

    // override
    public void withdrawal(int balance){
        System.out.println("You can not withdrawal");
    }
    
}
