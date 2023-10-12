import java.util.ArrayList;
import java.util.Arrays;

class Act10_SelectionInsertionSort {
    public static void run() {
        ArrayList<Integer> nums = new ArrayList(Arrays.asList(8,7,6,5,4,3,6,0,2,1));
        ArrayList<Integer> nums1 = new ArrayList(Arrays.asList(8,7,6,5,4,3,6,0,2,1));
        System.out.println("Before Sort: " + nums);

        Sort.selectionSortIntegers(nums);
        Sort.insertionSortIntegers(nums1);
        System.out.println("Selection Sorted Integers: " + nums);
        System.out.println("Insertion Sorted Integers: " + nums1);

        System.out.println("\n----------------------\n");

        ArrayList<Double> doubles = new ArrayList(Arrays.asList(8.8,7.7,6.6,5.5,4.4,3.3,0.0,3.3,2.2,1.1));
        ArrayList<Double> doubles1 = new ArrayList(Arrays.asList(8.8,7.7,6.6,5.5,4.4,3.3,0.0,3.3,2.2,1.1));
        System.out.println("Before Sort: " + doubles);

        Sort.selectionSortDoubles(doubles);
        Sort.insertionSortDoubles(doubles1);
        System.out.println("Selection Sorted Doubles: " + doubles);
        System.out.println("Insertion Sorted Doubles: " + doubles1);

        System.out.println("\n----------------------\n");
        
        ArrayList<String> strings = new ArrayList(Arrays.asList("h","g","f","c","b","a","e","d"));
        ArrayList<String> strings1 = new ArrayList(Arrays.asList("h","c","b","a","g","f","e","d"));
        System.out.println("Before Sort: " + strings);

        Sort.selectionSortStrings(strings);
        Sort.insertionSortStrings(strings1);
        System.out.println("Selection Sorted Strings: " + strings);
        System.out.println("Insertion Sorted Strings: " + strings1);

    }// run

}// class
