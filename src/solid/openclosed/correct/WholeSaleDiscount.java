package solid.openclosed.correct;

public class WholeSaleDiscount  extends DiscountCalculator {
    public double calculateDiscount(double price) {
        int FACTOR = 3;
        return super.calculateDiscount(price) * FACTOR;
    }
}
