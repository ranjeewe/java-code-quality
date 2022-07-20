package solid.openclosed.correct;

public class DiscountCalculator {
    public double calculateDiscount(double price) {
        double FACTOR = 0.1;
        return price * FACTOR;
    }
}