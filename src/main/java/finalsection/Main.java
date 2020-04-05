package finalsection;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        System.out.println("[callBackConsumer] :: Test Case#1");
        callBackConsumer("John", "Montana", value -> {
            System.out.println("No last name provided for " + value);
        });

        System.out.println("\n[callBackConsumer] :: Test Case#2");
        callBackConsumer("Alex", null, value -> {
            System.out.println("No last name provided for " + value);
        });

        System.out.println("\n[callBackRunnable] :: Test Case#1");
        callBackRunnable("Alex", null, () -> {
            System.out.println("No last name provided");
        });
    }

    /*
     * //JS callback function function func01(firstName, lastName, callback){
     * console.log(firstName); if(lastName){ console.log(lastName); } else {
     * callback(); } } // calling from console: func01("John", null, func02()
     * {console.log("\"func02\" is called")})
     */

    static void callBackConsumer(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void callBackRunnable(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
}