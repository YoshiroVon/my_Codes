import java.util.Scanner;
import java.util.Random;
public class Navarro_523_Activity6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random rand = new Random();
      System.out.println("Guess the number 1 -10 ");
      int guess = rand.nextInt(10)+1 ;
      int num;      
      do {
        num = sc.nextInt();
       if (num != guess)
       System.out.println("You guessed wrong!");
      }
    while (num != guess);
    {
      System.out.println("You guessed correctly the hidden number is " + guess );
    }
  }
}