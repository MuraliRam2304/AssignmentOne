import java.util.Scanner;
//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class SumOfNumberX {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
          int sum=0;

        while(true){
            System.out.println("enter number or x");
            String value=input.next();//get  the  value as string
            if(value.equals("x")){ // check weather input is X means break and return te sum
                System.out.println(sum);
                break;
            }
            int num= Integer.parseInt(value);// convert String to -> integer
            sum=sum+num;
        }
    }
}
