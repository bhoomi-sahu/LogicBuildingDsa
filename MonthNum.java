import java.util.Scanner;

public class MonthNum {
    public static void main(String args[]){
          System.out.println("Enter a number");
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
          if(num ==1 || num == 3 || num == 5 || num==7 || num == 8 || num == 9 || num == 10 || num==12 ){
            System.out.println("IN Month of " +num+ " there is 31 days");
          }else if(num == 2){
            System.out.println("IN Month of "+num+ " there is 28 days");
          }else{
            System.out.println("IN Month of "+num+ " there is 30 days");
          }
    }
    
}
