import java.util.Scanner;

public class FloatToDoubleConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();


        double doubleValue = floatValue;

        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);


        float testFloat = 1.23456789f;
        double testDouble = testFloat;
        System.out.println("\n--- Precision Test ---");
        System.out.println("Test float: " + testFloat);
        System.out.println("Converted double: " + testDouble);
    }
}
