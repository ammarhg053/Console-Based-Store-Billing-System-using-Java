import java.util.Scanner;
// Class representing an item in the store
class StoreItem {
    String productName;
    String category;
    double price;
    int stock;
     // Method to set data for a store item
    void setData(String productName, String category, double price, int stock) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }
    // Method to display item details in a formatted way
    void display() {
         System.out.printf("%-15s %-20s %-10.2f %-5d\n", category, productName, price, stock);
		//This statement is using printf (formatted output) in Java to print the values of category, productName, price, and stock in a structured format.
		//printf stands for "print formatted" and is used to format output in a structured way
		//%-15s	String (left-aligned, 15 characters wide) - category
        //20s	String (left-aligned, 20 characters wide) - productName
        //10.2f	Floating-point number (left-aligned, 10 characters wide, 2 decimal places) - price
        //5d	Integer (left-aligned, 5 characters wide) - stockNew line
    }
}
// Main class to manage the store operations
class StoreManagement {
	// Static block to print Java concepts before execution
    static {
        System.out.println("Java Concepts Used in this Program:");
        System.out.println("1. Classes and Objects");
        System.out.println("2. Encapsulation");
        System.out.println("3. Arrays");
        System.out.println("4. Loops (for, while)");
        System.out.println("5. Conditional Statements (if, switch-case)");
        System.out.println("6. 'this' Keyword");
		System.out.println("7. User Input Handling");
        System.out.println("8. String Manipulation");
        System.out.println("-------------------------------------------");
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StoreItem[] items = new StoreItem[25];  // Array to store items in the store
         // Initializing each item in the array
        for (int i = 0; i < 25; i++) {
            items[i] = new StoreItem();
        }
        // Adding predefined store items of 25 product 
        items[0].setData("Laptop", "Electronics", 50000, 10);
        items[1].setData("Smartphone", "Electronics", 25000, 15);
        items[2].setData("Headphones", "Electronics", 3000, 20);
        items[3].setData("Keyboard", "Electronics", 1500, 25);
        items[4].setData("Mouse", "Electronics", 1000, 30);
		items[5].setData("Sofa", "Furniture", 30000, 5);
        items[6].setData("Dining Table", "Furniture", 20000, 8);
        items[7].setData("Chair", "Furniture", 5000, 10);
        items[8].setData("Bed", "Furniture", 25000, 7);
        items[9].setData("Wardrobe", "Furniture", 15000, 6);
        
        items[10].setData("Rice", "Groceries", 500, 100);
        items[11].setData("Wheat Flour", "Groceries", 600, 90);
        items[12].setData("Cooking Oil", "Groceries", 1200, 70);
        items[13].setData("Sugar", "Groceries", 400, 80);
        items[14].setData("Milk", "Groceries", 50, 200);
        
        items[15].setData("Shampoo", "Personal Care", 250, 60);
        items[16].setData("Soap", "Personal Care", 100, 100);
        items[17].setData("Toothpaste", "Personal Care", 150, 90);
        items[18].setData("Deodorant", "Personal Care", 300, 70);
        items[19].setData("Face Wash", "Personal Care", 350, 50);
        
        items[20].setData("T-Shirt", "Clothing", 1000, 50);
        items[21].setData("Jeans", "Clothing", 2000, 40);
        items[22].setData("Jacket", "Clothing", 5000, 20);
        items[23].setData("Sweater", "Clothing", 3000, 25);
        items[24].setData("Shoes", "Clothing", 4000, 30);
		// Login system for store access in this only three chances is given  if wrong  more than 3 then system Terminated
		//Default Username and password is admin123
		int attempts = 3;
        while (attempts > 0) {
            System.out.print("Enter username: ");
            String username = sc.next();
            System.out.print("Enter password: ");
            String password = sc.next();
            
            if (username.equals("admin123") && password.equals("admin123")) {
                // ANSI escape codes for dark green text
                System.out.println("\u001B[32m\u001B[2mLogin successful!\u001B[0m");
                break;
            } else {
                attempts--;
				// ANSI escape codes for dark Red text
                System.out.println("\u001B[31m\u001B[2mInvalid credentials! Attempts left: " + attempts + "\u001B[0m");

            }
            
            if (attempts == 0) {
				// ANSI escape codes for dark Red text
                System.out.println("\u001B[31m\u001B[2mToo many failed attempts. Exiting system.\u001B[0m");
                return; //exit the system
				//// now no code  will  execute
            }
        }
		
		
		
        
        double totalCollected = 0;
        double totalCash = 0;
        double totalOnline = 0;
        int billNumber = 1;
        sc.nextLine(); //// Consume the leftover newline
        System.out.print("Enter Store Name: ");
        String shopName = sc.nextLine();
        System.out.print("Enter POS Operator Name: ");
        String posOperator = sc.nextLine();
        boolean condition = true; //loop is working 
        
        while (condition) {
            System.out.println("1. View All Products");
			System.out.println("2. View Products by Category");
            System.out.println("3. Add to Cart");
            System.out.println("4. Checkout");
            System.out.println("5. View Low Stock Items");
            System.out.println("6. Restock Product");
            System.out.println("7. View Sales Summary");
            System.out.println("8. Exit");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
				    System.out.printf("%-15s %-20s %-10s %-5s\n", "Category", "Product Name", "Price", "Stock");
                    System.out.println("-------------------------------------------------------------");
					for(int i=0;i<items.length;i++)
					{
						items[i].display();
					}	
				break;
				case 2:
				    System.out.print("Enter Category Name: ");
					sc.nextLine();
					String categoryName = sc.nextLine();
					boolean categoryExists = false;
					System.out.printf("%-15s %-20s %-10s %-5s\n", "Category", "Product Name", "Price", "Stock");
					System.out.println("-------------------------------------------------------------");
					for (int i = 0; i < items.length; i++) {
					if (items[i].category.equalsIgnoreCase(categoryName))
					{
					items[i].display();
					categoryExists = true;
					}
                    }
					if (!categoryExists) // This runs only if categoryExists is still false
					{	
				   System.out.println("\u001B[31m\u001B[2mCategory does not exist. Please try again.\u001B[0m");
					}
                    break;
                case 3:
				   
                    boolean addMore = true;
                    while (addMore) {
						boolean productExists=false;
						System.out.println("Enter product name to add to cart:");
                        sc.nextLine();
						String cartProduct=sc.nextLine();
					   for (int i = 0; i < items.length; i++) {
                       if (items[i].productName.equalsIgnoreCase(cartProduct) && items[i].stock > 0) {
                         productExists = true; // Set to true if product is found
                        System.out.println("Enter quantity:");
                        int quantity = sc.nextInt();
                       if (quantity <= items[i].stock) {
						System.out.println("Added to cart: " + items[i].productName + " x" + quantity);
						totalCollected += items[i].price * quantity;
						items[i].stock -= quantity;
						}
						else {
						// ANSI escape codes for dark Red text
						System.out.println("\u001B[31m\u001B[2mInsufficient stock!\u001B[0m");
						}
						break; // Exit loop after finding the product
						}
						}

						if (!productExists) {   // This runs only if productExists is still false
							// ANSI escape codes for dark Red text
                            System.out.println("\u001B[31m\u001B[2mProduct does not exist. Please try again.\u001B[0m");

                        }
                        System.out.println("Do you want to add another product? (1 for Yes, 2 for No)");
                        int addChoice = sc.nextInt();
                        if (addChoice == 2) {
                            addMore = false;
                        }
                    }
                    break;
                case 4:
				    if (totalCollected == 0) {
                        System.out.println("\u001B[31m\u001B[2mNo products in cart. Please add products before checkout.\u001B[0m");

                        break;
                    }
                    double gst = totalCollected * 0.18;
                    double finalAmount = totalCollected + gst;
					System.out.println("====================================");
                    System.out.println("           " + shopName.toUpperCase() + "           ");
                    System.out.println("====================================");
                    System.out.println("Bill No: " + billNumber);
                    System.out.println("Total Amount: " + totalCollected + " rs");
                    System.out.println("GST (18%): " + gst + " rs");
                    System.out.println("Final Amount: " + finalAmount + " rs");
                    System.out.println("Choose payment method: 1. Online 2. Cash");
                    int paymentMethod = sc.nextInt();
                    sc.nextLine();
                    if (paymentMethod == 1) {
                        boolean validUPI = false;
                        while (!validUPI) {
                            System.out.print("Enter UPI ID: ");
                            String upiID = sc.nextLine();
                            if (upiID.matches(".+@.+")) {   //// Check if the UPI ID is valid
                                validUPI = true;
                                totalOnline += totalCollected;
                                System.out.println("\u001B[32m\u001B[2mPayment successful via UPI.\u001B[0m");

                            } else {
								System.out.println("\u001B[31m\u001B[2mInvalid UPI ID. Please try again.\u001B[0m");

                            }
                        }
                    } else {
                        totalCash += totalCollected;
                        System.out.println("\u001B[32m\u001B[2mPayment done in cash.\u001B[0m");

                    }
                    System.out.println("------------------------------------");
                    System.out.println("POS Operator: " + posOperator.toUpperCase());
                    System.out.println("------------------------------------");
                    totalCollected = 0;
                    billNumber++;
                    break;
                case 5:
                     boolean hasLowStock = false;
                    System.out.println("Low Stock Items (Less than 5 in stock):");
                    for (StoreItem item : items) {
                        if (item.stock < 5) {
                            item.display();
                            hasLowStock = true;
                        }
                    }
                    if (!hasLowStock) {
                        System.out.println("\u001B[31m\u001B[2mThere is no low stock in the inventory.\u001B[0m");

                    }
                    break;
                case 6:
                   boolean restockMore = true;
                    while (restockMore) {
                        System.out.print("Enter product name to restock: ");
						sc.nextLine(); // Consume newline before reading product name
						String restockProduct = sc.nextLine();
						boolean productFound = false;
						for (int i = 0; i < items.length; i++) {  // Using traditional for loop
						if (items[i].productName.equalsIgnoreCase(restockProduct)) {
						System.out.print("Enter quantity to add: ");
						int addQuantity = sc.nextInt();
						sc.nextLine(); // Consume newline after nextInt()
						items[i].stock += addQuantity;
						System.out.println("\u001B[32mStock updated successfully!\u001B[0m"); // Green text for success
						productFound = true;
						break;
						}
						}
						if (!productFound) {
						System.out.println("\u001B[31mProduct does not exist. Please try again.\u001B[0m"); // Red text for error
						}
						System.out.println("Do you want to restock another product? (1 for Yes, 2 for No)");
                        int restockChoice = sc.nextInt();
                        if (restockChoice == 2) {
                            restockMore = false;
                        }
                    }
					break;
                case 7:
				    System.out.println("Sales Summary Report:");
					System.out.println("----------------------------------------------------");
                    System.out.println("Total Cash Collected: " + totalCash + " rs");
                    System.out.println("Total Online Collected: " + totalOnline + " rs");
                    System.out.println("Total Amount Collected: " + (totalCash + totalOnline) + " rs");
					System.out.println("Total Amount Is Collected By  :"+posOperator.toUpperCase());
					System.out.println("----------------------------------------------------");
                    break;
                case 8:
                    System.out.println("Exiting The Store Billing System");
					System.out.println("Thank You For Using Our System :)");
                    condition = false;
                    break;
                default:
                    System.out.println("\u001B[31m\u001B[2mInvalid choice. Try again.\u001B[0m");

                    break;
            }
        }
       
    }
}
