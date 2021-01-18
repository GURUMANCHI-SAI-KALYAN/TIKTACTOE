import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
	public char board[] = new char[10];
	public char player_Symbol;
	public char computer_Symbol;
	public static int first;


    public void creatBoard() {
        for (int i=0; i < 10; i++) {
            board[i]=' ';
        }
    }

    public void chooseUserLetter(String symbol) {
        if (symbol.equals("X")) {
		player_Symbol = 'X';
		computer_Symbol = 'O';
	}
	else if (symbol.equals("O")) {
		player_Symbol = 'O';
		computer_Symbol = 'X';
	}
   }

    public void ShowBoard() {
	System.out.println("|-----|-----|-----|");
	System.out.println("|  "+board[1]+"  |  "+board[2]+"  |  "+board[3]+"  |");
	System.out.println("|-----|-----|-----|");
	System.out.println("|  "+board[4]+"  |  "+board[5]+"  |  "+board[6]+"  |");
	System.out.println("|-----|-----|-----|");
	System.out.println("|  "+board[7]+"  |  "+board[8]+"  |  "+board[9]+"  |");
	System.out.println("|-----|-----|-----|");

        }

   public void player_Move( int i,int first ) {	

	if (board[i] == ' ') {
	if ( first == 1 ) {
	System.out.println("You Play First");
		board[i] = player_Symbol;
	}
	else {
		System.out.println("Computer play First");
		board[i] = computer_Symbol;
	}
	ShowBoard();
     }
  }
   
    public static void CheckWhoPlayFirst() {
	int toss = (int) Math.round(Math.random()) % 2;
	if (toss == 1) {
	first = 1;
	}
	else {
	first = 0;
	}
  }
   
    public static void main(String[] args) {
        TicTacToe tictactoe = new TicTacToe();
        Scanner userInput = new Scanner(System.in);
         tictactoe.creatBoard();
        tictactoe.CheckWhoPlayFirst();
        System.out.println("choose your letter In Capital--'X' Or Capital--'O': ");
        tictactoe.chooseUserLetter(userInput.next());
        tictactoe.ShowBoard();
        System.out.println("Enter The Position (1-9)");
        tictactoe.player_Move(userInput.nextInt(),first);
        }


}




























