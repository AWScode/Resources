/* Library.java created by Mr. Considine
This program holds all of the information for
the Library class. Library builds a record of
all the words in a book and can sort them in any
way the user would like. This class can also
return words that fit the search criteria. */
import java.util.*;
import java.io.*;

public class Library {

  public ArrayList<String> words;

  public Library() {
    this.words = new ArrayList<String>();

  }

  //Sort with Insertion
  public void alphaSort(){



  }
  //Sort with Selection
  public ArrayList<String> wLengthSelectionSort(){
    ArrayList<String> sortList = new ArrayList<String>();
    //Create a temporary list to remove from
    ArrayList<String> tempList = new ArrayList<String>();
    for (int h = 0; h < words.size(); h++) {
      tempList.add(words.get(h));
    }

    for (int i = 0; i < words.size(); i++) {
      String min = tempList.get(0);
      for (int j = 0; j < tempList.size(); j++) {
        if (min.length() > tempList.get(j).length()) {
          min = tempList.get(j);
        }
      }
      tempList.remove(min);
      sortList.add(min);
    }

    return sortList;
  }

  public ArrayList<String> getList() {
    return words;
  }

  public ArrayList<String> merge(ArrayList<String> sorted1, ArrayList<String> sorted2) {
    //combine the two
    ArrayList<String> finalList = new ArrayList<String>();
    int index1 = 0;
    int index2 = 0;
    boolean list1empty = false;
    boolean list2empty = false;
    for (int i = 0; i < sorted1.size() + sorted2.size(); i++) {
      if (!list1empty && !list2empty) {
        if (sorted1.get(index1).length() <= sorted2.get(index2).length()) {
          finalList.add(sorted1.get(index1));
          index1++;
          if (index1 == sorted1.size()) {
            list1empty = true;
          }
        }
        else {
          finalList.add(sorted2.get(index2));
          index2++;
          if (index2 == sorted2.size()) {
            list2empty = true;
          }
        }
      }
      else if (list1empty) {
        finalList.add(sorted2.get(index2));
        index2++;
        if (index2 == sorted2.size()) {
          list2empty = true;
        }
      }

      else if (list2empty) {
        finalList.add(sorted1.get(index1));
        index1++;
        if (index1 == sorted1.size()) {
          list1empty = true;
        }
      }
    }
    return finalList;
  }

  public ArrayList<String> mergeWLengthSort(ArrayList<String> myList) {
    if (myList.size() <= 1) {
      return myList;
    }
    else {
      ArrayList<String> list1 = new ArrayList<String>(); // First half of list
      ArrayList<String> list2 = new ArrayList<String>(); //Second half of list
      for (int i = 0; i < myList.size()/2; i++) {
        list1.add(myList.get(i));
      }
      for (int j = myList.size()/2; j < myList.size(); j++) {
        list2.add(myList.get(j));
      }

      ArrayList<String> sorted1 = mergeWLengthSort(list1);
      ArrayList<String> sorted2 = mergeWLengthSort(list2);
      ArrayList<String> sortedfinal = merge(sorted1, sorted2);
      return sortedfinal;
    }
  }


  public void printList(ArrayList<String> printL){
    for (int i = 0; i < printL.size(); i++){
      System.out.print(printL.get(i) + ", ");
    }
    System.out.println("");
  }

  public int getWordCount(String w){
    int count = 0;
    for (int i = 0; i < words.size(); i++){
      if (words.get(i).equals(w)){
        count++;
      }
    }
    return count;
  }

  public ArrayList<String> getTopWords(){
    ArrayList<String> topWords = new ArrayList<String>();

    return topWords;
  }

  public ArrayList<String> getWords() {
    return words;
  }

  public void readNewBook(String filename) {
    File newBook = new File(filename);
    try {
      Scanner toRead = new Scanner(newBook);
      while (toRead.hasNext()) {
      String toAdd = toRead.next();
      toAdd = toAdd.replaceAll("[-+.^:,!(){}\'\"]", "");
      words.add(toAdd);
      }
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found.");
    }


  }

  public static void main(String[] args) {

    Library myLib = new Library();

    myLib.readNewBook("HeartOfDarkness.txt");

    System.out.println("\nWelcome to the AWS Library!");
    System.out.println("\nWe have compiled a list of the words for the book ___insert book here___: ");

    System.out.println("The story: \n ===\n\n");
    myLib.printList(myLib.getWords());
    System.out.println("\n");

    long t1 = System.currentTimeMillis();
    myLib.printList(myLib.wLengthSelectionSort());
    long t2 = System.currentTimeMillis();
    long diffSelection = t2 - t1;
    /*ArrayList<String> test = new ArrayList<String>();
    test.add("two");
    test.add("for");
    test.add("goookd");
    test.add("pillow");
    test.add("flame");
    test.add("dice");
    test.add("on");*/
    long t3 = System.currentTimeMillis();
    myLib.printList(myLib.mergeWLengthSort(myLib.getWords()));
    long t4 = System.currentTimeMillis();
    long diffMerge = t4 - t3;

    System.out.println(diffSelection);
    System.out.println(diffMerge);
    System.out.println("Here are the top words in the story");
    System.out.println("Word: a : " + Integer.toString(myLib.getWordCount("a")));
    System.out.println("Word: there : " + Integer.toString(myLib.getWordCount("there")));
    System.out.println("Word: human : " + Integer.toString(myLib.getWordCount("human")));
    System.out.println("Word: heart : " + Integer.toString(myLib.getWordCount("heart")));
    System.out.println("");


  }

}
