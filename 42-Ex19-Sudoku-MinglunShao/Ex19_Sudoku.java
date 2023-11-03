
class Ex19_Sudoku {
    public static void run() {

        //manually create a valid 3x3 square and check it
        int[][] square1 = {{1,2,3},{4,5,6},{7,8,9}};
        // int[][] square2 = {{1,2,3}, new int[3] ,{7,8,9}};
        print2DInt(square1);

        System.out.println("Square 1 is legit: " + testSquare(square1));

        System.out.println();
        //manually create an invalid 3x3 square and check it
        int[][] square2 = {{1,2,3},{4,9,6},{7,8,9}};
        print2DInt(square2);
        System.out.println("Square 2 is legit: " + testSquare(square2));

        System.out.println();
        //generate random squares and check if valid
        int[][] square3 = generateSquare(3);
        print2DInt(square3);
        System.out.println("Square 3 is legit: " + testSquare(square3));

        System.out.println();
     
        // Continue to generate random squares until legit one is created

        int[][] square4 = generateSquare(4);
        int counter = -1;
        while (!testSquare(square4)){
            counter++;
            square4 = generateSquare(4);
        }
        System.out.println("Legit Generated Square Took: " + counter);
        print2DInt(square4);
        
        System.out.println();
     
        // Create blanks in legit square
        square4 = createBlanks(8, square4);
        System.out.println("Square 4 with blanks");
        print2DInt(square4);
        
    }// run

    //Generate square of any size
    public static int[][] generateSquare(int size){
        int[][] arr = new int[size][size];
        int max = (int)Math.pow(size, 2);
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                arr[i][j] = Library.myRandom(1,max + 1);
            }
        }
        return arr;
    }
  
    //Challenge create a testSquare method
    public static boolean testSquare(int[][] arr){
        int[] visitedTotal = new int[arr.length*arr.length + 1];
        
        for (int[] row : arr){
            for (int tile : row){
                if (visitedTotal[tile] != 0){
                    return false;
                }
                visitedTotal[tile] = tile;
            }
        }
        return true;
    }
   
    //print 2d array
    public static void print2DInt(int[][] arr){
        for (int[] row : arr){
            for (int tile : row){
                System.out.print(tile + " ");
            }
            System.out.println();
        }
    }
    //create Blanks in 2D array

    public static int[][] createBlanks(int num, int[][] arr){
       for (int i=0;i<num;i++){
           int r = Library.myRandom(0,arr.length);
           int c = Library.myRandom(0,arr.length);
           arr[r][c] = 0;
       }
       return arr;
   }



}// class