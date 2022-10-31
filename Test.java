import java.util.Scanner;

public class Test {
   public static void main(String[] args){


      ///// Intruduction
      Scanner scan = new Scanner(System.in);
      System.out.println("Input a number and try to guess the number from 0-5: ");

      ///// Generate random number
      int randNum = (int)(Math.random() * 6);
      int a = Integer.valueOf(randNum);

      ///// Input of guessed number
      Scanner gue = new Scanner(System.in);
      String gu = gue.next();

      //// Convert to interger
      int b = Integer.parseInt(gu);
      
      //// Check if the input is the same as the random number
     if (a == b){
      System.out.println("Your Right! This is the random number: " + a + " And this is your number: " + gu);
     }
      else{
         System.out.println("You haved guessed wrong:( The number is: " + a);
      }
      
    
   }
}