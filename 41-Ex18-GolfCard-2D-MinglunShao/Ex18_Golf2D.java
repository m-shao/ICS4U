class Ex18_Golf2D{
    public static void run(){

        // String[] names = new String[4];
        String[] names = {"Serena", "Diane", "Stu", "Tiger"};

        int[][] scorecard = new int[4][18];  //[rows][columns] 

        //Hole 1: 3 , 5, 5, 2
        scorecard[0][0] = 3;
        scorecard[1][0] = 5;
        scorecard[2][0] = 5;
        scorecard[3][0] = 2;
        
        //Hole 2: 4 , 4, 4, 4
        for (int i=0;i<=3;i++){
            scorecard[i][1] = 4;
        }

        //randomize all remaining scores to be between 3 and 8
        for (int i=0;i<scorecard.length;i++){
            for (int j=2;j<scorecard[i].length;j++){
                scorecard[i][j] = Library.myRandom(3,9);
            }         
        } 

        
        // Print out array
        for (int i=0;i<scorecard.length;i++){
            int totalScore = 0;
            for (int j=0;j<scorecard[i].length;j++){
                totalScore += scorecard[i][j];
                System.out.print(scorecard[i][j] + " ");
            } 
            System.out.println(names[i] + "'s Total Score: " + totalScore);
        } 


        //Calculate and print their total score at the end of each row
        
        
        
    }//run

    
}//class