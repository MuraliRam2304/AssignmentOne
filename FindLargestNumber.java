//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class FindLargestNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number:");
        int num1 = input.nextInt();
        System.out.println("enter number:");
        int num2 = input.nextInt();
        if(num1>num2) {
            System.out.println("largest number is: " + num1);
        }
        else if(num2>num1){
            System.out.println("largest number is: "+ num2);
        }
        else if(num1==num2){
            System.out.println("both are same");
        }
    }
}