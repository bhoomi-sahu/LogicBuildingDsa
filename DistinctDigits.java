import java.util.Scanner;

public class DistinctDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        // Check if number is 3-digit
        if (num < 100 || num > 999) {
            System.out.println("Please enter a valid 3-digit number");
        } else {
            int d1 = num % 10;        // last digit
            int d2 = (num / 10) % 10; // middle digit
            int d3 = num / 100;       // first digit

            if (d1 != d2 && d2 != d3 && d1 != d3) {
                System.out.println("All digits are distinct");
            } else {
                System.out.println("Digits are not distinct");
            }
        }

        sc.close();
    }
}