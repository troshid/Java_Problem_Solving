package com.essential.problem.solving;

    import java.util.ArrayList;

    public class ArrayListSum {


        public static int sumArrayList(ArrayList<Integer> numbers) {
            int sum = 0;

            for (int num : numbers) {
                sum += num;
            }

            return sum;
        }

        public static void main(String[] args) {

            ArrayList<Integer> numberList = new ArrayList<>();
            numberList.add(10);
            numberList.add(20);
            numberList.add(30);
            numberList.add(40);
            numberList.add(50);


            int total = sumArrayList(numberList);
            System.out.println("The sum of the ArrayList is: " + total);
        }
    }