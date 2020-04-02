package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        String validPhoneNumber = "+61403287315";
        String invalidPhoneNumber = "+64403287315";

        // Using STD/Normal Java functionality
        System.out.println(
                "[NORMAL JAVA]:: Phone#: " + validPhoneNumber + " Status: " + isPhoneNumberValid(validPhoneNumber));
        System.out.println(
                "[NORMAL JAVA]:: Phone#: " + invalidPhoneNumber + " Status: " + isPhoneNumberValid(invalidPhoneNumber));

        // Using PREDICATE Ffunctionality
        System.out.println("[PREDICATE FUNC]:: Phone#: " + validPhoneNumber + " Status: "
                + isPhoneNumberValidPredicate.test(validPhoneNumber));
        System.out.println("[PREDICATE FUNC]:: Phone#: " + invalidPhoneNumber + " Status: "
                + isPhoneNumberValidPredicate.test(invalidPhoneNumber));

        System.out.println("[PREDICATE FUNC]:: Phone No AND Contains Number 3 ? "
                + isPhoneNumberValidPredicate.and(containsNumber3).test(validPhoneNumber));
        System.out.println("[PREDICATE FUNC]:: Phone No OR Contains Number 3 ? "
                + isPhoneNumberValidPredicate.or(containsNumber3).test(validPhoneNumber));
    }

    // Normal java function
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+61") && phoneNumber.length() == 12;
    }

    // Predicate Function
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("+61")
            && phoneNumber.length() == 12;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

}