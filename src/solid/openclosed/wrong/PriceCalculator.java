package solid.openclosed.wrong;

public class PriceCalculator {

    private static final int NORMAL = 1;
    private static final int WHOLE_SALE = 2;
    private static final int SPECIAL = 3;

    public static void main(String[] args) {
        double price = calculatePrice();
        double discount = calculateDiscount(price, WHOLE_SALE);
        System.out.println("Price " + (price - discount));
    }

    private static double calculateDiscount(double price, int discountType) {
        switch (discountType) {
            case WHOLE_SALE:
                return calculateDiscount(price, NORMAL) * 3;
            case SPECIAL:
                return calculateDiscount(price, NORMAL) * 5;
            default:
                return (price * 0.1);
        }
    }

    private static double calculatePrice() {
        //calculation
        return 100.00;
    }
}