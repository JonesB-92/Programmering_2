package Opgave_3;

import java.util.*;

public class Order {
    private int number;
    private List<OrderLine> orderLines;

    public Order(int number) {
        this.number = number;
        orderLines = new ArrayList<OrderLine>();
    }

    public int getNumber() {
        return this.number;
    }

    public void createOrderLine(int count, Product product) {
        OrderLine line = new OrderLine(orderLines.size() + 1, count, product);
        orderLines.add(line);
    }
    
    public List<OrderLine> getOrderLines() {
        return new ArrayList<OrderLine>(orderLines);
    }

    //b. getOrderPrice på klassen Order der beregner ordrens pris (summen af priserne for ordrelinjerne)
    public double getOrderPrice() {
        double sumPriceOfOrder = 0;

        for(OrderLine orderLine : orderLines) {
            sumPriceOfOrder += orderLine.getOrderLinePrice();
        }
        return sumPriceOfOrder;
    }

}
