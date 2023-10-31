import java.util.ArrayList;

class Search {

    public static int binarySearchStudentLastNames(ArrayList<Student> list, String searchTerm) {
        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (searchTerm.equalsIgnoreCase(list.get(mid).lastName)) {
                return mid;
            } else if (searchTerm.compareToIgnoreCase(list.get(mid).lastName) > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        } // while

        return -1;
    }// binarySearchStudentLastNames

}// class