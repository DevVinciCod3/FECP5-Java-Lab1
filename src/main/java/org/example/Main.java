package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input temperature in celcius: ");
        double cel = s.nextDouble();

        double fahr = cel * 1.8 + 32;

        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahr);
    }
}
