import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        String aStr = ValidInput.validateInput(scanner);

        System.out.println("Enter the second number:");
        String bStr = ValidInput.validateInput(scanner);

        int a = Math.abs(Integer.parseInt(aStr)) > Math.abs(Integer.parseInt(bStr)) ? Math.abs(Integer.parseInt(aStr))
                : Math.abs(Integer.parseInt(bStr));
        int b = a == Math.abs(Integer.parseInt(aStr)) ? Math.abs(Integer.parseInt(bStr))
                : Math.abs(Integer.parseInt(aStr));

        int c = b == 0 ? a : Calculation.calculateRemainder(a, b, b);

        System.out.println("The greatest common divisor of " + a + " and " + b + " is: " + c);
    }
}