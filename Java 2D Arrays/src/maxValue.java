
public class maxValue {

	public static void main (String[] args) {
		
		
		int[][] arr = {{4,3,2}, 
				{2,6,789},
				{43,234,1278190}
		};
		
		
		int max_value = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++ ) {
				
				if(arr[i][j] > max_value) max_value = arr[i][j]; 
				
				
				
				
			}
			
		}
		System.out.println("Max value is:" + max_value);
	}
	
	
}
