import java.util.ArrayList;
import java.util.Arrays;
import java.io.Console;
import java.util.Scanner;

class Act8_Crops{

    static Scanner myScan = new Scanner(System.in);

    static ArrayList <String> allNames = new ArrayList(
        Arrays.asList(
            "Corn", "Wheat", "Potatoes", "Carrots", "Beets"
        )
    );
    static ArrayList <Integer> allAcres = new ArrayList(
        Arrays.asList(
            200, 200, 200, 200, 200
        )
    );
    static ArrayList <Double> allYield = new ArrayList(
        Arrays.asList(
            200.0, 58.1, 10.0, 15.0, 20.0
        )
    );
    static ArrayList <String> allUnits = new ArrayList(
        Arrays.asList(
            "Bushels", "Bushels", "Tons", "Tons", "Tons"
        )
    );
    static ArrayList <Double> allPrices = new ArrayList(
        Arrays.asList(
            4.70, 9.13, 1107.00, 1905.08, 80.00
        )
    );

    static Console cnsl = System.console();
    static final String fmt = "%1$15s %2$15s %3$15s %4$15s %5$15s %n";

    static double totalRevenue = 0;

    public static void run(){
        int userChoice = 0;
        while (userChoice != 4){
            printMenu();
            
            userChoice = myScan.nextInt();
            myScan.nextLine();

            System.out.println("\n----------------------------------\n");
    
            if (userChoice == 1){
                farmSummary();
            } else if (userChoice == 2){
                searchAndHarvest();
            } else if (userChoice == 3){
                calculateRevenue();
            }

            System.out.println("\n----------------------------------\n");
        }
    }//end run

    static void printMenu(){
        System.out.println("1. Print farm summary");
        System.out.println("2. Search & harvest a crop");
        System.out.println("3. Calculate revenue");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");
    }

    static void farmSummary(){
        cnsl.format(fmt, "Crop Type", "Acres", "Yield Per Acre", "Unit of Yield", "Price per Unit");
        for (int i=0;i<allNames.size();i++){
            cnsl.format(fmt, 
                       allNames.get(i),
                       allAcres.get(i),
                       allYield.get(i),
                       allUnits.get(i),
                       allPrices.get(i));
        }
    }
    static void searchAndHarvest(){
        System.out.println("What crop would you like to search?");
        String userCrop = myScan.nextLine();
        int foundCropInd = -1;
        for (int i=0;i<allNames.size();i++){
            if (allNames.get(i).equalsIgnoreCase(userCrop)){
                foundCropInd = i;
            }
        }
        if (foundCropInd == -1){
            System.out.println("This crop was not found");
        } else {
            cnsl.format(fmt, "Crop Type", "Acres", "Yield Per Acre", "Unit of Yield", "Price per Unit");
            cnsl.format(fmt, 
                       allNames.get(foundCropInd),
                       allAcres.get(foundCropInd),
                       allYield.get(foundCropInd),
                       allUnits.get(foundCropInd),
                       allPrices.get(foundCropInd));
            double yieldValue = allPrices.get(foundCropInd) 
                                * allYield.get(foundCropInd) 
                                * allAcres.get(foundCropInd);
            System.out.println("The value of the yield is: " 
                + String.format("$%.2f", yieldValue));

            allAcres.set(foundCropInd, 0);
            totalRevenue += yieldValue;
        }
    }

    static void calculateRevenue(){
        System.out.println("Total revenue from all harvested crops: $" 
            + String.format("%.2f", totalRevenue));
    }
   
}//end class

