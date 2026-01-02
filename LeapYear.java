import java.util.Scanner;
//Input a year and find whether it is a leap year or not.
public class LeapYear {
   public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter the year :");
        int year=input.nextInt();
        if(year%400==0){
            System.out.println(year + "Leap year");
        } else if (year%4==0 && year%100 !=0) {
            System.out.println(year + "Leap year");
        }
        else {
            System.out.println(year + "not a Leap year");
        }
   }
}
