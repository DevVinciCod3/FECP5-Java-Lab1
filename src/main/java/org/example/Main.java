package org.example;
import java.util.*;
import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input temperature in celcius: ");
        double cel = s.nextDouble();

        double fahr = cel * (9/5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahr);


    }
}