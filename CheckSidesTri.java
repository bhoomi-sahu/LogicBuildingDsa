  import java.util.Scanner;

public class CheckSidesTri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three sides of a triangle:");
        System.out.print("Side 1: ");
        double a = scanner.nextDouble();
        
        System.out.print("Side 2: ");
        double b = scanner.nextDouble();
        
        System.out.print("Side 3: ");
        double c = scanner.nextDouble();
        
        if (isValidTriangle(a, b, c)) {
            System.out.printf("%.2f, %.2f, %.2f can form a valid triangle.%n", a, b, c);
        } else {
            System.out.printf("%.2f, %.2f, %.2f cannot form a valid triangle.%n", a, b, c);
        }
        
        scanner.close();
    }
    
    public static boolean isValidTriangle(double a, double b, double c) {
        // Check for positive sides
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        
        // Triangle inequality theorem
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}

