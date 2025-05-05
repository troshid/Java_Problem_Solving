package com.essential.problem.solving;

    import java.util.Scanner;

    public class VowelOrConsonant {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter a single alphabet character: ");
            char ch = scanner.next().charAt(0);


            char letter = Character.toLowerCase(ch);


            if (!Character.isLetter(letter)) {
                System.out.println("Invalid input! Please enter an alphabet letter.");
            } else {

                switch (letter) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println("Vowel");
                        break;
                    default:
                        System.out.println("Consonant");
                }
            }

            scanner.close();
        }
    }