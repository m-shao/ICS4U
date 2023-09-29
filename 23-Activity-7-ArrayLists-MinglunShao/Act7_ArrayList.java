import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Act7_ArrayList {

    public static void run() {
        ArrayList<String> competitors = new ArrayList<String>(
            Arrays.asList("Bob", "Jill", "Matt", "Gill", "Jeff", "Nate", "Sal", "John", "Bill", "Corn"));
        ArrayList<String> styles = new ArrayList<String>(
            Arrays.asList("Pop", "Duet", "Classical", "Pop", "Duet", "Pop", "Pop", "Duet", "Classical", "Duet"));
        ArrayList<Integer> scores = new ArrayList<Integer>(
            Arrays.asList(55, 12, 26, 35, 44, 53, 68, 74, 85, 90));

        Scanner myScan = new Scanner(System.in);
        int newScore;
        String changedCompetitor;
        while(true){
            printStats(competitors, styles, scores);
            System.out.println("Give me the name of the competitor you want to change the score of");
            changedCompetitor = myScan.nextLine();
            System.out.println("What would you like to change their score to?");
            newScore = myScan.nextInt();
            myScan.nextLine();

            for(int i = 0; i < competitors.size(); i++){
                if (competitors.get(i).equals(changedCompetitor)){
                    scores.set(i, newScore);
                }
            }
            System.out.println(changedCompetitor + "'s Score has been changed to " + String.valueOf(newScore));
            System.out.println("\n******************** Updating Stats *********************\n");
        }
    }//end run

    public static void printStats(ArrayList<String> competitors, 
                                  ArrayList<String> styles, 
                                  ArrayList<Integer> scores){
        for (int i = 0; i < competitors.size(); i++) {
            System.out.println(competitors.get(i) + " played: " + styles.get(i) + " with a score of: " + String.valueOf(scores.get(i)));
        }//end print all data
        System.out.println("\n___________________________\n");

        System.out.println("All Pop musicians");
        for (int i = 0; i < competitors.size(); i++) {
            if (styles.get(i).equals("Pop")){
                System.out.println(competitors.get(i));
            }
        }//end print all data for Pop
        System.out.println("\n___________________________\n");

        System.out.println("Average overall score was:");
        double total = 0;
        for (int i = 0; i < scores.size(); i++) {
            total += scores.get(i);
        }//end print all data for Pop
        System.out.println(String.format("%.2f", total/scores.size()));
        System.out.println("\n___________________________\n");

        System.out.println("All competititors with score >80:");
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > 80){
                System.out.println(competitors.get(i));
            }
        }//end print all data for Pop
        System.out.println("\n___________________________\n");

        System.out.println("The competitor with the highest score was: ");
        int greatestIndex = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > scores.get(greatestIndex)){
                greatestIndex = i;
            }
        }//end print all data for Pop
        System.out.println(competitors.get(greatestIndex) + " with a score of " + String.valueOf(scores.get(greatestIndex)));
        System.out.println("\n___________________________\n");
    }

}//end class


