package Conditional_Statements;
import java.util.*;
public class RealEstate {


        public static void main(String[] args) {
            // DO NOT CHANGE
            int propertyPrice = 0;

            Scanner scan = new Scanner(System.in);
            System.out.println("*****************************************");
            System.out.println("* Welcome to the RealEstate calculator! *");
            System.out.println("*****************************************");

            System.out.println("Enter your property type:");
            String houseType = scan.nextLine();
            String houseTypeEqualsIgnoreLowerCase;
            // try to use equal ignore case
            if (houseType.equalsIgnoreCase("Condo")) {
                propertyPrice += 50000;

            } else if (houseType.equalsIgnoreCase("Townhouse")) {
                propertyPrice += 75_000;

            } else if (houseType.equalsIgnoreCase("Single Family Home")) {
                propertyPrice += 95_000;
            }


            System.out.println("How many bedrooms do you have?");
            int numberOfBedrooms = scan.nextInt();
            propertyPrice += numberOfBedrooms * 30_000;


            System.out.println("Do you have a backyard?");
            boolean backyard;
            // use scanner here u get answer from user
            backyard = scan.nextBoolean();
            if (backyard && houseType.equalsIgnoreCase("Condo")) {
                System.out.println("Backyard is not available for condo!");
                // use else if
            } else if (backyard) {
                propertyPrice = propertyPrice + 5_000;
            }

            // you do not need this 	System.out.println("backyard is not available for Condo");

            System.out.println("Do you have garage?");
            //	boolean garage = true; // even here as well
            boolean garage=scan.nextBoolean();


            System.out.println("How many spots?");
            int garageSpots = scan.nextInt();

            if (garage) {
                // 	propertyPrice += 20_000;
                if (garageSpots < 10) {
                    propertyPrice += garageSpots * 20_000;
                } else {
                    System.out.println("Pardon, it's not a public parking!");
                }

                System.out.println("How close is metro station?");
                float metroAccessibility = scan.nextFloat();

                if (metroAccessibility <= 1) {
                    propertyPrice += 10_000;
                } else if (metroAccessibility > 1 && metroAccessibility <= 3) {
                    propertyPrice += 5_000;
                }


                System.out.println("How close is highway?");
                float highwayAccessibility = scan.nextFloat();

                if (highwayAccessibility <= 1) {
                    propertyPrice += 15_000;
                } else if (highwayAccessibility > 1 && highwayAccessibility <= 5) {
                    propertyPrice += 8_000;
                } else if (highwayAccessibility > 5 && highwayAccessibility <= 20) {
                    propertyPrice += 4_000;
                }


                System.out.println("What's the rating of nearest school?");
                float schoolScore = scan.nextFloat();

                if (schoolScore >= 8 & schoolScore <= 10) {
                    propertyPrice = propertyPrice + 45_000;
                } else if (schoolScore <8 & schoolScore >= 4) {
                    propertyPrice += 20_000;
                } else {
                    propertyPrice += 5_000;
                }


                System.out.println("Does any of your family members smoking?");
                boolean smoking =scan.nextBoolean();

                if (smoking) {
                    {
                        propertyPrice -= 5_000;
                    }

                }





            }


            System.out.println("Market report has been generated.");
            System.out.println("Your estimate market price is: " + propertyPrice + "$");
        }
    }

