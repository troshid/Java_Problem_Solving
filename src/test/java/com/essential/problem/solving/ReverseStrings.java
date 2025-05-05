package com.essential.problem.solving;

    import java.util.ArrayList;
import java.util.Scanner;

    public class ReverseStrings {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            ArrayList<String> words = new ArrayList<>();

            System.out.println("Enter 5 strings:");


            for (int i = 0; i < 5; i++) {
                System.out.print("Enter string " + (i + 1) + ": ");
                String input = scanner.nextLine();
                words.add(input);
            }


            System.out.println("\nStrings in reverse order:");
            for (int i = words.size() - 1; i >= 0; i--) {
                System.out.println(words.get(i));
            }


            scanner.close();
        }
    }


