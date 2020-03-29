package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment = incrementByOneStdFunction(0);
        System.out.println("via Std Function calling .... [incr from 0] " + increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println("via utilFunction calling .... [incr from 1] " + increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println("via utilFunction calling .... [multiply by 10] " + multiply);

        /*
         * this was is also possible! Function<Integer, Integer>
         * addBy1AndThenMultiplyBy10 =
         * incrementByOneFunction.andThen(multiplyBy10Function);
         * System.out.println("via utilFunction calling .... [use of andThen] " +
         * addBy1AndThenMultiplyBy10.apply(3));
         */

        int vAndThen = addBy1AndThenMultiplyBy10.apply(multiply);
        System.out.println("via utilFunction calling .... [use of andThen] " + vAndThen);

        // Use of bi-functions
        System.out.println("via std bi-function replicate "+incrementByOneAndMultiply(4,10) );
        System.out.println("via std bi-function replicate [use of util] "+incrementByOneAndMultiplyBiFunction.apply(4,10) );

    }

    // Use of b-function
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (numberToIncrementByOne,
            numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

    // Std function
    // Use of util.function, package
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);

    static int incrementByOneStdFunction(int number) {
        return number + 1;
    }

}