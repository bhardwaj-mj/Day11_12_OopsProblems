package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner inputAmount=new Scanner(System.in);
        System.out.print("Enter the amount you want to withdraw from your account:$");
        int amount=inputAmount.nextInt();
        Account account=new Account();
        account.debit(amount);
        System.out.println("Remaining balance in your account is: $"+account.balance);
    }
}
