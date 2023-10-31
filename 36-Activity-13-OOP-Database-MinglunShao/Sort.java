import java.util.ArrayList;

class Sort {

    public static void bubbleSortStudentLastNames(ArrayList<Student> list) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).lastName.compareToIgnoreCase(list.get(i + 1).lastName) > 0) {
                    swap = true;
                    Student temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);

                }
            } // for
        } // while
    }// end bubbleSortStudentLastNames

    public static void selectionSortStudentFirstNames(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).firstName.compareToIgnoreCase(list.get(min).firstName) < 0) {
                    min = j;
                }
            }
            Student temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);
        }
    }// end selectionSortStudentFirstNames

    public static void insertionSortStudentAges(ArrayList<Student> list) {
        for (int i = 1; i < list.size(); i++) {
            int j = i;
            while (j > 0 && list.get(j).age < list.get(j - 1).age) {
                Student temp = list.get(j);
                list.set(j, list.get(j - 1));
                list.set(j - 1, temp);
                j--;
            }
        }
    }// end insertionSortStudentAges
}// end Sort Class
