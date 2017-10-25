/* ShoppingSpree.java
IB Computer Science
Mr. Considine
===================
This class holds the data and
methods to run ShoppingSpree
which allows a user to keep track
of items bought and her budget */

import java.util.*;

public class ShoppingSpree {

    int budget;
    String name;
    ArrayList<String> bags;

    public ShoppingSpree(int money) {
        budget = money;
        bags = new ArrayList<String>();
        name = "Mr. Considine";
    }

    public int getMoney() {
        return budget;
    }

    public void getBags() {
        System.out.print("You are carrying: ");
        for (int i = 0; i < bags.size(); i++) {
            System.out.print(bags.get(i) + ", ");
        }
        System.out.println(" and that's it!");
    }

    public void buyShirt() {

        System.out.println("What color?");
        Scanner choice = new Scanner(System.in);
        String color = choice.nextLine();

        if (color.equals("red")) {
            bags.add("red shirt");
            budget = budget - 30;
        }
        else if (color.equals("blue")) {
            bags.add("blue shirt");
            budget = budget - 10;
        }
        else {
            bags.add("shirt");
            budget = budget - 20;
        }

    }

    public void buyPhone() {
        bags.add("Samsung Galacy s8 note ++ phone");
        budget = budget - 40;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to your Shopping Spree!");
        System.out.println("How much money have you brought today?");
        Scanner amount = new Scanner(System.in);
        int money = Integer.parseInt(amount.nextLine());

        ShoppingSpree spree = new ShoppingSpree(money);

        spree.buyShirt();
        spree.buyShirt();
        spree.buyPhone();

        System.out.println("You have " + spree.getMoney() + " dollars left.");
        spree.getBags();

    }

}
