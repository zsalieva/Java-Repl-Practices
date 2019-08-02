package Scanner_Practice;
import java.util.Scanner;
public class phoneNumber {


        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
// System.out.println("Enter your area code");
            int areaCode = scan.nextInt();
            int  localNumber = scan.nextInt();
            String avoidReturn = scan.nextLine();
            //String phoneNumber = (int)(areaCode) + localNumber;
            System.out.println("Calling number "+ "("+areaCode+")"+"-"+localNumber);


        }}

