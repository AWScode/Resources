/* BinaryTree.java created by Mr. Considine
This program holds all of the information for
the BinaryTree class. BinaryTree stores data in a
specific data structure that makes adding data
and searching for data possible in O(logn) time */
import java.util.*;
import java.io.*;

public class BinaryTree {

  public Node root;

  public BinaryTree(int val) {
    Node root1 = new Node(val);
    this.root = root1;
  }

  public Node getRoot() {
    return this.root;
  }

  public boolean searchNode(int val) {
    return false;
  }

  public void addNode(int val) {
  }

  public void removeNode(int val) {

  }

  public void printTree(Node root) {
    if (root != null) {
      String valS = Integer.toString(root.getValue());
      System.out.println("[" + valS + "]");
      this.printTree(root.getChild(false));
      this.printTree(root.getChild(true));
    }
  }

  public static void main(String[] args) {

    BinaryTree tree1 = new BinaryTree(10);

    /*tree1.addNode(8);
    tree1.addNode(12);
    tree1.addNode(14);
    tree1.addNode(13);
    tree1.addNode(11);

    tree1.printTree(tree1.getRoot());
    System.out.println("Searching for 8...");
    System.out.println(tree1.searchNode(8));
    System.out.println("Searching for 13...");
    System.out.println(tree1.searchNode(13));
    System.out.println("Searching for 15...");
    System.out.println(tree1.searchNode(15));*/
  }
}
