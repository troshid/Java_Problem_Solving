package com.essential.problem.solving;

    import java.util.ArrayList;
import java.util.Scanner;

    public class StoreAndPrintNames {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            ArrayList<String> names = new ArrayList<>();


            System.out.println("Enter 5 names:");

            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter name " + i + ": ");
                String name = scanner.nextLine();
                names.add(name);
            }


            System.out.println("\nNames entered:");
            for (String name : names) {
                System.out.println(name);
            }


            scanner.close();
        }
    }
