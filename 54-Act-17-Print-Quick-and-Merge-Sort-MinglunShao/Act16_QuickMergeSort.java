import java.util.ArrayList;
import java.util.Arrays;

class Act16_QuickMergeSort {
    public static void run() {

        ArrayList<Integer> integers = new ArrayList();
        ArrayList<Double> doubles = new ArrayList();
        ArrayList<String> strings = new ArrayList();

        integers.addAll(Arrays.asList(9, 2, 3, 1, 11, 5, 8, 6, 4, 15, 0, 1111, -18));
        doubles.addAll(Arrays.asList(0.1, -9.9, 100.2, 5.42, 5.41, 64.3, 0.7, -16.3, 4.4, 6.5, 1200.9, -9.91, 0.0));
        strings.addAll(Arrays.asList("pear", "apple", "banana", "watermelon", "orange", "kiwi", "blueberry",
                "strawberry", "coconut", "grape", "apple"));

        // lists for quick sort
        ArrayList<Integer> integers2 = new ArrayList();
        ArrayList<Double> doubles2 = new ArrayList();
        ArrayList<String> strings2 = new ArrayList();

        integers2.addAll(Arrays.asList(9, 2, 3, 1, 11, 5, 8, 6, 4, 15, 0, 1111, -18));
        doubles2.addAll(Arrays.asList(0.1, -9.9, 100.2, 5.42, 5.41, 64.3, 0.7, -16.3, 4.4, 6.5, 1200.9, -9.91, 0.0));
        strings2.addAll(Arrays.asList("pear", "apple", "banana", "watermelon", "orange", "kiwi", "blueberry",
                "strawberry", "coconut", "grape", "apple"));

        // print out merge sorted lists
        System.out.println(Library.TEXT_RED + "\nMerge Sorts:" + Library.TEXT_RESET);
        System.out.println(Library.TEXT_BLUE + "\nBefore Sort:" +
                Library.TEXT_RESET);
        System.out.println("Integers: " + integers);
        System.out.println("Doubles: " + doubles);
        System.out.println("Strings: " + strings);

        // merge sorts
        integers = RecursiveSorts.mergeSortIntegers(integers, integers.size());
        doubles = RecursiveSorts.mergeSortDoubles(doubles, doubles.size());
        strings = RecursiveSorts.mergeSortStrings(strings, strings.size());

        System.out.println(Library.TEXT_PURPLE + "\nAfter Sort:" +
                Library.TEXT_RESET);
        System.out.println("Integers: " + integers);
        System.out.println("Doubles: " + doubles);
        System.out.println("Strings: " + strings);

        // print out quick sorted lists
        System.out.println(Library.TEXT_RED + "\nQuick Sorts:" + Library.TEXT_RESET);
        System.out.println(Library.TEXT_BLUE + "\nBefore Sort:" +
                Library.TEXT_RESET);
        System.out.println("Integers: " + integers2);
        System.out.println("Doubles: " + doubles2);
        System.out.println("Strings: " + strings2);

        // quick sorts
        RecursiveSorts.quickSortIntegers(integers2, 0, integers2.size());
        RecursiveSorts.quickSortDoubles(doubles2, 0, doubles2.size());
        RecursiveSorts.quickSortStrings(strings2, 0, strings2.size());

        System.out.println(Library.TEXT_PURPLE + "\nAfter Sort:" +
                Library.TEXT_RESET);
        System.out.println("Integers: " + integers2);
        System.out.println("Doubles: " + doubles2);
        System.out.println("Strings: " + strings2);
    }
}