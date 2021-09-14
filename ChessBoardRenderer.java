

public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {
		int set;
		if(((square%16)<8)){
			set=1;
		}else {
			set=0;
		}
		if ((set+square)%2 ==0) {
			return true;
	    }	
		return false;
	}
}
