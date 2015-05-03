/**
 * 
 * @author Kelcie Feeney
 *
 */
//public class Point {
public class Point implements Comparable<Point> {
  private int x;
  private int y;
  
  // constructs a new point at the origin, (0, 0)
  /**
   * 
   */
  public Point() {
    this(0, 0); // calls Point(int, int) constructor
  }
  
  // constructs a new point with the given (x, y) location
  /**
   * 
   * @param x
   * @param y
   */
  public Point(int x, int y) {
    setLocation(x, y);
  }
  
  // returns the distance between this Point and (0, 0)
  /**
   * 
   * @return
   */
  public double distanceFromOrigin() {
    return Math.sqrt(x * x + y * y);
  }
  
  // returns the x-coordinate of this point
  /**
   * 
   * @return
   */
  public int getX() {
    return x;
  }
  
  // returns the y-coordinate of this point
  /**
   * 
   * @return
   */
  public int getY() {
    return y;
  }
  
  // sets this point's (x, y) location to the given values
  /**
   * 
   * @param x
   * @param y
   */
  public void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  // returns a String representation of this point
  /**
   * 
   */
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
  
  // shifts this point's location by the given amount
  /**
   * 
   * @param dx
   * @param dy
   */
  public void translate(int dx, int dy) {
    setLocation(x + dx, y + dy);
  }

  /**
   * (non-Javadoc)
   * @see java.lang.Comparable#compareTo(java.lang.Object)
   */
  public int compareTo(Point other) {
    if(this.y < other.y) {
      return -1;
    }
    else if(this.y == other.y
        && this.x < other.x) {
      return -1;
    }
    else if(this.y == other.y
        && this.x == other.x) {
      return 0;
    }
    else {
      return 1;
    }
  }
}