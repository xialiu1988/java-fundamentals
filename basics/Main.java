
import java.lang.String;
import java.util.Random;
import java.util.*;
public class Main{

    public static void main(String[] args){

        int dogCount = 0;
        System.out.println(pluralize("dog",dogCount));

       flipNHeads(3);
    }

    public static String pluralize(String word, int num){

        if(num==1){
            return "I own " + num + " " + word + ".";
        }
        else if(num<0){
            return "Number needs to be greater than 0";
        }
        else{
            return "I own " + num + " " + word + "s.";
        }
    }


    public  static void flipNHeads(int n){
         int counter = 0;//check how many heads in a row
        int total = 0;
         while(counter!=n){
         int ran = new Random().nextInt(2);
          if (ran<0.5){
             System.out.println("tails");
              counter = 0;
              total++;
          }
          if(ran>=0.5){
              System.out.println("heads");
              counter++;
              total++;
              if(counter==n)
                  break;
          }
         }

         System.out.println( "It took"+ total+" "+"flips to flip "+" "+counter+" "+"head in a row");
    }



}