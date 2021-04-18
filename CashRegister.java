class CashRegister {
	private static double totalPurchase;
	public static void main(String[] args) {

		CheckOut[] checkout = new CheckOut[3];
		
		checkout[0] = new CheckOut("Milk", 2.99);
		checkout[1] = new CheckOut("Apple", 5.49);	
		checkout[2] = new CheckOut("Bread", 1.75);
		
			
		// Display all product info
		System.out.println("***** At Register 1 *****");
			System.out.println("You have purchased " + CheckOut.getTotal() 
					+" items");
			totalPurchase = checkout[0].getPrice()+checkout[1].getPrice()+checkout[2].getPrice();
			System.out.println(" Total: " + totalPurchase);
			
			checkout[1] = new CheckOut("Apple", 5.49);
			System.out.println("You have purchased " + CheckOut.getTotal() 
					+" items");
			totalPurchase = totalPurchase + checkout[1].getPrice();
			System.out.println(" Total: " + totalPurchase);
			
			
			
			CheckOut[] checkout1 = new CheckOut[2];
			checkout1[0] = new CheckOut("Milk", 2.99);
			checkout1[1] = new CheckOut("Bread", 1.75);
			
			System.out.println("***** At Register 2 *****");
			System.out.println("You have purchased " + CheckOut.getTotal() 
					+" items");
			totalPurchase = checkout1[0].getPrice()+checkout1[1].getPrice();
			System.out.println(" Total: " + totalPurchase);
			

	}
	
}


