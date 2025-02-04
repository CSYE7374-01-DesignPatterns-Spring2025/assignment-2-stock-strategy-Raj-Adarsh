package edu.neu.csye7374;

public interface PriceStrategy {
    double calculateNewPrice(double currentPrice, double bid);   
}
