# Console-Based-Store-Billing-System-using-Java
A console-based Store Billing System developed in Java as a Semester 1 individual project. The system includes login authentication, product management, billing with GST, multiple payment modes, stock control, and sales summary using core Java concepts.

Here’s a ready-made **README.txt** you can put directly in your GitHub repo (you can also save it as `README.md` if you want nice formatting on GitHub):

---

# Store Billing System (Java – Semester 1 Individual Project)

## 1. Project Overview

This is a **console-based Store Billing System** developed in **Java** as an individual project in **Semester 1**.

The project simulates a basic **Point of Sale (POS)** system for a store, allowing the operator to:

* Log in with credentials
* View products and categories
* Add items to a cart
* Generate bills with GST
* Accept different payment methods (Cash / UPI)
* Track low stock and restock items
* View a sales summary for the current session

The goal of this project is to apply core Java concepts such as **classes, objects, arrays, loops, conditional statements, and user input handling** in a real-world scenario.

---

## 2. Features

### 🔐 Login System

* Username & password based login (default: `admin123` / `admin123`)
* Maximum **3 attempts**
* If all attempts fail, the system exits with a message.

### 🏬 Product Management

* Predefined list of **25 products** across categories:

  * Electronics
  * Furniture
  * Groceries
  * Personal Care
  * Clothing
* Each product has:

  * Category
  * Product Name
  * Price
  * Stock quantity

### 🛒 Main Menu Options

1. **View All Products**

   * Displays all products in a formatted table: `Category | Product Name | Price | Stock`.

2. **View Products by Category**

   * User enters a category name.
   * Shows only products from that category.
   * If category does not exist, an error message is shown.

3. **Add to Cart**

   * User enters product name and quantity.
   * Checks:

     * If product exists
     * If enough stock is available
   * Updates the stock after adding to the cart.
   * Continues to add more products until user chooses to stop.

4. **Checkout**

   * If no products are added, warns the user.
   * Calculates:

     * Subtotal
     * GST @ 18%
     * Final amount = Subtotal + GST
   * Payment Methods:

     * **Online (UPI)** – validates basic UPI format (`something@something`)
     * **Cash**
   * Tracks:

     * Total cash collected
     * Total online amount collected
   * Prints a simple bill:

     * Store name
     * Bill number
     * Total amount, GST, final amount
     * POS operator name

5. **View Low Stock Items**

   * Shows all items with stock **less than 5**.
   * If none are low stock, shows a message.

6. **Restock Product**

   * Allows operator to increase stock of a specific product.
   * Checks if product exists, then adds quantity to stock.
   * Can restock multiple products in one go.

7. **View Sales Summary**

   * Displays:

     * Total Cash collected
     * Total Online collected
     * Total amount (Cash + Online)
     * POS Operator name

8. **Exit**

   * Exits the system with a goodbye message.

---

## 3. Java Concepts Used

The program demonstrates the following **Java concepts**:

1. **Classes and Objects**

   * `StoreItem` class for individual products
   * `StoreManagement` class containing the `main` method

2. **Encapsulation**

   * Product data (name, category, price, stock) grouped in `StoreItem`.

3. **Arrays**

   * `StoreItem[] items = new StoreItem[25];` to store multiple products.

4. **Loops**

   * `for` loops for initializing and iterating products
   * `while` loops for login attempts, menus, adding to cart, restocking.

5. **Conditional Statements**

   * `if-else`, `switch-case` for menu options and validations.

6. **`this` Keyword**

   * Used inside `setData` to refer to object fields.

7. **User Input Handling**

   * `Scanner` class for reading input from the console.

8. **String Manipulation**

   * `equalsIgnoreCase()` for case-insensitive comparison.
   * `toUpperCase()` for formatted output.
   * Basic regex with `matches()` for UPI validation.

9. **Formatted Output (`printf`)**

   * Used to display products in aligned tabular format.

10. **ANSI Escape Codes (Console Colors)**

    * Green text for success messages.
    * Red text for errors and warnings.

---

## 4. Code Structure

### `StoreItem` Class

* **Fields**:

  * `String productName;`
  * `String category;`
  * `double price;`
  * `int stock;`
* **Methods**:

  * `void setData(String productName, String category, double price, int stock)`

    * Sets product details.
  * `void display()`

    * Prints product details in a formatted row.

### `StoreManagement` Class

* Contains:

  * `static { ... }` block

    * Prints Java concepts used before `main()` runs.
  * `public static void main(String[] args)`

    * Handles:

      * Login system
      * Product initialization
      * Menu-driven operations
      * Cart, billing, payment, stock, and summary logic

---

## 5. How to Run the Project

### Requirements

* Java JDK **8 or above**
* Any IDE (IntelliJ, Eclipse, VS Code) or command line

### Using Command Line

1. Save the file as `StoreManagement.java` (both classes are in the same file).
2. Open terminal / command prompt in the file directory.
3. Compile:

   ```bash
   javac StoreManagement.java
   ```
4. Run:

   ```bash
   java StoreManagement
   ```

---

## 6. Possible Improvements (Future Scope)

* Add **file handling** to save sales history.
* Add **customer details** and billing history.
* Add **discounts, coupons, and offers**.
* Implement **object-oriented improvements** like getters/setters and constructors.
* Create a **GUI-based version** using Java Swing / JavaFX.
* Add **database (MySQL / PostgreSQL)** for persistent storage.

---

## 7. Author

* **Name:** Ammar Husain Gheewala
* **Semester:** 1
* **Project Type:** Individual – Java Store Billing System



