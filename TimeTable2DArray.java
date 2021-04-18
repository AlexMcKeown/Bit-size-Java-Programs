import java.util.Scanner;
public class TimeTable2DArray{
    
    public static void main(String[] args) {
   		TimeTable2DArray timeTable = new TimeTable2DArray();
        timeTable.print();
    }
    
    private void print(){
	    int[][] data = new int[9][9];
		 System.out.print(" * |");
        for(int i = 1; i <= data.length; i++)
		{
			System.out.printf("%4d", i); // vertical left side   
			}
            System.out.println();
            System.out.println("------------------------------------------");
			
	
	        for(int i = 1; i <= data.length; i++){
				System.out.printf(" %d |", i);
				for(int j = 1; j <= data.length; j++){
					data[j-1][i-1]= i*j;
					System.out.printf("%4d",data[j-1][i-1]);
					
			}
            System.out.println();
			
		}
			
        }
    }
            
   
