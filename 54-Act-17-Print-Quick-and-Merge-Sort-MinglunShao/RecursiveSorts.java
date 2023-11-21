import java.util.ArrayList;
import java.util.Arrays;

class RecursiveSorts {

    // Complete the Quick sorts for Strings, Double and Integers
    public static void quickSortIntegers(ArrayList<Integer> list, int begin, int end) {
        if (begin < end) {
            int pivotLocation = partitionInteger(list, begin, end);

            quickSortIntegers(list, begin, pivotLocation);
            quickSortIntegers(list, pivotLocation + 1, end);
        }
    }

    public static void quickSortDoubles(ArrayList<Double> list, int begin, int end) {
        if (begin < end) {
            int pivotLocation = partitionDouble(list, begin, end);

            quickSortDoubles(list, begin, pivotLocation);
            quickSortDoubles(list, pivotLocation + 1, end);
        }
    }

    public static void quickSortStrings(ArrayList<String> list, int begin, int end) {
        if (begin < end) {
            int pivotLocation = partitionString(list, begin, end);

            quickSortStrings(list, begin, pivotLocation);
            quickSortStrings(list, pivotLocation + 1, end);
        }
    }

    public static int partitionInteger(ArrayList<Integer> list, int begin, int end) {
        System.out.println(Library.TEXT_GREEN + "Integer quick: list: " + list);
        int pivot = list.get(begin);
        System.out.println(Library.TEXT_RED + "Integer quick: pivot: " + pivot);
        int leftWall = begin;

        for (int i = begin + 1; i < end; i++) {
            if (list.get(i) < pivot) {
                leftWall++;
                int temp = list.get(i);
                System.out
                        .println(Library.TEXT_BLUE + "Integer quick: swapping: " + temp + " and " + list.get(leftWall));
                list.set(i, list.get(leftWall));
                list.set(leftWall, temp);
                System.out.println(Library.TEXT_PURPLE + "Integer quick: list after swap: " + list);
            }
        }

        System.out
                .println(Library.TEXT_BLUE + "Integer quick: swapping with pivot: " + list.get(leftWall) + " and "
                        + pivot);
        list.set(begin, list.get(leftWall));
        list.set(leftWall, pivot);
        System.out.println(Library.TEXT_PURPLE + "Integer quick: all items are on the correct side of pivot:  " + list);

        return leftWall;
    }

    public static int partitionDouble(ArrayList<Double> list, int begin, int end) {
        System.out.println(Library.TEXT_GREEN + "Double quick: list: " + list);
        double pivot = list.get(begin);
        System.out.println(Library.TEXT_RED + "Double quick: pivot: " + pivot);
        int leftWall = begin;

        for (int i = begin + 1; i < end; i++) {
            if (list.get(i) < pivot) {
                leftWall++;
                double temp = list.get(i);
                System.out
                        .println(Library.TEXT_BLUE + "Double quick: swapping: " + temp + " and " + list.get(leftWall));
                list.set(i, list.get(leftWall));
                list.set(leftWall, temp);
                System.out.println(Library.TEXT_PURPLE + "Double quick: list after swap: " + list);
            }
        }

        System.out
                .println(Library.TEXT_BLUE + "Double quick: swapping with pivot: " + list.get(leftWall) + " and "
                        + pivot);
        list.set(begin, list.get(leftWall));
        list.set(leftWall, pivot);
        System.out.println(Library.TEXT_PURPLE + "Double quick: all items are on the correct side of pivot:  " + list);

        return leftWall;
    }

    public static int partitionString(ArrayList<String> list, int begin, int end) {
        System.out.println(Library.TEXT_GREEN + "String quick: list: " + list);
        String pivot = list.get(begin);
        System.out.println(Library.TEXT_RED + "Strgin quick: pivot: " + pivot);
        int leftWall = begin;

        for (int i = begin + 1; i < end; i++) {
            if (list.get(i).compareTo(pivot) < 0) {
                leftWall++;
                String temp = list.get(i);
                System.out
                        .println(Library.TEXT_BLUE + "String quick: swapping: " + temp + " and " + list.get(leftWall));
                list.set(i, list.get(leftWall));
                list.set(leftWall, temp);
            }
        }

        System.out
                .println(Library.TEXT_BLUE + "String quick: swapping with pivot: " + list.get(leftWall) + " and "
                        + pivot);
        list.set(begin, list.get(leftWall));
        list.set(leftWall, pivot);
        System.out.println(Library.TEXT_PURPLE + "Double quick: all items are on the correct side of pivot:  " + list);

        return leftWall;
    }

