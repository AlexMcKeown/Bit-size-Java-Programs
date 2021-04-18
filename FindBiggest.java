import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class FindBiggest{
	private static int max;
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int lengthOfArray;
		System.out.print("Please input the number of integers ");
	    lengthOfArray = input.nextInt();
		
		
		while(lengthOfArray<0){
			System.out.print("Please re-input a valid value that is a postive int");
			lengthOfArray = input.nextInt();	
		}
		int[] array;
		
		int size = lengthOfArray;
		
		array = new int[size];
	
        for (int i = 0; i < array.length; i++) {
			double randomNumber = Math.random()*100;
			int randomInt= (int)randomNumber+1;
            array[i] = randomInt;
        }
		System.out.println("List of integers "+ java.util.Arrays.toString(array));
        int biggestInt = biggest(array);
		System.out.println("Biggest integer "+ biggestInt);
		int bigIndex = biggestIndex(array);
		System.out.println("Index of the biggest integer "+bigIndex);
		
		
    }

    private static int biggest(int[] array) {
        max = array[0];
		int i;
        for(i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
	}
	
    private static int biggestIndex(int[] array) {
	    int i;
	    for(i=0; i<array.length; i++){
           if(array[i] == max){
			   return i;
           	
           }
	    } return i;
	  
  	}
}