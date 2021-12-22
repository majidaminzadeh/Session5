package com.tosanacademy;

import com.tosanacademy.deposit.Deposit;
import com.tosanacademy.deposit.GharzDeposit;
import com.tosanacademy.deposit.JariDeposit;
import com.tosanacademy.deposit.PasandazDeposit;

public class Session5 {
    public static void main(String[] args) {
//        GharzDeposit gharzDeposit = new GharzDeposit("12345", "Majid");
//        gharzDeposit.showBalance();
//        gharzDeposit.defray(10);
//        gharzDeposit.showBalance();
//
//        JariDeposit jariDeposit = new JariDeposit("987", "Ali");
//        jariDeposit.showBalance();
//        jariDeposit.withdrawal(10);

//        Deposit deposit = new Deposit("00123", "Parham");
//        deposit.defray(100);
//        deposit.withdrawal(30);

        PasandazDeposit pasandazDeposit = new PasandazDeposit("90244", "Zahra");
        pasandazDeposit.pri
        pasandazDeposit.showBalance();
        pasandazDeposit.defray(1000);
        pasandazDeposit.showBalance();
//        pasandazDeposit.withdrawal(200);
        pasandazDeposit.showBalance("1400/9/26");
    }
}
