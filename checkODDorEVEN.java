import java.util.Scanner;
public class checkODDorEVEN {
    //1.Write a program to print whether a number is even or odd, also take input from the user.
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number");
        int answer= input.nextInt();
        if(answer%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("ODD");
        }

    }
}
