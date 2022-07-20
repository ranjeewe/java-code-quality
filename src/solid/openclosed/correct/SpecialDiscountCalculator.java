package solid.openclosed.correct;

public class SpecialDiscountCalculator  extends DiscountCalculator {
    public double calculateDiscount(double price) {
        int FACTOR = 5;
        return super.calculateDiscount(price) * FACTOR;
    }
}