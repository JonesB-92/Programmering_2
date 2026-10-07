package Opgave_3;

public class FixedDiscount implements Discount {
    private int fixedDiscount;
    private int discountLimit;

    public FixedDiscount(int fixedDiscount, int discountLimit) {
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }

    public int getFixedDiscount() {
        return fixedDiscount;
    }

    public void setFixedDiscount(int fixedDiscount) {
        this.fixedDiscount = fixedDiscount;
    }

    public int getDiscountLimit() {
        return discountLimit;
    }

    public void setDiscountLimit(int discountLimit) {
        this.discountLimit = discountLimit;
    }

    @Override
    public double getDiscount(double price) {
        // næste kunde får an fast rabat på 250 kroner, når han har ordre for mere end 1000
        if (price > discountLimit) {
            return fixedDiscount;
        } else return 0;
    }

}
