import java.util.Scanner;

public class InputCheck {
    public static void main(String[] args){
        System.out.println("enter the character");
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println("it is an alphabet");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("it is a digit");
        }
        else{
            System.out.println("it is a special character");
        }

    }
    
}
