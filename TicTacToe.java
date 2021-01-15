import java.util.Scanner;

public class TicTacToe {
	public char board[] = new char[10];
	public char player_Symbol;
	public char computer_Symbol;

    public static void main(String[] args) {
	TicTacToe tictactoe = new TicTacToe();
        Scanner userInput = new Scanner(System.in);
	System.out.println("choose your letter: ");
	tictactoe.chooseUserLetter(userInput.next());
	tictactoe.creatBoard();
	tictactoe.ShowBoard();

	}
    public void creatBoard() {
        for (int i=0; i < 10; i++) {
            board[i]=' ';
        }
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
    public  void ShowBoard() {
	System.out.println("|----|----|----|");
	System.out.println("|    |    |    |");
	System.out.println("|----|----|----|");
	System.out.println("|    |    |    |");
	System.out.println("|----|----|----|");
	System.out.println("|    |    |    |");
	System.out.println("|----|----|----|");

        }
}
