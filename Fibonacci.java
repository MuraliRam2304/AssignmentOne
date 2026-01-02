//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

public class Fibonacci {
   public static void main(String[] args) {
        //0, 1, 1, 2, 3, 5, 8, 13, 21
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number= input.nextInt();
        int answer=0;
        int a=0;
        int b=1;
        int count=2;
        System.out.println(a);
        System.out.println(b);
        while(count<number){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            count++;
        }

    }
}
//To find out whether the given String is Palindrome or not.
