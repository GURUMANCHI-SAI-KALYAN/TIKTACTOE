import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
	public char board[] = new char[10];
	public char player_Symbol;
	public char computer_Symbol;
	public static int first;
	public static int k;


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
	  public void checkwin() {
        if ((board[1] == player_Symbol && board[2] == player_Symbol && board[3] == player_Symbol)) {
            System.out.println("Player Wins");
            System.exit(0);
        }
        if ((board[4] == player_Symbol && board[5] == player_Symbol && board[6] == player_Symbol)) {
            System.out.println("Player Wins");
            System.exit(0);
        }
        if ((board[7] == player_Symbol && board[8] == player_Symbol && board[9] == player_Symbol)) {
            System.out.println("Player Wins");
            System.exit(0);
        }
        if ((board[1] == player_Symbol && board[4] == player_Symbol && board[7] == player_Symbol)) {
            System.out.println("Player Wins");
            System.exit(0);
        }
        if ((board[2] == player_Symbol && board[5] == player_Symbol && board[8] == player_Symbol)) {
            System.out.println("Player Wins");
            System.exit(0);
        }
        if ((board[3] == player_Symbol && board[6] == player_Symbol && board[9] == player_Symbol)) {
            System.out.println("Player Wins");
            System.exit(0);
        }
        if ((board[1] == player_Symbol && board[5] == player_Symbol && board[9] == player_Symbol)) {
            System.out.println("Player Wins");
            System.exit(0);
        }
        if ((board[3] == player_Symbol && board[5] == player_Symbol && board[7] == player_Symbol)) {
            System.out.println("Player Wins");
            System.exit(0);
        }
        if ((board[1] == computer_Symbol && board[2] == computer_Symbol && board[3] == computer_Symbol)) {
            System.out.println("Player Lost");
            System.exit(0);
        }
        if ((board[4] == computer_Symbol && board[5] == computer_Symbol && board[6] == computer_Symbol)) {
            System.out.println("Player Lost");
            System.exit(0);
        }
        if ((board[7] == computer_Symbol && board[8] == computer_Symbol && board[9] == computer_Symbol)) {
            System.out.println("Player Lost");
            System.exit(0);
        }
        if ((board[1] == computer_Symbol && board[4] == computer_Symbol && board[7] == computer_Symbol)) {
            System.out.println("Player Lost");
            System.exit(0);
        }
        if ((board[2] == computer_Symbol && board[5] == computer_Symbol && board[8] == computer_Symbol)) {
            System.out.println("Player Lost");
            System.exit(0);
        }
        if ((board[3] == computer_Symbol && board[6] == computer_Symbol && board[9] == computer_Symbol)) {
            System.out.println("Player Lost");
            System.exit(0);
        }
        if ((board[1] == computer_Symbol && board[5] == computer_Symbol && board[9] == computer_Symbol)) {
            System.out.println("Player Lost");
            System.exit(0);
        }
        if ((board[3] == computer_Symbol && board[5] == computer_Symbol && board[7] == computer_Symbol)) {
            System.out.println("Player Lost");
            System.exit(0);
        }
    }

    public static void computer_Plays() {
       int k = (int) (Math.floor(Math.random()) % 9 + 1); 
        }

   public void player_Move( int i ,int first, int k) {
      if ( board[i] == ' ') {
	if ( first == 1 ) {
	System.out.println("You Play First");
	board[i] = player_Symbol;
	}
	else {
		System.out.println("Computer play First");
		board[k] = computer_Symbol;
	}
	ShowBoard();
     }
  }
   
    public static void CheckWhoPlayFirst() {
	int toss = (int) Math.floor(Math.random()) % 2;
	if (toss == 1) {
	first = 1;
	}
	else {
	first = 0;
	}
  }
    public void play_Game() {
        int j;
        for (j = 0; j < 9; j++) {
            if (first == 0) {
		computer_Plays();
		first = 1;
	    }
		else {
			player_Move();
                }
		}
		first = 0;
	if (j == 9) {
		System.out.println("GAME DRAW");
		System.exit(0);
	}
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
        tictactoe.player_Move(userInput.nextInt(),first,k);
        tictactoe.play_Game();
	}
}




























