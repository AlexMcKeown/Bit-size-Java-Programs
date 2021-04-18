import java.util.Arrays;

public class Recursion {    
    public Recursion() {
		
}
    
    public static int SumArray(int[] y, int lenght){
       int sum=0; // base case
	   
       if(y.length == 1)
       {
           sum=y[0];
       }
       else if(y.length == 0) // exceptional case
        {
          sum=0;  
        }
       else   // general case
        {
          sum =y[lenght-1]+SumArray(Arrays.copyOfRange(y, 0, lenght-1), lenght-1);
        }       
        return sum;
    }

      public static void main(String[] args) {
      // sum of array
      int[] i= {1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99,66};
      int sum =Recursion.SumArray(i, i.length);
      //int[] a={};
      // sum =Recursion.SumArray(a, a.length);
      System.out.println(sum);
      
	  
	  
	  
	  
	  
    // 2D Maze solving.
      char[][] theMaze={
          {'x','x','x','x','x','x','x','x','x','x'}, 
          {'x','S','x','x','x','x','x','x','x','x'}, 
          {'x',' ','x','x','x','x','x','x','x','x'}, 
          {'x',' ',' ',' ','x',' ','x','x','x','x'}, 
          {'x',' ','x','x','x',' ','x','x','x','x'}, 
          {'x',' ','x','x','x',' ','x','x','x','x'}, 
          {'x',' ',' ',' ',' ',' ',' ',' ','x','x'}, 
          {'x','x','x','x','x','x','x',' ','x','x'}, 
          {'x','x','x','x','x','G',' ',' ',' ','x'},
          {'x','x','x','x','x','x','x','x','x','x'}, 

          
      };
      int line=0;
            System.out.printf("  %s %s %s %s %s %s %s %s %s %s  %n",0,1,2,3,4,5,6,7,8,9); //output the Maze
      
	  for (char[] a:theMaze ){
       System.out.printf("%.2s ", line);
          line++;
          for (char c : a ){
             System.out.printf("%s ", c);  
          }
          System.out.println();
      }// print out the move 
	  
	  
       System.out.println(MazeSolving.solve(theMaze, 1, 1,-1,-1)); 
// (Array of the Maze, row,col, previous row(-1 at starting point),previous col(-1 at starting point)  )
      
      }
    
}
