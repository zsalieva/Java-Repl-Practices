package Scanner_Practice;
import java.util.*;
public class VideoGame {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number of coupons:");
            int coupons = scan.nextInt();
            int candy = coupons/10;
            System.out.println("Number of Candies: "+ candy);
            int gumballs = coupons%10/3;
            System.out.println("Number of Gumballs: "+ gumballs);

        }
    }

