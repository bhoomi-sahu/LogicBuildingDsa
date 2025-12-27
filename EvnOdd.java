import java.util.Scanner;

public class EvnOdd {
    public static void main(String[] args){
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("its a even num");
       
        }else{
            System.out.println("its odd num");
        }

    }
}
