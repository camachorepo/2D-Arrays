import java.util.Scanner;

public class planeMovement {
	
	public static void main (String [] args) {
		Scanner reader = new Scanner(System.in);
		char[][] space = new char [5][5]; 
		int current_row =0; 
		int current_column =0; 
		boolean error_message = false;
		String movement = "";
		
		
		
		for(int i=0; i<space.length; i++) {
			
			for (int j=0; j< space[i].length; j++) {
						
					space[i][j] = 'O';	
			}
		}
		space [0][0] = 'X';
		
		
		System.out.println("Hello Welcome come to my game!!!");
		System.out.println("X marks the spot of your current position");
		System.out.println("You can move by tying forward, backward, up, or down");
		for(;;) {
			
		
			for (int row=0; row<space.length; row++) {
				
				for (int column=0; column<space[row].length; column++) {
					
					System.out.print(space[row][column] + " ");
				
				}
				System.out.println();
				
				
			}
			
			System.out.println("Where would you like to move:");
			movement = reader.nextLine().toLowerCase();
			
			switch (movement)
			{
			case "forward":
				if(current_column+1 < space.length) {
					current_column+=1;
					space[current_row][current_column] = 'X';
					space[current_row][current_column-1] = 'O';
				}		
								
				else {
					
					error_message = true;
					System.out.println("You moved off the map");
				}
				break;
			case "backward": 
				if (current_column -1 > -1){
					
					current_column-=1;
					space[current_row][current_column] = 'X';
					space[current_row][current_column+1] = 'O';
				
				}
				
				
				else {
					
					error_message = true;
					System.out.println("You moved off the map");
				}
				break;
			case "up":
				if(current_row -1 > -1) {
					
					current_row-=1;
					space[current_row][current_column] = 'X';
					space[current_row+1][current_column] = 'O';
					
				}
				else {
					
					error_message = true;
					System.out.println("You moved off the map");
				}
				break; 
			case "down": 
				if(current_row +1 < space[current_column].length) {
					
					current_row+=1;
					space[current_row][current_column] = 'X';
					space[current_row-1][current_column] = 'O';
					
				}
				else {
					
					error_message = true;
					System.out.println("You moved off the map");
				}
					
				break; 
			default: 
				System.out.println("You entered in an invalid placement Try  Again!");
			
		}
			
			if (error_message) {
				
				System.out.println("Game will now quit");
				System.out.println("Thanks for playing!");
				break;
				
			}
		
		}
		
		

	}
}