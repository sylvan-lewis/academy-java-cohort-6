package com.bptn.course.hello;

public class Stock {

    // Create instance variables 
   private String tickerSymbol;
   private String companyName;
   private int price;
   private double percentChange;
   private int totalShares;
   private long marketCap;
    // Constructor 
    public Stock(String tickerSymbol, String companyName, int price, int totalShares){
    //thsi will convert to toUpperCase
    this.tickerSymbol = tickerSymbol.toUpperCase();
    this.companyName = companyName;
    this.price = price;
    this.totalShares = totalShares;
    this.percentChange = 0.0;
    // this will be the product of totalShares and price, in a private method
    this.marketCap = (long) calculatemarketCap();
    }

    private double calculatemarketCap(){
        return totalShares * price;
    }
    
 // Adjust the price and recalculate percentChange and marketCap
    public void adjustPrice(int change){
         // Update the price with the change
        // Calculate the percentChange based on the original price
        this.price = change + price;
        this.percentChange = ((double) (change) / this.price) * 100;
        // Recalculate the marketCap
        marketCap = totalShares * price;
    }
    
    
    public String toString() {
        return "Ticker Symbol: " + tickerSymbol + "\n" +
                "Company: " + companyName + "\n" +
                "Current Price: $" + price + " (" + percentChange + "%)" + "\n" +
                "Market Cap: $" + marketCap;
        }

    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}
