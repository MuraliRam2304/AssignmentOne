//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class CalculateTheValue {

    public static void main(String[] args) {
        double answer = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number:");
        int num1 = input.nextInt();
        System.out.println("enter number:");
        int num2 = input.nextInt();
        System.out.println("enter operator:");
        char operator = input.next().trim().charAt(0);

        if (operator == '+') {
            answer = num1 + num2;
            System.out.println(answer);
        } else if (operator == '-') {
            answer = num1 - num2;
            System.out.println(answer);
        } else if (operator == '*') {
            answer = num1 * num2;
            System.out.println(answer);
        } else if (operator == '%') {
            if (num2 != 0) {
                answer = (double) num1 % num2;
                System.out.println(answer);
            } else {
                System.out.println("can't divide");
            }
        }
        else if (operator == '/') {
            if (num2 != 0) {
                answer = (double) num1 / num2;
                System.out.println(answer);
            } else {
                System.out.println("can't divide");
            }
        }
        else {
            System.out.println("invalid");
        }
    }

}

