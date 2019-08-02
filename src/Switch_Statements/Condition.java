package Switch_Statements;
import java.util.*;
public class Condition {


        public static void main(String[] args) {
            //DO NOT CHANGE
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number:");
            int x = scan.nextInt();
            int result=(0);

            result = (x>=5)? x: (x<5)? x:-x;
            System.out.println(result);
        }
    }

