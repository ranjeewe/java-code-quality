package solid.openclosed.correct;

public class PriceCalculator {
    private static final int NORMAL = 1;
    private static final int WHOLE_SALE = 2;
    private static final int SPECIAL = 3;

    public static void main(String[] args) {
        double price = calculatePrice();
        DiscountCalculator discountCalculator = getDiscountCalculator(WHOLE_SALE);
        System.out.println("Price " + (price - discountCalculator.calculateDiscount(price)));
    }

    private static DiscountCalculator getDiscountCalculator(int discountType) {
        switch (discountType) {
            case WHOLE_SALE:
                return new WholeSaleDiscount();
            case SPECIAL:
                return new SpecialDiscountCalculator();
            default:
                return new DiscountCalculator();
        }
    }

    private static double calculatePrice() {
        //calculation
        return 100.00;
    }
}