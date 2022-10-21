package com.bridgelabz;

import java.util.Scanner;

public class Account {
    long balance=99999;
    public long debit(int amount){
        if(balance>=amount){
            balance=balance-amount;
            System.out.println("$"+amount+" debited from your account");
            return balance;
        }
        else{
            System.out.println("Debit amount exceeded account balance");
            return balance;
        }
    }
}
