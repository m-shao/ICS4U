import java.util.ArrayList;
import java.util.Scanner;

public class Part1 {
    public static void run() {

        Scanner userInput = new Scanner(System.in);

        // Jam objects are created and assigned the initial value amount
        ExpirationDate date1 = new ExpirationDate(05, 12, 2023, 100);
        Jam strawberry = new Jam("Strawberry", date1, 120);
        Jam raspberry = new Jam("Raspberry", "09122023", 80);
        Jam cherry = new Jam("Cherry", "10112023", 160);

        Pantry pantry = new Pantry(strawberry, raspberry, cherry);

        int jamChoice = 0;
        int spreadAmount = 0;

        System.out.println("Welcome to Mother Hubbard's Pantry!\n");
        
        while (jamChoice != -1) {
            System.out.println("The jams are:");
            System.out.println(pantry);

            System.out.println("Enter your selection(1,2 or 3)");
            jamChoice = userInput.nextInt();
            userInput.nextLine(); 
            if (jamChoice == -1) break;
            else if (jamChoice != 1 && jamChoice != 2 && jamChoice != 3){
                System.out.println("That jam index is out of range");
                continue;
            }

            System.out.println("Enter amount to spread: ");
            spreadAmount = userInput.nextInt();
            userInput.nextLine();

            pantry.select(jamChoice);
            pantry.spread(spreadAmount);
            System.out.println("\n-------------------------\n");
        }

        System.out.println("Good-by");

    }
}