package Conditional_Statements;
import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        if(number%2==0) {
            System.out.println(number+" is even");
        }

        else {
            System.out.println(number+" is odd");
        }

        //System.out.println(number+" is even");

    }
}
