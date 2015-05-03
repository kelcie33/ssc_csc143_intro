// Coffee.java

// South Seattle Community College
// Spring 2015, CSC 143, Weekly #3 Coffee Shop
// Kelcie Feeney, 04/27/2015

/**
 * This class contains object methods that calculate drink information
 * for coffee shop orders of Coffee.
 * 
 * @author Kelcie Feeney
 * @version 1.0, 04/27/2015
 * @see Drinks
 * @see CaffeinatedDrinks
 *
 */
public class Coffee extends CaffeinatedDrinks {
  private static final String default_type = "drip";

  private String type;

  /**
   * Constructs a Coffee object with no arguments given
   */
  public Coffee() {
    this("Coffee", CaffeinatedDrinks.base_price_per_oz, "small",
        default_type);
  }

  /**
   * Constructs a Coffee object with all arguments given
   * @param n name
   * @param p price per oz
   * @param s size in oz
   * @param t type
   */
  public Coffee(String n, double p, String s, String t) {
    super(n, p, s);
    this.type = t;
  }

  /**
   * toString provides the description of the drink
   * @return the description
   */
  public String toString() {
    String str;
    try {
      str = String.format("%s, type %s, size %s, cost: $%1.2f",
          this.name, this.type, this.size, this.getPrice());
    } catch (Exception e) {
      str = String.format("invalid size: %s", this.size);
    }
    return str;
  }

  /**
   * getPrice provides the price of the drink
   * @return the price
   * @throws Exception if size is invalid
   */
  public double getPrice() throws Exception {
    double price = super.getPrice();
    if (this.size == "medium") {
      price += 0.50;
    } else if (this.size == "large") {
      price += 1.00;
    }
    return price;
  }
}
