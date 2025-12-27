// check number is divisible by 5 
import java.util.Scanner;

public class ChekNumDivd {
public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num % 5 == 0){
        System.out.println("Divisible by 5");
    } else {
        System.out.println("Not Divisible by 5");
    }
}
    
}
