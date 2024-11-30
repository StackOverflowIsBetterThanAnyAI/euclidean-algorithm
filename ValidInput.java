import java.util.Scanner;

public class ValidInput {
    public static String validateInput(Scanner scanner) {
        while (true) {
            try {
                String str = scanner.nextLine();
                Integer.parseInt(str);
                return str;
            } catch (Exception e) {
                System.out.println("Please provide a valid number");
            }
        }
    }
}
