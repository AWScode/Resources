/* Pound.java by Mr. Considine
This class holds all of the data and methods
to create Pound objects. This is a class used
other files such as Dog.java and Owner.java */
import java.util.*;

public class Pound {

  public static void main(String[] args) {
    System.out.println("Welcome to the Pound!");
    System.out.println("Here we have some dogs to see.");

    Dog fido = new Dog("Fido", 5, "Mr. Burns");

    Dog marble = new Dog("Marble", 2, "Ms. Billings");

    Dog cat = new Dog("Scone", 20, "Mr. Sidman");

    System.out.println("Here is one now:");

    fido.bark();
    String newName = fido.getName();
    System.out.println("Dog's name is: " + newName + "\n\n =========== \n");

    System.out.println("Here are all the dogs we have: \n");

    ArrayList<Dog> listOfDogs = new ArrayList<Dog>();
    listOfDogs.add(fido);
    listOfDogs.add(marble);
    listOfDogs.add(cat);

    for (int i = 0; i < listOfDogs.size(); i++) {
      System.out.println(listOfDogs.get(i).getName());
    }

    System.out.println("");
    System.out.println("Which dog would you like to know more about?");
    Scanner newIn = new Scanner(System.in);
    String choice = newIn.next();

    Boolean found = false;
    Dog theDog = new Dog("Test", 0, "TestO");
    for (int i = 0; i < listOfDogs.size(); i++) {
      if (choice.equals(listOfDogs.get(i).getName())) {
        System.out.println("What about " + choice + "?");
        found = true;
        theDog = listOfDogs.get(i);
        break;
      }
    }

    if (!found) {
      System.out.println("We don't have a dog like that...");
    }
    else {
      Scanner q = new Scanner(System.in);
      String question =  q.next();
      if (question.equals("age")) {
        System.out.println(theDog.getName() + "\'s age is " + theDog.getAge());
      }
    }

  }
}
