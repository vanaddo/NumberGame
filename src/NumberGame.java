
import java.util.Scanner;

public class NumberGame {

  public static void main(String [] args){

   /* We use Math.random()to generate a number between 1 and 100
    * We multiple Math.random() times 100 because the method alone
      -- creates a floating point number between 0-1 and to make sure
      -- that our number is not 0 at any point we ad 1 to what ever the random number outputted is.
    *(int) goes before Math.random() to convert the outputted float number into an integer number
     *  */

    int randomNumber = (int) (Math.random() * 100) + 1;
    boolean hasWon = false;
    System.out.println("I have randomly chosen a number between 1 and 100.");
    System.out.println("Try to guess what that number is!");

    Scanner scanner = new Scanner(System.in);
    for(int i = 10; i>0; i--){
      System.out.println("You have " + i + " guess(es) left. Choose again: ");
      int guess = scanner.nextInt();

      if(randomNumber < guess){
        System.out.println("It'smaller than " + guess + " guess");
      }

      else if(randomNumber > guess){
        System.out.println("It's greater than " + guess + " guess");
      }
      else{
        hasWon = true;
        break;
      }
    }
    if(hasWon == true){
      System.out.println("CORRECT...YOU WIN!!");

    }else{
      System.out.println("GAME OVER... YOU LOSE :(" );
      System.out.println("The number was: " + randomNumber);
    }
  }
}
