import java.util.ArrayList;

class Search {

  public static int linearStringSearch(ArrayList<String> list, String searchTerm) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equalsIgnoreCase(searchTerm)) {
        return i;
      }
    }
    return -1;
  }// linearStringSearch

  public static int binarySearchStrings(ArrayList<String> list, String searchTerm) {
    int mid = list.size() / 2;
    int start = 0;
    int end = list.size() - 1;
      while (start <= end){
          if (list.get(mid).equalsIgnoreCase(searchTerm)){
              return mid;
          }
          else if (searchTerm.compareToIgnoreCase(list.get(mid)) > 0){
              start = mid + 1;
          }
          else if (searchTerm.compareToIgnoreCase(list.get(mid)) < 0){
              end = mid - 1;
          }
          mid = (start + end)/2; 
      }
    return -1;
  }// binarySearchStrings

  

}// class