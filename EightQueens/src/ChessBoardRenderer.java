public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {
		System.out.println(square);
		return ((square/8)%2 == 0 && square%2 != 0) || ((square/8)%2 != 0 && square%2 == 0);
	}
}
