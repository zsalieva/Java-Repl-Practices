package Scanner_Practice;
import java.util.*;
public class Negative {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:");
            int number = input.nextInt();
            int  t = number/2;
            if(t>=2) {
                System.out.println(number+" is positive");
            }

            else if(number<0) {
                System.out.println(number+" is negative");
            }

            else if(number==0) {
                System.out.println("it is zero");
            }

        }
    }

