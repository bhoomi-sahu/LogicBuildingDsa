// import java.util.Scanner;

// public class ChkGreadMk {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter marks: ");
//         int num = sc.nextInt();

//         if (num >= 90 && num <= 100) {
//             System.out.println("Grade: A");
//         } 
//         else if (num >= 75) {
//             System.out.println("Grade: B");
//         } 
//         else if (num >= 60) {
//             System.out.println("Grade: C");
//         } 
//         else if (num >= 40) {
//             System.out.println("Grade: D");
//         } 
//         else {
//             System.out.println("Fail");
//         }

//         sc.close();
//     }
// }
public class ChkGreadMk {
    public static void main(String[] args) {

        int marks[] = {45, 67, 89, 23, 56};

        for (int num : marks) {
            System.out.print(num + " -> ");

            if (num >= 90) System.out.println("A");
            else if (num >= 75) System.out.println("B");
            else if (num >= 60) System.out.println("C");
            else if (num >= 40) System.out.println("D");
            else System.out.println("Fail");
        }
    }
 }
