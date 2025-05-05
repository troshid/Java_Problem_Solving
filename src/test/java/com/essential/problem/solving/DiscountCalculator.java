package com.essential.problem.solving;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original product price: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = scanner.nextDouble();

        double discountAmount = (originalPrice * discountPercent) / 100;

        double finalPrice = originalPrice - discountAmount;

        finalPrice = Math.round(finalPrice * 100.0) / 100.0;

        System.out.println("Final price after discount: " + finalPrice);

        scanner.close();
    }
}

