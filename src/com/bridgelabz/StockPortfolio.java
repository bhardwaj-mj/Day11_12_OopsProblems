package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockPortfolio {
    List<Stock> stockList=new ArrayList<>();
    private int portfolioSize=10;
    Stock stocks=new Stock();
    static Scanner input=new Scanner(System.in);
    public void stocksPortfolio(){
        for(int i=0;i<portfolioSize;i++){
            System.out.print("Share's Name:");
            stocks.setShareName(input.next());
            System.out.print("Enter number of shares:");
            stocks.setNumberOfShare(input.nextInt());
            System.out.print("Enter share price");
            stocks.setSharePrice(input.nextInt());
            stockList.add(stocks);
            System.out.println("Stock added to portfolio");
        }
    }
}
