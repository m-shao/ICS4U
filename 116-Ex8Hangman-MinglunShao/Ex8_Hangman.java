class Ex8_Hangman {
    public static void run() {

        System.out.println("Welcome to Hangman");
        // drawhangman(6);
		
        //store the solution
        String startWord = "Software"; 
		//create an array of letters out of your solution
        String[] solution = startWord.split(""); 
		//create an array to store the users progress
        String[] currentGuess = new String[ solution.length ];

		//fill users array with underscores
        for(int i=0; i<currentGuess.length; i++){
            currentGuess[i] = "_";            
        }

        int numWrong = 0; // set number of guesses to 0
		//create while loop that allows for 6 gusses
        while(numWrong < 6){
			//print out current progress
            System.out.print("The word is: ");
            for (int i=0;i<currentGuess.length;i++){
                System.out.print(currentGuess[i] + " ");
            }
            System.out.println();

			//create boolean variable for searching if mathching letter is found
            boolean found = false;

			//get guess from user
            System.out.println("What is your letter guess?");
            String guess = Library.input.nextLine();

			//check if guess matches any letters in the solution array
            for (int i=0;i<solution.length;i++){ 
                if(guess.equalsIgnoreCase(solution[i])){
                    found = true;
                    currentGuess[i] = guess;
                }
            }
				

			//keep count of the number of incorrect guesses
            if(!found){
                System.out.println("incorrect");
                numWrong++;
            }
			//draw current hangman picture
            drawhangman(numWrong);

			//create boolean variable for checking if all underscores have been replaced
            boolean done = true;
			//check if all underscores have been replaced

            for (int i=0;i<currentGuess.length;i++){ 
                if(currentGuess[i].equalsIgnoreCase("_")){
                    done = false;
                }
            }
          
			//pring out congratulations method if all letters found
            if(done){
                System.out.println("You win! The word is " +startWord);
                return;
            }
                   
        }//while loop
        
        System.out.println("Victory draws near but not quickly enough for our hero!");
        
    }// run

    public static void drawhangman(int numWrong) {

        if (numWrong == 6) {
            System.out.println("             ---- \n             |  | \n             ----");
            System.out.println("            / | \\");
            System.out.println("           /  |  \\");
            System.out.println("          /   |   \\");
            System.out.println("              |   ");
            System.out.println("              |   ");
            System.out.println("             / \\");
            System.out.println("            /   \\");
            System.out.println("           /     \\");
        } // 6
        if (numWrong == 5) {
            System.out.println("            / | \\");
            System.out.println("           /  |  \\");
            System.out.println("          /   |   \\");
            System.out.println("              |   ");
            System.out.println("              |   ");
            System.out.println("             / \\");
            System.out.println("            /   \\");
            System.out.println("           /     \\");
        } // 5
        if (numWrong == 4) {

            System.out.println("             | \\");
            System.out.println("             |  \\");
            System.out.println("             |   \\");
            System.out.println("             |   ");
            System.out.println("             |   ");
            System.out.println("            / \\");
            System.out.println("           /   \\");
            System.out.println("          /     \\");
        } // 4
        if (numWrong == 3) {

            System.out.println("             | ");
            System.out.println("             |  ");
            System.out.println("             |   ");
            System.out.println("             |   ");
            System.out.println("             |   ");
            System.out.println("            / \\");
            System.out.println("           /   \\");
            System.out.println("          /     \\");
        } // 3
        if (numWrong == 2) {

            System.out.println("             | ");
            System.out.println("             |  ");
            System.out.println("             |   ");
            System.out.println("             |   ");
            System.out.println("             |   ");
            System.out.println("            / ");
            System.out.println("           /   ");
            System.out.println("          /     ");
        } // 2
        if (numWrong == 1) {
            System.out.println("             | ");
            System.out.println("             |  ");
            System.out.println("             |   ");
            System.out.println("             |   ");
            System.out.println("             |   ");
            System.out.println("             ");
            System.out.println("              ");
            System.out.println("               ");
        } // 1

    }// drawHangman

}// class
