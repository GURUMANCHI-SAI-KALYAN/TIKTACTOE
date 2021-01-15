import java.util.Scanner;

public class TicTacToe {
	public char player_Symbol;
	public char computer_Symbol;

    public static void main(String[] args) {
        char[] board=createBoard();
	TicTacToe tictactoe = new TicTacToe();
        Scanner userInput = new Scanner(System.in);
	System.out.println("choose your letter: ");
	tictactoe.chooseUserLetter(userInput.next());
}
    public static char[] createBoard(){
        char[] board=new char[10];
        for (int i=0;i< board.length;i++){
            board[i]=' ';
        }
        return board;
    }

    public void chooseUserLetter(String symbol) {
        if (symbol.equals("X")) {
		player_Symbol = 'X';
		computer_Symbol = '0';
	}
	else if (symbol.equals("0")) {
		player_Symbol = '0';
		computer_Symbol = 'X';
	}
   }
}
