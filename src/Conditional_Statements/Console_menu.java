package Conditional_Statements;
import java.util.*;
public class Console_menu {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.println("---------------");
            System.out.println("select an option:");
            System.out.println("1) option 1");
            System.out.println("2) option 2");
            System.out.println("3) option 3");
            System.out.println("---------------");

            int choice = s.nextInt();
            if( choice==1){
                System.out.println("user selected 1");
            }
            if( choice==2){
                System.out.println("user selected 2");
            }
            if( choice==3){
                System.out.println("user selected 3");
            }


            //your code here


        }
    }

