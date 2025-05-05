import java.util.Scanner;

public class BooleanOpposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a boolean value (true/false): ");
        boolean inputValue = scanner.nextBoolean();

        boolean oppositeValue = !inputValue;
        System.out.println("The opposite value is: " + oppositeValue);

        scanner.close();
    }
}
