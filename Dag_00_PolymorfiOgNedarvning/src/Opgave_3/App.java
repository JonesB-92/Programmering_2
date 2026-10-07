package Opgave_3;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        //a. Programmér en afprøvningsklasse der opretter:
        //• 5 Products
        //• 2 Customers
        //Den første Customer skal have to Orders tilknyttet, og den anden skal have fire. Hver Order
        //skal indeholde mindst to OrderLines.
        Product laptop = new Product(2, "Bærbar Computer", 2400);
        Product headset = new Product(56, "Headset Pro 2000", 500);
        Product stressBall = new Product(420, "Stressbolde", 20);
        Product huawei = new Product(1230, "Huawei", 100);
        Product backpack = new Product(123, "Rygsæk XXL", 750);

        Customer oliver = new Customer("Oliver", LocalDate.of(1997, 01, 12));
        Customer morten = new Customer("Morten", LocalDate.of(2000, 07, 7));

        Order order1 = new Order(1);
        Order order2 = new Order(2);
        Order order3 = new Order(3);
        Order order4 = new Order(4);
        Order order5 = new Order(5);

        order1.createOrderLine(1, laptop);
        order1.createOrderLine(1, stressBall);

        order2.createOrderLine(4, stressBall);
        order2.createOrderLine(2, backpack);

        order3.createOrderLine(1, backpack);
        order3.createOrderLine(1, huawei);
        order3.createOrderLine(1, headset);
        order4.createOrderLine(4, headset);
        order4.createOrderLine(10, stressBall);
        order5.createOrderLine(12, stressBall);
        order5.createOrderLine(4, laptop);

        oliver.addOrder(order1);
        oliver.addOrder(order2);

        morten.addOrder(order4);
        morten.addOrder(order3);
        morten.addOrder(order2);
        morten.addOrder(order5);

        //b. Det skal være muligt at beregne den samlede pris for alle de ordrer en kunde har. Der skal
        //derfor tilføjes følgende metoder til modellen:
        //a. getOrderLinePrice til klassen OrderLine der beregner prisen for ordrelinjen
        //b. getOrderPrice på klassen Order der beregner ordrens pris (summen af priserne
        //for ordrelinjerne)
        //c. totalBuy til klassen Customer der beregner den samlede pris for alle de ordrer en
        //kunde har.
        System.out.println("--------------------------------------- \n");

        System.out.println(oliver.totalBuy());
        System.out.println(morten.totalBuy());

        //d. Udvid anvendelsesklassen fra spørgsmål a) så første kunde får en PercentDiscount på 15%
        //og næste kunde får an fast rabat på 250 kroner, når han har ordre for mere end 1000
        //kroner.
        Discount fixeddiscount = new FixedDiscount(250, 1000);
        Discount percentDiscount = new PercentDiscount(15);

        oliver.setDiscount(fixeddiscount);
        morten.setDiscount(percentDiscount);

        System.out.println("--------------------------------------- \n");


        System.out.println(oliver.totalBuyWithDiscount());
        System.out.println(morten.totalBuyWithDiscount());

    }
}
