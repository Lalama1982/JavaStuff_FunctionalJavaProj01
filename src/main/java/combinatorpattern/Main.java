package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "alice@gmail.com", "+61403287315", LocalDate.of(2000, 1, 1));

        CustomerValidatorService validateValues = new CustomerValidatorService();
        boolean retVal = validateValues.isValid(customer);
        System.out.println("Validation Status: "+retVal);
        //System.out.println(new CustomerValidatorServiclsce().isValid(customer));



    }

}