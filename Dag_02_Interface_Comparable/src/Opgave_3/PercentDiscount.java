package Opgave_3;

public class PercentDiscount implements Discount {
    private int discountPercentage;

    public PercentDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getDiscount(double price) {
        //d. Udvid anvendelsesklassen fra spørgsmål a) så første kunde får en PercentDiscount på 15%
        return price * (discountPercentage / 100.0);
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    //Olivers
    public double getDiscount1(double price) {
        return ((double) discountPercentage / 100) * price;
    }
}
