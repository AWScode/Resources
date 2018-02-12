/* Dog.java by Mr. Considine
This class holds all of the data and methods
to create Dog objects. This is a class to be
imported and used in other files such as
Pound.java which creates a bunch of dogs. */

public class Dog {

  private static String name;
  private static int age;
  private static String owner;

  public Dog(String n, int a, String o) {
    this.name = n;
    this.age = a;
    this.owner = o;
  }

  public static void bark() {
    System.out.println("Woof!");
  }

  public String getName() {
    return this.name;
  }

  public static int getAge() {
    return age;
  }

  public static String getOwner() {
    return owner;
  }

  public static void setName(String n) {
    name = n;
  }

  public static void setAge(int a) {
    age = a;
  }

  public static void setOwner(String o) {
    owner = o;
  }

}
