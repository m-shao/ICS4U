import java.io.Console;

class Ex7_Arrays {
    public static void run() {

        // 3 ways to set up an array:
        // 1. Empty - double[] myStudentAverages = new double[36];
        // - The 36 in the above line sets up 36 slots in the array.
        // Rembember that you always need to set the length at the beginning.
        // 2. Filled - String[] myDay1 = {"ICS4U-10", "SCH4U-20", "FIF4U-30",
        // "MHF4U-40"};
        // 3. Using another method that returns an array such as String.split()

        String[] songTitles = { "Slime You Out", "Jee Ni Lagda", "Lip Shade", "greedy", "get him back!" };
        int[] numplays = new int[5];
        String[] songLengths;

        // Using the Split method that takes a String and creates a String Array
        String times = "5:10, 2:21, 2:11, 2:34, 3:29";
        songLengths = times.split(", "); // comma space is used to create the new array

        String song;
        int foundIndex;

        while (true) {
            printArrays(songTitles, numplays, songLengths);

            System.out.println("What song would you like to play?('q' to quit)");
            song = Library.input.nextLine();
            if (song.equalsIgnoreCase("q")) {
                break;
            }

            foundIndex = linearSearch(songTitles, song);
            if (foundIndex == -1) {
                System.out.println("not found");
            } else {
                numplays[foundIndex] += 1;
            }
        }
        int totalplays = 0;
        for (int i = 0; i < numplays.length; i++) {
            totalplays += numplays[i];
        }
        System.out.println("Total number of songs played: " + totalplays);

    }// end run

    public static void printArrays(String[] stringarr, int[] intarr, String[] stringarr2) {
        Console col = System.console();

        for (int i = 0; i < stringarr.length; i++) {
            if (col != null) {
                // String format
                String fmt = "%1$15s %2$10s %3$10s%n";
                // format
                col.format(fmt, stringarr[i], intarr[i], stringarr2[i]);
            }
        }
    }// printArrays

    public static int linearSearch(String[] arr, String searchTerm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(searchTerm)) {
                return i;
            }
        }
        return -1;
    } // linear search - String Array

}// end class
