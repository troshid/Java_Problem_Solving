import java.util.Scanner;

public class StringToNumberConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (as a string): ");
        String input = scanner.nextLine();

        if (input.contains(".")) {
            try {
                double convertedDouble = Double.parseDouble(input);

                System.out.println("Converted to double: " + convertedDouble);

            } catch (NumberFormatException e) {
                System.out.println("Invalid double number format.");
            }
        } else {

            try {
                int convertedInt = Integer.parseInt(input);
                System.out.println("Converted to integer: " + convertedInt);

            } catch (NumberFormatException e) {
                System.out.println("Invalid integer number format.");
            }
        }

        scanner.close();
    }
}
