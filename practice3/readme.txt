// readme.txt

// South Seattle Community College
// Spring 2015, CSC 143, Weekly #3 Coffee Shop
// Kelcie Feeney, 04/27/2015

This assignment created a coffee shop drink information tracking system using Java code with inheritance and polymorphism.  The base class Drinks is extended by two derived classes CaffeinatedDrinks and NonCaffeinatedDrinks.  The derived class CaffeinatedDrinks is further extended by two derived classes Coffee and Tea.  Object data name, price and size are all inherited from the base class Drinks.  Object data type and flavor are defined in derived classes Coffee and Tea, respectively.  Class data base_price_per_oz is overridden in derived classes as needed. Super class constructors are called to initialize inherited object data and thereby reduce the amount of code.

Some important classes to add are Inventory, Customer and Cashier. The class Inventory would keep track of available items.  The class Customer would initiate drink orders.  The class Cashier would collect customer money and return change.