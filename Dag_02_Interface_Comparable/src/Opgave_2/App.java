package Opgave_2;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Mikkel", "Kofod", 24));
        customers.add(new Customer("Oliver", "Malthesen", 28));
        customers.add(new Customer("Morten", "Blankholm", 25));
        customers.add(new Customer("Onkel", "Reje", 67));
        customers.add(new Customer("Esben", "ESHA", 40));
        Customer customer1 = new Customer("Arthur", "Chikorowsky", 45);

        Customer[] customerList = customers.toArray(new Customer[0]);

        System.out.println("\n" + lastCustomer(customerList));

        for (Customer customer : customerList) {
            System.out.println(customer);
        }

        System.out.println(" ------------------------------------ \n");

        for (Customer customer : afterCustomer(customerList, customer1)) {
            System.out.println(customer);
        }

        System.out.println(Arrays.toString(afterCustomer(customerList, customer1)));
    }

    public static Customer lastCustomer(Customer[] customers) {
        //Arrays.sort(customers)
        //return customers[customers.length - 1]

        //en metode, der givet et array af Customers, returnerer den Customer der kommer til sidst iht. deres naturlige ordning.
        Customer lastCustomer = null;

        for (Customer customer : customers) {
            if (lastCustomer == null || customer.compareTo(lastCustomer) > 0) {
                lastCustomer = customer;
            }
        }
        return lastCustomer;
    }

    //Tilføj endnu en metode, der givet et array af Customers og et Customer-objekt, returnerer et nyt
    //array af kunder, bestående af de kunder, der kommer efter den angivne Customer i input-arrayet.
    public static Customer[] afterCustomer(Customer[] customers, Customer customer) {
        Arrays.sort(customers);
        /** Chattens anbefaling for at komme af med nulls men stadig bruge array: */
        //Temp array med størst mulige længde
        Customer[] temp = new Customer[customers.length];

        //Lægge alle Customers ind i en midlertidig array (inklusiv resterende pladser (nulls), hvis ikke vi tjekker først)
        int count = 0;
        for (Customer customer1 : customers) {
            if (customer1 != null && customer1.compareTo(customer) > 0) {
                temp[count] = customer1;
                count++;
            }
        }

        Customer[] afterCustomerFinal = new Customer[count];

        int i = 0;
        for (Customer customer1 : temp) {
            //Har brug for tjekket igen, da jeg ellers løber hele temp igennem, som er meget større end Final[]!
            if (customer1 != null) {
                afterCustomerFinal[i] = customer1;
                i++;
            }
        }
        return afterCustomerFinal;

        //Using a counter loop (like for (int i = 0; i < count)) is slightly faster since you’re not doing if (customer1 != null) checks,
        //but your version is more flexible and just as correct. So unless you're optimizing for performance (which you're not here),
        //this is great.
        /** ✅ Only copy the non-null elements (from 0 to count - 1)
         for (int i = 0; i < count; i++) {
         afterCustomerFinal[i] = temp[i];
         } */
    }

    /// CHATTEN: For at undgå nulls =
    //public static Customer[] afterCustomer(Customer[] customers, Customer customer) {
    //    Arrays.sort(customers);
    //
    //    List<Customer> filtered = new ArrayList<>();
    //    for (Customer c : customers) {
    //        if (c.compareTo(customer) > 0) {
    //            filtered.add(c);
    //        }
    //    }
    //
    //    return filtered.toArray(new Customer[0]);
    //}

}
