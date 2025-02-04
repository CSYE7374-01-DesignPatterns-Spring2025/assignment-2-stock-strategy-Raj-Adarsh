package edu.neu.csye7374;

public class BearMarketStrategy implements PriceStrategy {
    @Override
    public double calculateNewPrice(double currentPrice, double bid) {
        // Bear market: increase price less aggressively
        return currentPrice + (bid - currentPrice) * 0.3;
    }
}
