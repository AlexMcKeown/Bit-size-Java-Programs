
class Product{
    private String name;
	private double price;
	private int productID;
	private static int total; 
	
public Product(String a, double b) { 
	total++;
	productID=+total;
	name = a;
	price=b;
}	
public String getName(){
	return name;
}
	
public int getProductID(){
	return productID;

}
	
public double getPrice(){ 
	return price;
}	

public void changePrice(double changePriceTo){ 
	price = changePriceTo;
}

public static int getTotal(){ 
	return total;
	
  }
}
  

class CashRegister {
	private double totalPurchase;
	private double productPrice;
	private int numberOfItems;

	public double getTotalPurchases(){
		return totalPurchase;	
	}
	public double getProductPrice(){
		return productPrice;
	}
	public int getNumberOfItems(){
		return numberOfItems;
	}
	
	public void scanProduct(Product product){
	    totalPurchase = totalPurchase+product.getPrice();
	    numberOfItems++;
    }
}


class CheckOut{
    private String name;
	private double price;
	private int productID;
	private static int total; 
	public static void main(String[] args) {
		Product[] product = new Product[3];
		product[0] = new Product("Milk", 2.99);
		product[1] = new Product("Apple", 5.49);	
		product[2] = new Product("Bread", 1.75);
		
		CashRegister cashRegister = new CashRegister();
        cashRegister.scanProduct(product[0]);
        cashRegister.scanProduct(product[1]);
        cashRegister.scanProduct(product[2]);
		
		System.out.println("***** At Register 1 *****");
		System.out.println("You have purchased " + cashRegister.getNumberOfItems() +" items");
		System.out.println(" Total: " + cashRegister.getTotalPurchases());
		
        cashRegister.scanProduct(product[1]);
		
		System.out.println("You have purchased " + cashRegister.getNumberOfItems() +" items");
		System.out.println(" Total: " + cashRegister.getTotalPurchases());
		System.out.println("");
		System.out.println("");
		
				
		CashRegister cashRegister1 = new CashRegister();
        cashRegister1.scanProduct(product[0]);
        cashRegister1.scanProduct(product[2]);
				
		System.out.println("***** At Register 2 *****");		
		System.out.println("You have purchased " + cashRegister1.getNumberOfItems() +" items");
		System.out.println(" Total: " + cashRegister1.getTotalPurchases());

  }
}
  
  


