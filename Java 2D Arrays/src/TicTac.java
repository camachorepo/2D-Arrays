import java.util.Scanner;

public class TicTac {

	public static void main (String [] args) {
		
		
		Scanner reader = new Scanner (System.in);
		char [][] board = new char [3][3]; 
		int spaces =9;
		int row_placement =0; 
		int column_placement =0;
		
		// Fill board with blanks
		for(int i=0; i<board.length; i++) {
			
			for (int j=0; j< board[i].length; j++) {
						
					board[i][j] = ' ';	
			}
			
		}
		System.out.println("Hello Welcome to Tic Tac Toe!!");
		for (int i=0; i<spaces; i++)
		{
			System.out.println("Please enter the row you'd like to enter a value for: ");
			row_placement = reader.nextInt() -1; 
			System.out.println("Please enter the column you'd like to enter a value for: ");
			column_placement = reader.nextInt() -1; 
			
			if(board[row_placement][column_placement] == ' ') {
				
				//even 
				if((i+1) % 2 ==0 ) {
					
					board[row_placement][column_placement] = 'Y';
					
				}
				else board[row_placement][column_placement] = 'X';
				
			}
			
			
			System.out.println("Here is my current board!");
			for (int row=0; row<board.length; row++) {
				
				for (int column=0; column<board[row].length; column++) {
					
					System.out.print(board[row][column] );
					if(column != (board[row].length-1) ) System.out.print("|");
				
				}
				System.out.println();
				
				
			}
			
		
			
			
		}
		
		
		
	}
	
	
	
}