    // Complete the Merge sorts for Strings, Double and Integers
    public static ArrayList<Integer> mergeSortIntegers(ArrayList<Integer> list, int n) {
        if (n == 1) {
            System.out.println(Library.TEXT_RED + "Integer merge: minimum array size reached");
            return list;
        }

        ArrayList<Integer> arrayOne = new ArrayList(list.subList(0, n / 2));
        ArrayList<Integer> arrayTwo = new ArrayList(list.subList(n / 2, n));

        arrayOne = mergeSortIntegers(arrayOne, arrayOne.size());
        arrayTwo = mergeSortIntegers(arrayTwo, arrayTwo.size());

        return mergeIntegerArray(arrayOne, arrayTwo);
    }

    public static ArrayList<Double> mergeSortDoubles(ArrayList<Double> list, int n) {
        if (n == 1) {
            System.out.println(Library.TEXT_RED + "Integer merge: minimum array size reached");
            return list;
        }

        ArrayList<Double> arrayOne = new ArrayList(list.subList(0, n / 2));
        ArrayList<Double> arrayTwo = new ArrayList(list.subList(n / 2, n));

        arrayOne = mergeSortDoubles(arrayOne, arrayOne.size());
        arrayTwo = mergeSortDoubles(arrayTwo, arrayTwo.size());

        return mergeDoubleArray(arrayOne, arrayTwo);
    }

    public static ArrayList<String> mergeSortStrings(ArrayList<String> list, int n) {
        if (n == 1) {
            System.out.println(Library.TEXT_RED + "Integer merge: minimum array size reached");
            return list;
        }

        ArrayList<String> arrayOne = new ArrayList(list.subList(0, n / 2));
        ArrayList<String> arrayTwo = new ArrayList(list.subList(n / 2, n));

        arrayOne = mergeSortStrings(arrayOne, arrayOne.size());
        arrayTwo = mergeSortStrings(arrayTwo, arrayTwo.size());

        return mergeStringArray(arrayOne, arrayTwo);
    }

    public static ArrayList<Integer> mergeIntegerArray(ArrayList<Integer> a, ArrayList<Integer> b) {
        System.out.println(Library.TEXT_BLUE + "Integer merge: merging: " + a + " and " + b);
        ArrayList<Integer> c = new ArrayList<Integer>();

        while (a.size() > 0 && b.size() > 0) {
            if (a.get(0) > b.get(0)) {
                c.add(b.get(0));
                b.remove(0);
            } else {
                c.add(a.get(0));
                a.remove(0);
            }
        }

        // at this point either a or b is empty

        while (a.size() > 0) {
            c.add(a.get(0));
            a.remove(0);
        }

        while (b.size() > 0) {
            c.add(b.get(0));
            b.remove(0);
        }
        System.out.println(Library.TEXT_GREEN + "Integer merge: merged into " + c);
        return c;
    }

    public static ArrayList<Double> mergeDoubleArray(ArrayList<Double> a, ArrayList<Double> b) {
        System.out.println(Library.TEXT_BLUE + "Double merge: merging: " + a + " and " + b);
        ArrayList<Double> c = new ArrayList<Double>();

        while (a.size() > 0 && b.size() > 0) {
            if (a.get(0) > b.get(0)) {
                c.add(b.get(0));
                b.remove(0);
            } else {
                c.add(a.get(0));
                a.remove(0);
            }
        }

        // at this point either a or b is empty

        while (a.size() > 0) {
            c.add(a.get(0));
            a.remove(0);
        }

        while (b.size() > 0) {
            c.add(b.get(0));
            b.remove(0);
        }

        System.out.println(Library.TEXT_GREEN + "Double merge: merged into " + c);
        return c;
    }

    public static ArrayList<String> mergeStringArray(ArrayList<String> a, ArrayList<String> b) {
        System.out.println(Library.TEXT_BLUE + "String merge: merging: " + a + " and " + b);
        ArrayList<String> c = new ArrayList<String>();

        while (a.size() > 0 && b.size() > 0) {
            if (a.get(0).compareTo(b.get(0)) > 0) {
                c.add(b.get(0));
                b.remove(0);
            } else {
                c.add(a.get(0));
                a.remove(0);
            }
        }

        // at this point either a or b is empty

        while (a.size() > 0) {
            c.add(a.get(0));
            a.remove(0);
        }

        while (b.size() > 0) {
            c.add(b.get(0));
            b.remove(0);
        }

        System.out.println(Library.TEXT_GREEN + "String merge: merged into " + c);
        return c;
    }

}