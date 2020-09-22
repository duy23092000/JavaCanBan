package test16;

public class Stock {
    private String stockID;
    private String stockName;
    private double previousClosingPrice;
    private double currentPrice;


    public Stock(String stockID, String stockName){
        this.stockID = stockID;
        this.stockName = stockName;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return (currentPrice / previousClosingPrice) * 100.0;
    }
}
