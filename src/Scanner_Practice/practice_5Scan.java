package Scanner_Practice;
import java.util.*;
public class practice_5Scan {



        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println( "Enter seconds:");
            int inputSeconds = scan.nextInt();
            // int hours = scan.nextInt();
            // int minutes = scan.nextInt();
            // int seconds = scan.nextInt();
            int hours =((inputSeconds /60 )/60);
            int minutes = (((inputSeconds)/60)%60);
            int seconds = (inputSeconds%60);
            System.out.println(hours +" hours"+", "+ minutes +" minutes" +", "+ ("and ")+ seconds + (" seconds"));










        }
    }

