package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*; // import#1

public class Main {
    public static void main(String[] args) {
        //Data set
        Customer customer = new Customer("Alice", "alice@gmail.com", "+64403287315", LocalDate.of(2000, 1, 1));

        CustomerValidatorService validateValues = new CustomerValidatorService();
        boolean retVal = validateValues.isValid(customer);
        System.out.println("[NORMAL JAVA] :: Validation Status (via \"CusotmerValidatorService\" Class): " + retVal);
        // System.out.println(new CustomerValidatorServiclsce().isValid(customer));

        // Using combinator pattern, (interface); enabled via the import "import#1"
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println("[COMBINATOR PATTERN] :: Validation Status (via \"CustomerRegistrationValidator\" Interface): " +result);                

        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }

}