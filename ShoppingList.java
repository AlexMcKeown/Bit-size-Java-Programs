import java.util.Scanner;
import java.util.ArrayList;
class ShoppingList{
	private static ArrayList<String> list;
	
	public ShoppingList(){ // Default constructor
		list = new ArrayList<String>(); 
	}
	
	public static void main(String[] args){
		displayMenu();
    }

	public void addTask(String input){ // newTask object from "displayMenu()"
		list.add(input); // adds to list
	}
	
	public String[] convertToArray(){
	    String[] array = new String[list.size()];
	    for (int i = 0; i < array.length; i++)
	    {
	        array[i] = list.get(i);
	    }
	    return array;
	}
	public void printList(String[] array){ // newTask from getSortedList i.e it returns a array Task[]
		for(String element : list){
			System.out.println(element);
		}
	}
	
	private static void displayMenu(){
		Scanner input = new Scanner(System.in);
		ShoppingList shoppingList = new ShoppingList();
		String option;
		
		
		do{
			System.out.print("Please input product name: ");
		    option = input.next();
			
			if(!option.equals("None")){
				shoppingList.addTask(option);
			}

			if(option.equals("None")){
				switch(option){
				case "None":
				String[] array = shoppingList.convertToArray();
				shoppingList.printList(array);
			}
		}
		
		
		}while(!option.equals("None"));
		
		
}
}