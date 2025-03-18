package javaExercise;
import java.util.*;
import java.util.Scanner;

class Product {
	private String pdCode;
	private String pdName;
	private double pdPrice;
	
	public Product(String pdCode, String pdName, double pdPrice) {
		this.pdCode = pdCode;
		this.pdName = pdName;
		this.pdPrice = pdPrice;
	}
	
	//Getter
	public String getPdCode() {
		return pdCode;
	}
	
	public String getPdName() {
		return pdName;
	}
	
	public double getPdPrice() {
		return pdPrice;
	}

	@Override
	public String toString() {
		return "Product [Product Code = " + pdCode + ", Product Name = " + pdName + ", Product Price = $" + pdPrice + "]";
	}
	
	
}

public class ProductMap {
	public static void main(String[] args) {
		
		//create five product objects
		Product p1 = new Product("P001", "Laptop", 800.00);
		Product p2 = new Product("P002", "Smartphone", 500.00);
        Product p3 = new Product("P003", "Tablet", 300.00);
        Product p4 = new Product("P004", "Monitor", 150.00);
        Product p5 = new Product("P005", "Keyboard", 50.00);
        
        // add products to a Map with product code as key
        Map<String, Product> productMap = new HashMap<>();
        productMap.put(p1.getPdCode(), p1);
        productMap.put(p2.getPdCode(), p2);
        productMap.put(p3.getPdCode(), p3);
        productMap.put(p4.getPdCode(), p4);
        productMap.put(p5.getPdCode(), p5);
        
        //ask user inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product code to search (eg. P000): ");
        String searchCode = sc.nextLine().trim();
        sc.close();
        
        if(productMap.containsKey(searchCode)) {
        	Product foundProdcut = productMap.get(searchCode);
        	System.out.println("Found prouct: " + foundProdcut);
        } else {
        	System.out.println("Product with code " + searchCode + " not found.");
        }
        
	}
}
