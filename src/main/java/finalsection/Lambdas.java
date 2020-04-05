package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        Function<String, String> upperCaseNameNormal = name -> name.toUpperCase(); 
        // Function<String, String> upperCaseName02 = name -> String::toUpperCase;

        BiFunction<String, Integer, String> upperCaseNameBiFunc = (name,age) -> {
            if (name.isEmpty())
                throw new IllegalArgumentException("");
                System.out.println(age);
            return name.toUpperCase();
        };
        System.out.println("[LAMBDA-BIFUNCTION] :: "+upperCaseNameBiFunc.apply("Alex", 20));
        System.out.println("\n[LAMBDA-NORMAL] :: "+upperCaseNameNormal.apply("Alex"));
    }
       
}