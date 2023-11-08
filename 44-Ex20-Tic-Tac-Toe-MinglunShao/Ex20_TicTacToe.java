public class Ex20_TicTacToe {

	public static void run() {
		//create double array for Tic Tac Toe Board
		String[][] tictactoe = new String[3][3];
		//create board with numbered spots
        setupBoard(tictactoe);
        //print board
        print2DString(tictactoe);

        boolean winner = false;
        String player;
        String spot;
        while(!winner){
            player = "X";
            System.out.println("Player 1: Select a number to fill with 'X'");
            spot = Library.input.nextLine();
            addPlay(tictactoe, spot, player);
            print2DString(tictactoe);
            winner = checkWinner(tictactoe);
            if(winner){
                System.out.println("The winner is player 1");
                break;
            }
            
            player = "0";
            System.out.println("Player 2: Select a number to fill with 'O'");
            spot = Library.input.nextLine();
            addPlay(tictactoe, spot, player);
            print2DString(tictactoe);
            winner = checkWinner(tictactoe);
            if(winner){
                System.out.println("The winner is player 2");
            }
        }
	}// end run

	public static boolean checkWinner(String[][] tictactoe) {
		// use a for loop to check if a row is a winner
        boolean isWinner;
        String rowValue;
        for (int i=0;i<tictactoe.length;i++){
            rowValue = tictactoe[i][0];
            isWinner = true;
            for (int j=0;j<tictactoe[i].length;j++){
                if (tictactoe[i][j] != rowValue){
                    isWinner = false;
                }
            }
            if (isWinner) return true;
        }	
		// use a for loop to check columns
        for (int i=0;i<tictactoe.length;i++){
            rowValue = tictactoe[i][0];
            isWinner = true;
            for (int j=0;j<tictactoe[i].length;j++){
                if (tictactoe[j][i] != rowValue){
                    isWinner = false;
                }
            }
            if (isWinner) return true;
        }	
		
		// check both diagonals
        rowValue = tictactoe[0][0];
        isWinner = true;
        for (int i=0;i<tictactoe.length;i++){
            if (tictactoe[i][i] != rowValue){
                isWinner = false;
            }
        }	
        if (isWinner) return true;

        rowValue = tictactoe[0][tictactoe.length - 1];
        isWinner = true;
        for (int i=0;i<tictactoe.length;i++){
            if (tictactoe[i][tictactoe.length - 1 - i] != rowValue){
                isWinner = false;
            }
        }	
        if (isWinner) return true;
				
		return false;
	}// end checkWinner

	public static void print2DString(String[][] arr) {
        for (String[] row : arr){
            for (String tile : row){
                System.out.print("|" + tile);
            }
            System.out.println("|");
        }	
	}// end print2dString

	//fill board with numbers from 1 to 9 consecutively
	public static void setupBoard(String[][] tictactoe) {
        int space = 1;
		for (int i=0;i<tictactoe.length;i++){
            for (int j=0;j<tictactoe[i].length;j++){
                tictactoe[i][j] = String.valueOf(space++);
            }
        }
	}// end setupBoard

	
	public static void addPlay(String[][] tictactoe, String spot , String player) {
        for (int i=0;i<tictactoe.length;i++){
            for (int j=0;j<tictactoe[i].length;j++){
                if (tictactoe[i][j].equals(spot)){
                    tictactoe[i][j] = player;
                }
            }
        }
		
	}// end addPlay

	
}// end class
