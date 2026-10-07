package Opgave_3;

import java.time.LocalDate;
import java.time.Period;

public class AgeDiscount implements Discount {
    private LocalDate customerBDay;

    public AgeDiscount(LocalDate customerBDay) {
        this.customerBDay = customerBDay;
    }

    public LocalDate getCustomerBDay() {
        return customerBDay;
    }

    public void setCustomerBDay(LocalDate customerBDay) {
        this.customerBDay = customerBDay;
    }

    //AgeDiscount skal have kundens fødselsår med som paramenter ved oprettelse.
    //Rabatten er da en procentsats svarende til kundens alder i procent.
    @Override
    public double getDiscount(double price) {
        LocalDate currentDate = LocalDate.now();

        //År mellem currentDate og fødselsdag
        int alder = Period.between(customerBDay, currentDate).getYears();

        return price * alder / 100;
    }
}
