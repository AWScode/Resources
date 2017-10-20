/* Palindrome.java
Mr. Considine
October 2017
IB CS Resources */

import java.util.*;


public class Palindrome {

    public static boolean palindromeCheck(String test) {

        return false;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Tester \n Please type a word or phrase or number you would like to check!");
        Scanner scan = new Scanner(System.in);

        if (palindromeCheck(scan.nextLine())) {
            System.out.println("That's a Palindrome!");
        }
        else {
            System.out.println("That's not a Palindrome!");
        }

    }

}
