package Conditional_Statements;
import java.util.*;
public class practice4 {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);


            int house = s.nextInt();
            int player = s.nextInt();
            int sum =( house+player);

            if (sum>21){
                System.out.println("busts");

            }else if(player<house){
                System.out.println("player loss");
            }
            else if(player==house){
                System.out.println("its a tie");


            } else //(player=true);   {
            {  System.out.println("player wins"); }

            //your code here






        }

    }

