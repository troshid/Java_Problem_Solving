package com.essential.problem.solving;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        int time = scanner.nextInt();

        double amount = principal * Math.pow((1 + rate / 100), time);

        amount = Math.round(amount * 100.0) / 100.0;

        System.out.println("Compound interest amount after " + time + " years: " + amount);

        scanner.close();
    }
}

