package Scanner_Practice;
 import java.util.*;
public class practice_6Scan {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number of milligrams in drink:");
            int milligrams = scan.nextInt();
            int grams = (10000/milligrams);
            System.out.println("It would take about "+ grams + " drinks for a lethal overdose.");





        }
    }

