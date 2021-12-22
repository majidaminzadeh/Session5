package com.tosanacademy.deposit;

public class GharzDeposit extends Deposit {
    private final String title = "قرض الحسنه";

    public GharzDeposit(){
    }

    public GharzDeposit(String depositNumber, String customer) {
        super(depositNumber, customer);
    }

    public String getTitle(){
        return title;
    }
}
