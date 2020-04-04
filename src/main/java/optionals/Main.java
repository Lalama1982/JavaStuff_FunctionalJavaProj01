package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String strValue = "not \"Default Value\"";

        // "Optional", "orElseGet" based on nullity of variable "strValue"
        Object value = Optional.ofNullable(strValue).orElseGet(() -> "Default Value");
        System.out.println(">> \"Optional\"-ofNullable/orElseGet << " + value + "\n");

        // "Optional", "orElseThrow" based on nullity of variable "strValue"
        strValue = null;
        value = Optional.ofNullable(strValue).orElseThrow(
                () -> new IllegalStateException("\n>> \"Optional\"-ofNullable/orElseThrow << Exception... \n"));
        // System.out.println(">> \"Optional\"-ofNullable/orElseThrow << " + value);

        // "Optional", "ifPresentOrElse" based on nullity of variable "intValue"
        /*
        Integer intValue = 343;
        Optional.ofNullable(intValue)
                .ifPresentOrElse(flag -> system.out.println("Variable \"intValue\" is Present: " + intValue), () -> {
                    system.out.println("Variable \"intValue\" is NOT Present");
                });

        Optional<Integer> op = Optional.of(9455);
        op.ifPresentOrElse(value3 -> {
            System.out.println("Value is present, its: " + value3);
        }, () -> {
            System.out.println("Value is empty");
        });
        */

        // "Optional", :: "ifPresent" based on variable "opIntg"
        // Optional<Integer> opIntg = Optional.empty();
        Optional<Integer> opIntg = Optional.of(1234);
        opIntg.ifPresent(value2 -> {
            System.out.println("\n>> \"Optional\"-ifPresent :: Variable \"opIntg\" is Present: " + value2 + "\n");
        });
    }
}