//To find Armstrong Number between two given number.

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number= input.nextInt();
        int orginal=number;
        int sum=0;

       int count=count(number);
        while(number>0){
            int digit=number%10;
            sum=sum+ power(digit,count);
            number=number/10;
        }
        if (sum==orginal){
            System.out.println("armstrong");
        }
        else {
           System.out.println("not armstrong");
       }

    }
    public static int count(int number){
        int count=0;
        while(number>0){
            number=number/10;
            count++;
        }
        return count;
    }
    public static int power(int a,int b){
        int ans=1;
        for (int i = 1; i <=b ; i++) {
            ans=ans*a;
        }
        return ans;
    }
}
