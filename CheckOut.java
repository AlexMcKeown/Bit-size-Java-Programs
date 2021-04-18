class CheckOut{
    private String name;
	private double price;
	private int productID;
	private static int total; 
public CheckOut(String a, double b) { 
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
  