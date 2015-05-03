// Client.java

/****
 * CSC 143, Weekly Practice #4
 * Remove items in an ArrayList and implement Comparable interface
 * @version 1.0, 05/02/2015
 * @author Kelcie Feeney
 */

import java.util.ArrayList; // ArrayList
import java.util.Arrays; // Arrays

public class Client {

  /**
   * main is the entry point for the program.
   * 
   * @param args
   *          not used
   */
  public static void main(String[] args) {
    DoProblem1();
    DoProblem2();
  }

  /**
   * DoProblem1 does problem 1 from the homework assignment, which
   * requires testing new method removeInRange in an example problem
   */
  public static void DoProblem1() {
    System.out.println("** DoProblem1 **");

    // Setup string variables for example problem
    // using Arrays.asList to initialize the ArrayList easier
    // See:
    // http://stackoverflow.com/questions/21696784/how-to-declare-an-arraylist-with-values
    String strBegin = "free";
    String strEnd = "rich";
    ArrayList<String> strList = new ArrayList<String>(Arrays.asList(
        "to", "be", "or", "not", "to", "be", "that", "is", "the",
        "question"));
    System.out.println("Begin: " + strBegin);
    System.out.println("End: " + strEnd);
    System.out.println("List: " + strList);

    // Call removeInRange
    System.out.println("Calling removeInRange...");
    removeInRange(strList, strBegin, strEnd);
    System.out.println("List: " + strList);
    System.out.println("");
  }

  /**
   * removeInRange finds comparison strings that fall between reference
   * screens and removes them from the list. It first converts
   * references strings to uppercase to avoid confusion between
   * uppercase and lowercase
   * 
   * @param strList
   *          list of words
   * @param strBegin
   *          beginning word key for removal range
   * @param strEnd
   *          ending word key for removal range
   */
  public static void removeInRange(ArrayList<String> strList,
      String strBegin, String strEnd) {
    // Convert reference strings to uppercase to avoid confusion
    // since String.compareTo considers uppercase before lowercase
    strBegin = strBegin.toUpperCase();
    strEnd = strEnd.toUpperCase();

    // Find comparison strings that fall between reference strings
    // and remove them from the list
    for (int i = 0; i < strList.size(); i++) {
      String strCompare = strList.get(i).toUpperCase();
      if (strBegin.compareTo(strCompare) < 0
          && strEnd.compareTo(strCompare) > 0) {
        strList.remove(i);
        i--;
      }
    }
  }

  /**
   * DoProblem2 does problem 2 from the homework assignment, which
   * requires testing new class Point implementing interface Comparable
   */
  public static void DoProblem2() {
    System.out.println("** DoProblem2 **");

    // Setup point variables for example problem
    Point p1 = new Point(0, 0);
    Point p2 = new Point(0, 1);
    Point p3 = new Point(1, 0);
    Point p4 = new Point(1, 1);

    // Call compareTo
    System.out.println("Calling compareTo...");
    System.out.println("p3 " + p3.toString() + " compared to p1 "
        + p1.toString() + ": " + p3.compareTo(p1));
    System.out.println("p3 " + p3.toString() + " compared to p2 "
        + p2.toString() + ": " + p3.compareTo(p2));
    System.out.println("p3 " + p3.toString() + " compared to p3 "
        + p3.toString() + ": " + p3.compareTo(p3));
    System.out.println("p3 " + p3.toString() + " compared to p4 "
        + p4.toString() + ": " + p3.compareTo(p4));
    System.out.println("");
  }
}