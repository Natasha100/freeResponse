package game;

import java.util.Random;

public class TokenPass {
	private int[] board;
	private int currentPlayer;
	
	/** Creates the board array to be of size playerCount and fills it with
	* random integer values from 1 to 10, inclusive. Initializes currentPlayer to a
	* random integer value in the range between 0 and playerCount-1, inclusive. * @param playerCount the number of players
	*/
	public TokenPass(int playerCount) {
		Random rn = new Random();
		board = new int[playerCount];
		for (int i = 0; i < board.length; i++){
			board[i] = rn.nextInt(10) + 1;
		}
		currentPlayer = rn.nextInt(playerCount);
	}
	
	public void printBoard() {
		for(int i = 0; i < board.length; i++){
			System.out.print(board[i] + " ");
		}
		System.out.println("");
		System.out.println("Current Player Index: " + currentPlayer);
	}
	
	/** Distributes the tokens from the current player's position one at a time to each player in
	* the game. Distribution begins with the next position and continues until all the tokens
	* have been distributed. If there are still tokens to distribute when the player at the
	* highest position is reached, the next token will be distributed to the player at position 0.
	* Precondition: the current player has at least one token.
	* Postcondition: the current player has not changed.
	*/
	public void distributeCurrentPlayerTokens() {
		int currentTokenCount = board[currentPlayer]; 
		int index = currentPlayer;
		board[currentPlayer] = 0;
		while (currentTokenCount > 0){
			if (index == board.length - 1){
				index = 0;
			} else {
				index++;
			}
			board[index]++;
			currentTokenCount--;
		}
	}
	
	public static void main(String[] args) {
		TokenPass t = new TokenPass(4);
		t.printBoard();
		t.distributeCurrentPlayerTokens();
		t.printBoard();
		
	}
}