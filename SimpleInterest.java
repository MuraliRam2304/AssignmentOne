//2 .Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class SimpleInterest {
   public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       System.out.println("enter principle :");
       double P= input.nextDouble();
       System.out.println("enter rate :");
       double R= input.nextDouble();
       System.out.println("enter time :");
       double T= input.nextDouble();
       double SI=(P*R*T)/100;
       System.out.println(SI);

}}


