import java.util.ArrayList;
import java.util.Arrays;

class Act9_BinarySearch{
    public static void run(){
        String vowels = "aeiou";
        ArrayList<String> allAnimals = Files.loadStringList("data/animals.txt");
        ArrayList<String> allCategories = Files.loadStringList("data/categories.txt");
        ArrayList<Integer> allWeights = Files.loadIntegerList("data/weights.txt");
        ArrayList<String> allVowels = new ArrayList<String>(Arrays.asList(vowels.split("")));
        Sort.bubbleSortSSI(allAnimals, allCategories, allWeights);
        
        for (int i= 0; i < allAnimals.size(); i++){
            System.out.println(allAnimals.get(i));    
        }

        while (true){
            System.out.println("\n________________________\n");
            System.out.println("Enter a creature name(exit to quit):");
            String creature = Library.input.nextLine().strip();

            if (creature.equalsIgnoreCase("exit")){
                break;
            }
    
            int foundInd =  Search.binarySearchStrings(allAnimals, creature);
    
            if (foundInd == -1){
                System.out.println("I am sorry this creature is not in our list.  Please try again later");
            } else{
                 System.out.println("I found it.  A"
                            + (Search.linearStringSearch(allVowels, creature.substring(0,1).toLowerCase()) != -1 ? "n " : " ")
                            + allAnimals.get(foundInd) 
                            + " is " + allCategories.get(foundInd) 
                            + " and its average weight is " + allWeights.get(foundInd) +"kg");   
            }
        }
        
        
    }//run
  
}//class
