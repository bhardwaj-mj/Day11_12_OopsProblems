package com.bridgelabz;

public class Stock {
    private String shareName;
    private int numberOfShare;
    private int sharePrice;
    public String getShareName() {
        return shareName;
    }
    public int getNumberOfShare() {
        return numberOfShare;
    }
    public int getSharePrice() {
        return sharePrice;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public Stock() {
    }

    public Stock(String shareName, int numberOfShare, int sharePrice) {
        this.shareName = shareName;
        this.numberOfShare = numberOfShare;
        this.sharePrice = sharePrice;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "shareName='" + shareName + '\'' +
                ", numberOfShare=" + numberOfShare +
                ", sharePrice=" + sharePrice +
                '}';
    }
}
