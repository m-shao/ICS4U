import java.util.ArrayList;

class Sort {
 
    public static void bubbleSortStrings(ArrayList<String> list) {
       for (int i=0;i<list.size() -1;i++){
           for (int j=0;j< list.size() - 1 - i;j++){
               if (list.get(j).compareToIgnoreCase(list.get(j + 1)) > 0){
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
               }
           }
       }
    }// end bubbleSortStrings

    public static void bubbleSortDoubles(ArrayList<Double> list) {
       for (int i=0;i<list.size() -1;i++){
           for (int j=0;j< list.size() - 1 - i;j++){
               if (list.get(j) > list.get(j + 1)){
                    double temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
               }
           }
       }
    }// end bubbleSortDoubles

    public static void bubbleSortPairByName(ArrayList<String> list1, ArrayList<Double> list2) {
       for (int i=0;i<list1.size() -1;i++){
           for (int j=0;j< list1.size() - 1 - i;j++){
               if (list1.get(j).compareToIgnoreCase(list1.get(j + 1)) > 0){
                    String temp1 = list1.get(j);
                    list1.set(j, list1.get(j + 1));
                    list1.set(j + 1, temp1);
                   double temp2 = list2.get(j);
                    list2.set(j, list2.get(j + 1));
                    list2.set(j + 1, temp2);
               }
           }
       }
    }// end bubbleSortPairByName

}//end Sort Class
