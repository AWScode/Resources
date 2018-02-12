/* Dog.java by Mr. Considine
This class holds all of the data and methods
to create Dog objects. This is a class to be
imported and used in other files such as
Pound.java which creates a bunch of dogs. */

public class Dog {

  private String name;
  private int age;
  private String owner;

  public Dog(String n, int a, String o) {
    this.name = n;
    this.age = a;
    this.owner = o;
  }

  public static void bark() {
    System.out.println("Woof!");
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getOwner() {
    return owner;
  }

  public void setName(String n) {
    name = n;
  }

  public void setAge(int a) {
    age = a;
  }

  public void setOwner(String o) {
    owner = o;
  }

}
