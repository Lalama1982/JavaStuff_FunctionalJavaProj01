package functionalinterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment = incrementByOneStdFunction(0);
        System.out.println("via Std Function calling .... [incr from 0] " + increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println("via utilFunction calling .... [incr from 1] " + increment2);

    }

    // Use of util.function, package
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    // Std function
    static int incrementByOneStdFunction(int number) {
        return number + 1;
    }

}