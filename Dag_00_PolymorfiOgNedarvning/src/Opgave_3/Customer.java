package Opgave_3;

import java.time.LocalDate;
import java.util.*;

/**
 * Models a Customer with Orders.
 */
public class Customer {
    private String name;
    private LocalDate birthday;
    //Link
    private List<Order> orders;
    private Discount discount;

    public Customer(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
        orders = new ArrayList<Order>();
    }

    public List<Order> getOrders() {
        return new ArrayList<Order>(orders);
    }

    public void addOrder(Order order) {
        if (!orders.contains(order)) {
            orders.add(order);
        }
    }

    public void removeOrder(Order order) {
        if (orders.contains(order)) {
            orders.remove(order);
        }
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Discount getDiscount() {
        return discount;
    }

    //c. totalBuy til klassen Customer der beregner den samlede pris for alle de ordrer en
    //kunde har.
    public double totalBuy() {
        double totalCost = 0;

        for (Order order : orders) {
            totalCost += order.getOrderPrice();
        }
        return totalCost;
    }

    //3
    //Derudover skal en Customer nu svare på, hvad dens samlede pris er, når der gives en
    //samlet rabat, på alle de ordrer en kunde har (metoden totalBuyWithDiscount).
    public double totalBuyWithDiscount() {
        double totalCost = totalBuy();
        if (discount != null) {
            totalCost -= discount.getDiscount(totalCost);
        }
        return totalCost;
    }

}
