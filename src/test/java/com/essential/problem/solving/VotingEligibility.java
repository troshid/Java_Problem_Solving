package com.essential.problem.solving;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = scanner.nextBoolean();

        if (age >= 18 && isCitizen) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        scanner.close();
    }
}

