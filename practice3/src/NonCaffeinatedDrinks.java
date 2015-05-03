// NonCaffeinatedDrinks.java

// South Seattle Community College
// Spring 2015, CSC 143, Weekly #3 Coffee Shop
// Kelcie Feeney, 04/27/2015

/**
 * This class contains object methods that calculate drink information
 * for coffee shop orders of NonCaffeinatedDrinks.
 * 
 * @author Kelcie Feeney
 * @version 1.0, 04/27/2015
 * @see Drinks
 *
 */
public class NonCaffeinatedDrinks extends Drinks {
  protected static final double base_price_per_oz = 2 * Drinks.base_price_per_oz;

  /**
   * Constructs a NonCaffeinatedDrinks object with no arguments given
   */
  public NonCaffeinatedDrinks() {
    this("NonCaffeinatedDrinks", base_price_per_oz, "small");
  }

  /**
   * Constructs a NonCaffeinatedDrinks object with all arguments given
   * 
   * @param n name
   * @param p price per oz
   * @param s size in oz
   */
  public NonCaffeinatedDrinks(String n, double p, String s) {
    super(n, p, s);
  }
}