/* MainFrame.java by Mr. Considine
This java program displays an example frame
using the java awt library */

import java.awt.*;

public class MainFrame extends Frame{

  public MainFrame() {

    setSize(400,300);
    setLayout(null);
    setVisible(true);
  }

  public void addButton() {
    Button b = new Button("Click me!");
    b.setBounds(90,100,100,30);
    this.add(b);
  }

  public void addLabel() {
    Label lab = new Label("My first label");
    lab.setBounds(90, 50, 120, 30);
    this.add(lab);
  }

  public void addCheckbox() {
    Checkbox check1 = new Checkbox("Yes");
    check1.setBounds(220, 50, 80, 30);
    this.add(check1);
    Checkbox check2 = new Checkbox("No");
    check2.setBounds(220, 75, 80, 30);
    this.add(check2);
  }

  public void addChoice() {
    Choice c = new Choice();
    c.setBounds(5, 20, 75, 180);
    c.add("1");
    c.add("2");
    c.add("3");
    c.add("4");
    c.add("5");
    this.add(c);
  }

  public void addList() {
    List l = new List(5);
    l.setBounds(320, 60, 45, 180);
    l.add("a");
    l.add("b");
    l.add("c");
    l.add("d");
    l.add("e");
    this.add(l);
  }

  public static void main(String[] args) {
    MainFrame m = new MainFrame();
    m.addButton();
    m.addLabel();
    m.addCheckbox();
    m.addChoice();
    m.addList();

  }

}
