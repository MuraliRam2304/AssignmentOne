import java.util.Scanner;

//Take a number as input and print the multiplication table for it.
public class Multiplication {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int multiple= input.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(multiple+"x"+i+"="+(multiple*i));
        }
    }
}
