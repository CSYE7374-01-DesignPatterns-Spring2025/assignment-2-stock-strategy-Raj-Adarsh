package edu.neu.csye7374;

public class BullMarketStrategy implements PriceStrategy {
    @Override
    public double calculateNewPrice(double currentPrice, double bid) {
        // Bull market: increase price more aggressively
        return currentPrice + (bid - currentPrice) * 1.5;
    }
}
