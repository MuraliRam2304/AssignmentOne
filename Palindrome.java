//To find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter :");
        String name=input.nextLine();
        name=name.toLowerCase();
        int left=0;
        int right=name.length()-1;
        Boolean ispalindrome=true;
        while(left<right){
            if(name.charAt(left)!= name.charAt(right)){
                ispalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(ispalindrome){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }

}
//To find Armstrong Number between two given number.