public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	
	private int numQueens = 0;

	private int getColumn(int cellId) {
		return cellId%8;
	}
	
	private int getRow(int cellId) {
		return cellId/8;
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;
		if(numQueens == 8) throw new GameOverException();
		
		int col = getColumn(cellId);
		int row = getRow(cellId);
		if(placedQueens[row][col]!=false) {
			return false;
		}else{
			for(int i=0;i<8;i++) {
				placedQueens[row][i]=isValid;
				placedQueens[i][col]=isValid;
			}
		++numQueens;
		return isValid;
		}
	}
}














