package com.greenleaf.main;

import com.greenleaf.functionalinterfaces.RawMapper;

/**
 * Created by User on 10/12/2019.
 */
public class Main_ConvertWithCustomInterface {

    public static void main(String[] args){

        // Define the implementation of the custom FunctionalInterface RawMapper
        RawMapper<String, Integer, NumberFormatException> strMapper = x -> {
            Integer numberInt = Integer.parseInt(x);
            System.out.println("Converted String to Integer: " + numberInt);
            return numberInt;
        };

        System.out.println("Invoking mapper functional interface...");

        // Invoke with a valid input
        convert("10",strMapper);

        // Invoke with an invalid input - expect some exception to be thrown.
        convert("*",strMapper);
    }

    // Helper method to execute the function being passed
    private static <I> void convert(I input, RawMapper mapper) {
        try {
            mapper.convert(input);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
