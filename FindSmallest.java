class FindSmallest{
	public static int smallestInt;	
	public static void main(String[] args) {
		int[] array = new int[10];
	
		
        for (int i = 0; i < array.length; i++) {
			double randomNumber = Math.random()*100;
			int randomInt= (int)randomNumber+1;
            array[i] = randomInt;
        }
		System.out.println("List of integers "+ java.util.Arrays.toString(array));
        smallestInt = smallest(array);
		System.out.println("Smallest integer "+ smallestInt);
		int smallIndex = smallestIndex(array);
		System.out.println("Index of the smallest integer "+smallIndex);
		
		
    }

    private static int smallest(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
	}
	
    private static int smallestIndex(int[] array) {
	    int i;
	    for(i=0; i<array.length; i++){
           if(array[i] == smallestInt){
			   return i;
           	
           }
	    } return i;
	}
}

/*double randomNumber = Math.random()*100;
double randomInt= randomNumber+1;*/