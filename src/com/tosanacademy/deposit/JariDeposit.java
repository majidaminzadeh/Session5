package com.tosanacademy.deposit;

public class JariDeposit extends Deposit {
    private final String title = "جاری";

    public JariDeposit(){
    }

    public JariDeposit(String depositNumber, String customer){
        super(depositNumber, customer);
    }

    public String getTitle() {
        return title;
    }
}
