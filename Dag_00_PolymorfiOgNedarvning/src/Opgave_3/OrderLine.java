package Opgave_3;

public class OrderLine {
    private int lineNumber;
    private int count;
    private Product product;

    OrderLine(int lineNumber, int count, Product product) {
        this.lineNumber = lineNumber;
        this.count = count;
        this.product = product;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public int getCount() {
        return this.count;
    }

    public Product getProduct() {
        return product;
    }

    //a. getOrderLinePrice til klassen OrderLine der beregner prisen for ordrelinjen
    public double getOrderLinePrice() {
        return product.getUnitPrice() * count;
    }
}
