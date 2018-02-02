/* Prime.java by Mr. Considine
This program holds all of the definitions and
methods and variables for the Prime class.
The goal of Prime is to calculate the
next largest prime of an inputted integer.
*/
import java.util.*;


//create class
public class Prime{

  public static void printPrimeFactors(int num) {
    System.out.println("");
  }

  public static boolean checkPrime(int check) {
    boolean isPrime = true;
    for (int i = 2; i < check; i++) {
      // '%' is the mod operator. It tells you what the remainder
      // is if you were to divide the two numbers.
      if (check%i == 0) {
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }


  public static int nextPrime(int x) {
    int next = x + 1;
    while (true) {
      if (checkPrime(next)) {
        break;
      }
      else {
        next = next + 1;
      }
    }
    return next;
  }

//create main
  public static void main(String[] args) {

    //create prompt
    System.out.println("Welcome to Prime. Please give me a number.");
    //create Scanner
    Scanner userIn = new Scanner(System.in);
    //take integer input from user and create a variable with it.
    int baseNum = userIn.nextInt();
    //pass baseNum to the nextPrime methods
    int nPrime = nextPrime(baseNum);


    System.out.println(nPrime);

  }
}
