package functionalinterface;

import java.util.function.Consumer;
import java.util.function.BiConsumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "+61403287315");

        // Normal Java function
        // greetCustomer(new Customer("Maria", "+61403287315"));
        greetCustomer(maria);
        // Using Consumer functional interface
        greetCustomerConsumer.accept(maria);

        // Normal Java function: Dual Args
        greetCustomerDualArgs(maria, false);
        // Using BiConsumer functional interface
        greetCustomerBiConsumer.accept(maria, false);

    }

    // Normal Java Function
    static void greetCustomer(Customer customer) {
        System.out.println(
                "NORMAL_JAVA:: Customer: " + customer.customerName + " Phone Number: " + customer.customerPhoneNumber);
    }

    // Normal Java Function; dual arguments
    static void greetCustomerDualArgs(Customer customer, boolean showPhoneNumber) {
        System.out.println("NORMAL_JAVA(DUAL ARGs):: Customer: " + customer.customerName + " Phone Number: "
        + (showPhoneNumber ? customer.customerPhoneNumber : "*******"));
    }

    // "Functional Consumer" function
    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println(
            "FUNC_CONSUMER:: Customer: " + customer.customerName + " Phone Number: " + customer.customerPhoneNumber);

    // "Functional BiConsumer" function
    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) -> 
            System.out.println("BIFUNC_CONSUMER:: Customer: " + customer.customerName + " Phone Number: "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "*******"));

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

    }

}