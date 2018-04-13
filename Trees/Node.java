/* Node.java created by Mr. Considine
This class holds all of the information
and methods responsible for the Node for
a BinaryTree. */

import java.util.*;
import java.io.*;

public class Node {

  public Node parent;
  public Node child1;
  public Node child2;
  public Integer val;

  public Node(int val) {
    this.val = val;
    this.parent = null;
    this.child1 = null;
    this.child2 = null;
  }

  public int getValue() {
    return this.val;
  }

  public void setParent(Node parent) {
    this.parent = parent;
  }

  public Node getParent() {
    return this.parent;
  }

  public void setChild(Node child) {
    if (child.getValue() >= this.val) {
      this.child2 = child;
    }
    else {
      this.child1 = child;
    }
  }

  public Node getChild(boolean right) {
    if (right) {
      return this.child2;
    }
    else {
      return this.child1;
    }
  }

}
