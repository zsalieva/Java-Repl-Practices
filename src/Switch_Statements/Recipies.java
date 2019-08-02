package Switch_Statements;
import java.util.*;
public class Recipies {



        public static void main(String[] args) {



            Scanner sc=new Scanner(System.in);
            System.out.println("Split:");
            String split=sc.nextLine();
            System.out.println("Number of people:");
            int people=sc.nextInt();
            System.out.println("Check amount:");
            double camount=sc.nextDouble();
            sc.nextLine();
            System.out.println("Service Quality:");
            String sq=sc.nextLine();
            //
            //
            //String pp=ppl;
//int people=ppl.length();
            String pp="";
            for (int i=0;i<people;i++){
                pp=pp+"&";

            }
            double totalpay=0.0,ttip=0.0,tpperson=0.0,tippperson=0.0;

            if (split.equals("Yes")){
                //  System.out.println("Yes");
            }
            else{
                //   System.out.println("No");


            }
            if(sq.equals("Excellent")){
                ttip=camount*0.25;
                totalpay=camount+ttip;
                tpperson=totalpay/people;
                tippperson=ttip/people;
            }
            else if(sq.equals("Great")){
                ttip=camount*0.20;
                totalpay=camount+ttip;
                tpperson=totalpay/people;
                tippperson=ttip/people;
            }
            else if(sq.equals("Good")){
                ttip=camount*0.15;
                totalpay=camount+ttip;
                tpperson=totalpay/people;
                tippperson=ttip/people;
            }
            else if(sq.equals("Fair")){
                ttip=camount*0.10;
                totalpay=camount+ttip;
                tpperson=totalpay/people;
                tippperson=ttip/people;}
            else if(sq.equals("Poor")){
                ttip=camount*0.05;
                totalpay=camount+ttip;
                tpperson=totalpay/people;
                tippperson=ttip/people;
            }
            else{
                System.out.println("wrong selection for service Quality");
            }




            System.out.println("Number of people entered: "+ pp);
            System.out.println("Total to pay: "+totalpay);
            System.out.println("Total tip: "+ttip);
            System.out.println("Total per person: "+tpperson);
            System.out.println("Tip per person: "+tippperson);


        }
    }

