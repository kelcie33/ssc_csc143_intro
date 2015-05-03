// Tea.java

// South Seattle Community College
// Spring 2015, CSC 143, Weekly #3 Coffee Shop
// Kelcie Feeney, 04/27/2015

/**
 * This class contains object methods that calculate drink information
 * for coffee shop orders of Tea.
 * 
 * @author Kelcie Feeney
 * @version 1.0, 04/27/2015
 * @see Drinks
 * @see CaffeinatedDrinks
 *
 */
public class Tea extends CaffeinatedDrinks {
  private static final String default_flavor = "English Breakfast";

  private String flavor;

  /**
   * Constructs a Tea object with no arguments given
   */
  public Tea() {
    this("Tea", CaffeinatedDrinks.base_price_per_oz, "small",
        default_flavor);
  }

  /**
   * Constructs a Tea object with all arguments given
   * @param n name
   * @param p price per oz
   * @param s size in oz
   * @param f flavor
   */
  public Tea(String n, double p, String s, String f) {
    super(n, p, s);
    this.flavor = f;
  }

  /**
   * toString provides the description of the drink
   * @return the description
   */
  public String toString() {
    String str;
    try {
      str = String.format("%s, flavor %s, size %s, cost: $%1.2f",
          this.name, this.flavor, this.size, this.getPrice());
    } catch (Exception e) {
      str = String.format("invalid size: %s", this.size);
    }
    return str;
  }
}