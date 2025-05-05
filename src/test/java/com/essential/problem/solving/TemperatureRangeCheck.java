package com.essential.problem.solving;

import java.util.Scanner;

public class TemperatureRangeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");

        double temperature = scanner.nextDouble();

        if (temperature >= -50 && temperature <= 50) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        scanner.close();
    }
}
