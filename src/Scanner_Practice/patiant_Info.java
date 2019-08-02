package Scanner_Practice;
import java.util.*;
public class patiant_Info {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to the patient portal!");
            System.out.println("Please enter your personal information");

            System.out.println("Enter your first name");
            String firstName = scan.nextLine();


            System.out.println("Enter your last name");
            String lastName = scan.nextLine();

            System.out.println("Enter your email");
            String email = scan.nextLine();


            System.out.println("Enter your street");
            String street = scan.nextLine();


            System.out.println("Enter your city");
            String city = scan.nextLine();

            System.out.println("Enter your state");
            String state = scan.next();
            String avoidReturn = scan.nextLine();

            System.out.println("Enter your zip code");
            int zipcode = scan.nextInt();

            System.out.println("Enter your work phone number");
            long workphone = scan.nextLong();

            System.out.println("Enter your personal phone number");
            long personalphone = scan.nextLong();

            System.out.println("Enter your age");
            int age = scan.nextInt();

            System.out.println("Enter your height");
            double hieght = scan.nextDouble();

            System.out.println("Enter your weight");
            double weight = scan.nextDouble();

            System.out.println("Are you married?");
            boolean isMarried = scan.nextBoolean();
            System.out.println("Patient personal information" + "\n"+ "Full name: "+lastName+", "+firstName);
            System.out.println("Address: "+street+", "+city+", "+state+" "+zipcode);
            System.out.println("Contacts: work phone number - "+workphone+","+" personal phone number - "+personalphone+","
                    +" email: "+email);

            System.out.println("Age: "+age);
            System.out.println("Height: "+hieght);
            System.out.println("Weight: "+weight+" pounds");
            System.out.println("Married?: "+isMarried);


        }
    }

