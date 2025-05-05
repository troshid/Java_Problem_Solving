package com.essential.problem.solving;

import java.util.Scanner;

public class NumberTypeChecker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            try {
                double number = Double.parseDouble(input);

                if (number == Math.floor(number)) {
                    System.out.println("Integer");
                } else {
                    System.out.println("Decimal");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format.");
            }

            scanner.close();
        }
    }
