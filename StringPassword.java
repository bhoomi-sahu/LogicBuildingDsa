import java.util.Scanner;

public class StringPassword {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        boolean hasDigit = false;

        // Rule 1: Check length
        if (password.length() >= 8) {
            
            // Rule 2: Check for at least one digit
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasDigit = true;
                    break; 
                }
            }

            if (hasDigit) {
                System.out.println(" Password is valid.");
            } else {
                System.out.println(" Invalid: Password must contain at least one digit.");
            }
            
        } else {
            System.out.println(" Invalid: Password must be at least 8 characters long.");
        }

        sc.close();
    }
}
