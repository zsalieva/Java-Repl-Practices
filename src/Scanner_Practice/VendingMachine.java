package Scanner_Practice;
import java.util.*;
public class VendingMachine {


        public static void main(String[] args) {
            int quarters, dimes, nickels, change;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter price in cents:");
            int itemPrice = scan.nextInt();
            if(itemPrice>=25 && itemPrice <= 100 && itemPrice % 5==0){
                change = (100-itemPrice);
                quarters = change/25;
                dimes = change%25/10;
                nickels = change%25%10 /5;


                System.out.println("Your change is "+quarters+" quarters"+ ", "+dimes+" dimes"+ ", "+"and "+ nickels+" nickels." );
            } else {
                System.out.println("Invalid price!");
            }

        }

    }

