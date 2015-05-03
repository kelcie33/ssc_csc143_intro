// CaffeinatedDrinks.java

// South Seattle Community College
// Spring 2015, CSC 143, Weekly #3 Coffee Shop
// Kelcie Feeney, 04/27/2015

/**
 * This class contains object methods that calculate drink information
 * for coffee shop orders of CaffeinatedDrinks.
 * 
 * @author Kelcie Feeney
 * @version 1.0, 04/27/2015
 * @see Drinks
 *
 */
public class CaffeinatedDrinks extends Drinks {
  protected static final double base_price_per_oz = 3 * Drinks.base_price_per_oz;

  /**
   * Constructs a CaffeinatedDrinks object with no arguments given
   */
  public CaffeinatedDrinks() {
    this("CaffeinatedDrinks", base_price_per_oz, "small");
  }

  /**
   * Constructs a NonCaffeinatedDrinks object with all arguments given
   * 
   * @param n name
   * @param p price per oz
   * @param s size in oz
   */
  public CaffeinatedDrinks(String n, double p, String s) {
    super(n, p, s);
  }
}