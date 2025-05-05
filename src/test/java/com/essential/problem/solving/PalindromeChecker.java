package com.essential.problem.solving;

public class PalindromeChecker {


        public static boolean isPalindrome(String text) {

            text = text.toLowerCase();

            text = text.replaceAll("[^a-z0-9]", "");

            int left = 0;
            int right = text.length() - 1;

            while (left < right) {
                if (text.charAt(left) != text.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
        public static void main(String[] args) {

            String input1 = "Madam";
            String input2 = "RaceCar";
            String input3 = "level";

            System.out.println("\"" + input1 + "\" is a palindrome? " + isPalindrome(input1));
            System.out.println("\"" + input2 + "\" is a palindrome? " + isPalindrome(input2));
            System.out.println("\"" + input3 + "\" is a palindrome? " + isPalindrome(input3));
        }
    }
