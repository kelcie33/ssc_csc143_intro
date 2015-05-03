// CoffeeShop.java

// South Seattle Community College
// Spring 2015, CSC 143, Weekly #3 Coffee Shop
// Kelcie Feeney, 04/27/2015

/**
 * This class contains static methods that test drink information for
 * coffee shop orders.
 * 
 * @author Kelcie Feeney
 * @version 1.0, 04/27/2015
 * @see Drinks
 *
 */
public class CoffeeShop {

  /**
   * main is the entry point for the program
   * 
   * @param args
   *          not used
   */
  public static void main(String[] args) {
    DrinksExample();
  }

  /**
   * DrinksExample constructs a drink order from the example in the
   * assignment description.
   */
  public static void DrinksExample() {
    double base_price_per_oz = Drinks.base_price_per_oz;

    // Construct the drink order of water, coffee and tea
    NonCaffeinatedDrinks d1 = new NonCaffeinatedDrinks("water",
        base_price_per_oz, "small");
    Coffee d2 = new Coffee("coffee", 3 * base_price_per_oz, "medium",
        "mocha");
    Tea d3 = new Tea("tea", 3 * base_price_per_oz, "large", "earl grey");

    // Display information about the drink order
    System.out.println("Your order consists of:");
    System.out.println("");
    System.out.println("        " + d1.toString());
    System.out.println("        " + d2.toString());
    System.out.println("        " + d3.toString());
    System.out.println("");
    
    // Catch exception for invalid size
    System.out.print("The total cost of your order is: ");
    try {
      System.out.println(String.format("$%1.2f",
          d1.getPrice() + d2.getPrice() + d3.getPrice()));
    } catch (Exception e) {
      System.out.println("invalid size");
    }

  }
}