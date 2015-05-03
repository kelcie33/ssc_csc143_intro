// Point.java

/****
 * CSC 143, Weekly Practice #4 Remove items in an ArrayList and
 * implement Comparable interface
 * 
 * @version 1.0, 05/02/2015
 * @author Kelcie Feeney
 * @see Textbook (original source code in Chapter 8 (pp. 546-548))
 */

public class Point implements Comparable<Point> {
  private int x;
  private int y;

  /**
   * constructs a new point at the origin, (0, 0)
   */
  public Point() {
    this(0, 0); // calls Point(int, int) constructor
  }

  /**
   * constructs a new point with the given (x, y) location
   * 
   * @param x
   *          x-coordinate
   * @param y
   *          y-coordinate
   */
  public Point(int x, int y) {
    setLocation(x, y);
  }

  /**
   * returns the distance between this Point and (0, 0)
   * 
   * @return distance from origin
   */
  public double distanceFromOrigin() {
    return Math.sqrt(x * x + y * y);
  }

  /**
   * returns the x-coordinate of this point
   * 
   * @return x-coordinate
   */
  public int getX() {
    return x;
  }

  /**
   * returns the y-coordinate of this point
   * 
   * @return y-coordinate
   */
  public int getY() {
    return y;
  }

  /**
   * sets this point's (x, y) location to the given values
   * 
   * @param x
   *          x-coordinate
   * @param y
   *          y-coordinate
   */
  public void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /**
   * toString returns a String representation of this point
   * 
   * @return String representation of this object
   */
  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  /**
   * shifts this point's location by the given amount
   * 
   * @param dx
   *          change in x-coordinate
   * @param dy
   *          change in y-coordinate
   */
  public void translate(int dx, int dy) {
    setLocation(x + dx, y + dy);
  }

  /**
   * compareTo finds the match result for comparing two Point objects
   * using a precedence that first checks the smaller y and then checks
   * the smaller x.
   * 
   * @return -1 if less than, 0 if equal to and 1 if more than
   * @see java.lang.Comparable#compareTo(java.lang.Object)
   */
  public int compareTo(Point other) {
    // Match is less than if either y is smaller or x is smaller
    if (this.y < other.y) {
      return -1;
    } else if (this.y == other.y && this.x < other.x) {
      return -1;
    }

    // Or, match is equal to if both y is the same and x is the same
    else if (this.y == other.y && this.x == other.x) {
      return 0;
    }

    // Or, match is greater than in other cases
    else {
      return 1;
    }
  }
}