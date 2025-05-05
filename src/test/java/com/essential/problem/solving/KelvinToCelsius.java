package com.essential.problem.solving;

    import java.util.Scanner;

    public class KelvinToCelsius {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter temperature in Kelvin: ");
            double kelvin = scanner.nextDouble();

            if (kelvin < 0) {
                System.out.println("Error: Temperature cannot be below absolute zero (0 K).");
            } else {
                double celsius = kelvin - 273.15;
                System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);
            }

            scanner.close();
        }
    }
