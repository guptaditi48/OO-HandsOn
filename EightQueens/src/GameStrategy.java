public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		int col=cellId % 8;
		return col;
	}
	
	private int getRow(int cellId) {
		int row=cellId/8;
		return row;
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid= true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		int row = getRow(cellId);
		int i,j;
		/* Check this row on left side */
		 for (i = 0; i <= col; i++) {
			 if (placedQueens[row][i] == true) {
				 isValid= false;
			 }
		 }
		 /* Check this row on right side */
		 for (i = col; i < 8; i++) {
			 if (placedQueens[row][i] == true) {
				 isValid =false;
			 }
		 }
			/* Check this col upside */
		 for ( i = 0; i <=row; i++) {
			 if (placedQueens[i][col] == true) {
				 isValid =false;
			 }
		 }
		 /* Check this col downside */
		 for (i = row; i < 8; i++) {
			 if (placedQueens[i][col] == true) {
				 isValid= false;
			 }
		 }
	        /* Check upper diagonal on right side */
	        for (i = row, j = col; i >= 0 && j < 8; i--, j++) { 
	            if (placedQueens[i][j] == true) {
	            	isValid= false; 
	            }
	        }
	  
	        /* Check lower diagonal on right side */
	        for (i = row, j = col; i < 8 && j < 8 ; i++, j++) {
	            if (placedQueens[i][j] == true) { 
	            	isValid= false; 
	            }
	        }
	        /* Check upper diagonal on left side */
	        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
	            if (placedQueens[i][j] == true) {
	            	isValid= false; 
	            }
	        }
	        /* Check lower diagonal on left side */
	        for (i = row, j = col; i < 8 && j >= 0 ; i++, j--) {
	            if (placedQueens[i][j] == true) {
	            	isValid= false; 
	            }
	        } 
	        if(isValid==true) {
	        	numQueens++;
	        	placedQueens[row][col]= true;
	        }
	        	
		return isValid;
	}
}














