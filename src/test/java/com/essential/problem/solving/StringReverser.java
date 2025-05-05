package com.essential.problem.solving;

    public class StringReverser {


        public static String reverseString(String input) {
            String reversed = "";


            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += input.charAt(i);
            }

            return reversed;
        }

        public static void main(String[] args) {

            String input1 = "hello World";
            String input2 = "Taspia Roshid Manna";


            System.out.println("Original: " + input1 + " | Reversed: " + reverseString(input1));
            System.out.println("Original: " + input2 + " | Reversed: " + reverseString(input2));
        }
    }
