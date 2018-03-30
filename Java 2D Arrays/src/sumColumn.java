import java.util.Scanner;

public class sumColumn {

	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
		int column_value =0;
		int sum =0;
		int[][] arr = {{4,3,2}, 
				{2,6,789},
				{43,234,1278190}
		}; 
		
		
		
		System.out.println("Hello here are the values in my 2D array");
		
		for (int i=0; i<arr.length;i++) {
			
			for(int j=0; j<arr[i].length; j++ ) {
				
				System.out.print(arr[i][j] + ", " );
				
			}
			System.out.println();
		}
		
		System.out.println("Please enter a value for which column you'd like the sum for: "); 
		column_value = reader.nextInt() -1;
		
		for(int i=0; i<arr[column_value].length; i++) {
			
			sum += arr[i][column_value];
			
		}
		
		System.out.println("The sum for the column is: " + sum);
		
		
		
	}
	
	
}
