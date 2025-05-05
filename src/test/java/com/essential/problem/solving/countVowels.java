package com.essential.problem.solving;

public class countVowels {

        public static int countVowels(String input) {
            int count = 0;
            String vowels = "aeiou";

            input = input.toLowerCase();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (vowels.indexOf(ch) != -1) {
                    count++;
                }
            }

            return count;
        }

        public static void main(String[] args) {

            String input1 = "I live in Dhaka";
            int result1 = countVowels(input1);
            System.out.println("Input: \"" + input1 + "\" → Vowel Count: " + result1);

            String input2 = "My name is Taspia";
            int result2 = countVowels(input2);
            System.out.println("Input: \"" + input2 + "\" → Vowel Count: " + result2);
        }
    }
