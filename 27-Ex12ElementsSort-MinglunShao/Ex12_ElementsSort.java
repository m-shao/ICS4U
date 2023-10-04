import java.util.ArrayList;
import java.util.Arrays;

class Ex12_ElementsSort {
    public static void run() {
        ArrayList<String> sciTeachers = new ArrayList();
        sciTeachers.add("Feddema");
        sciTeachers.add("Chan");
        sciTeachers.add("Yau");
        sciTeachers.add("Foshay");
        sciTeachers.add("Cuddie");

        System.out.println(sciTeachers);
        Sort.bubbleSortStrings(sciTeachers);
        System.out.println(sciTeachers);

        ArrayList<String> elements = Files.loadStringList("data/enames.txt");
        // System.out.println(elements);
        ArrayList<Double> weights = Files.loadDoubleList("data/weights.txt");

        System.out.println("Sorted by name");
        // Sort.bubbleSortStrings(elements);
        // Sort.bubbleSortDoubles(weights);
        Sort.bubbleSortPairByName(elements, weights);
        for (int i = 0; i < elements.size(); i++) {
            System.out.printf("%-15s %-15s %n", elements.get(i), weights.get(i));
            // Something has gone wrong with the sorting...

        } // end forLoop

    }// run

}// class
