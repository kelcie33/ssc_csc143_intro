// Drinks.java

// South Seattle Community College
// Spring 2015, CSC 143, Weekly #3 Coffee Shop
// Kelcie Feeney, 04/27/2015

/**
 * This class contains object methods that calculate drink information
 * for coffee shop orders of Drinks.
 * 
 * @author Kelcie Feeney
 * @version 1.0, 04/27/2015
 * @see CoffeeShop
 *
 */
public class Drinks {
  protected static final int size_in_oz_small = 6;
  protected static final int size_in_oz_medium = 12;
  protected static final int size_in_oz_large = 16;
  protected static final double base_price_per_oz = 0.10;

  protected String name;
  protected double price_per_oz;
  protected String size;

  /**
   * Constructs a Drinks object with no arguments given
   */
  public Drinks() {
    this("Drinks", base_price_per_oz, "small");
  }

  /**
   * Constructs a Drinks object with all arguments given
   * @param n name
   * @param p price per oz
   * @param s size in oz
   */
  public Drinks(String n, double p, String s) {
    this.name = n;
    this.price_per_oz = p;
    this.size = s;
  }

  /**
   * toString provides the description of the drink
   * @return the description
   */
  public String toString() {
    String str;
    try {
      str = String.format("%s, size %s, cost: $%1.2f", this.name,
          this.size, this.getPrice());
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
    double price;
    if (this.size == "small") {
      price = this.price_per_oz * size_in_oz_small;
    } else if (this.size == "medium") {
      price = this.price_per_oz * size_in_oz_medium;
    } else if (this.size == "large") {
      price = this.price_per_oz * size_in_oz_large;
    } else {
      throw new Exception();
    }
    return price;
  }
}
