//****incomplete*****
public class Pantry2Tester {
    public static void run() {

        // Jam objects are created and assigned the initial value amount
        ExpirationDate date1 = new ExpirationDate(05, 12, 2023, 100);
        Jam strawberry = new Jam("Strawberry", date1, 120);
        Jam raspberry = new Jam("Raspberry", "09122023", 80);
        Jam cherry = new Jam("Cherry", "10112023", 160);

        Pantry2 hubbard = new Pantry2(strawberry, raspberry, cherry);

        printDivider("Inital Pantry");

        System.out.println(hubbard);

        printDivider("Select 1 and Spread 20mL");

        if (hubbard.select(1))
            hubbard.spread(20);
        else
            System.out.println("Selection not available");
        System.out.println(hubbard);

        printDivider("Select 3 and Spread 50mL");

        if (hubbard.select(3))
            hubbard.spread(50);
        else
            System.out.println("Selection not available");
        System.out.println(hubbard);

        printDivider("Select 2 and Spread 100mL (100mL is more than capacity)");

        if (hubbard.select(2))
            hubbard.spread(100);
        else
            System.out.println("Selection not available");
        System.out.println(hubbard);

        printDivider("Init Hubbard with 1 null jam");
        hubbard = new Pantry2(new Jam("Strawberry", date1, 120), new Jam("Raspberry", "09122023", 80));

        printDivider("Inital Pantry");

        System.out.println(hubbard);

        printDivider("Select 1 and Spread 20mL");

        if (hubbard.select(1))
            hubbard.spread(20);
        else
            System.out.println("Selection not available");
        System.out.println(hubbard);

        printDivider("Select 3 and Spread 50mL (3 does not exist)");

        if (hubbard.select(3))
            hubbard.spread(50);
        else
            System.out.println("Selection not available");
        System.out.println(hubbard);

        printDivider("Select 2 and Spread 100mL (100mL is more than capacity)");

        if (hubbard.select(2))
            hubbard.spread(100);
        else
            System.out.println("Selection not available");
        System.out.println(hubbard);

        printDivider("Init Hubbard with 2 null jams");
        hubbard = new Pantry2(new Jam("Strawberry", date1, 120));

        printDivider("Inital Pantry");

        System.out.println(hubbard);

        printDivider("Select 1 and Spread 20mL");

        if (hubbard.select(1))
            hubbard.spread(20);
        else
            System.out.println("Selection not available");
        System.out.println(hubbard);

        printDivider("Select 3 and Spread 50mL (3 does not exist)");

        if (hubbard.select(3))
            hubbard.spread(50);
        else
            System.out.println("Selection not available");
        System.out.println(hubbard);

        printDivider("Select 2 and Spread 100mL (2 does not exist)");

        if (hubbard.select(2))
            hubbard.spread(100);
        else
            System.out.println("Selection not available");
        System.out.println(hubbard);

    }

    public static void printDivider(String message) {
        System.out.println("\n");
        System.out.println(message);
        System.out.println("---------------------------");
    }
}
