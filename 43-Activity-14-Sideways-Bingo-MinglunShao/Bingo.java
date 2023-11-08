class Bingo {
	public static void run() {
        char [] bingoLetters = {'B', 'I', 'N', 'G', 'O'};
        int [][] bingoCard = new int[5][5];

        for (int i = 0; i<bingoCard.length; i++){
                bingoCard[i] = generateArray(5, 15*i+1, 15*i+1 + 14);
        }

        printBingoCard(bingoLetters, bingoCard);

        boolean win = false;
        while (!win){
            System.out.println("ENTER to roll new number");
            Library.input.nextLine();
            int rolledNumber = Library.myRandom(1,76);
            System.out.println("The number chosen is: " + rolledNumber);
            int[] foundCoords = search2DArray(rolledNumber, bingoCard);
            if (foundCoords[0] == -1){
                System.out.println("Not Found");
            } else {
                System.out.println("Number Found");
                bingoCard[foundCoords[0]][foundCoords[1]] *= -1;
                printBingoCard(bingoLetters, bingoCard);
            }
            if(checkWinner(bingoCard)){ 
                System.out.println("YOU WIN YAYAYYA");
                win = true;
            }
        }
	}//end run

    public static int[] generateArray(int length, int min, int max){
        int[] arr = new int[length];

        for (int i=0;i<length;i++){
            int newNum = Library.myRandom(min, max + 1);
            while (in(newNum, arr)){
                newNum = Library.myRandom(min, max + 1);
            }
            arr[i] = newNum;
        }

        return arr;
    }

    public static void printBingoCard(char[] letters, int[][] numbers){
        for (char letter : letters){
            System.out.printf("%-5s", letter);
        }
        System.out.println();
        
        for (int i=0;i<numbers.length;i++){
            for (int j=0;j<numbers[i].length;j++){
                System.out.printf("%-5s", numbers[j][i]);
            }
            System.out.println();
        }
    }

    public static int[] search2DArray(int target, int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j] == target){
                    int [] returnArr = {i, j};
                    return returnArr;
                }
            }
        }
        int [] returnArr = {-1, -1};
        return returnArr;
    }
    public static boolean checkWinner(int[][] arr){
        if (checkRows(arr) || checkCols(arr) || checkDiag(arr)) return true;   
        return false;
    }

    public static boolean checkRows(int[][] arr){
        for (int i=0;i<arr.length;i++){
            boolean isValid = true;
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j] > 0){
                    isValid = false;
                    break;
                }
            }
            if (isValid){
                return true;
            }
        }
        return false;
    }

    public static boolean checkCols(int[][] arr){
        for (int i=0;i<arr.length;i++){
            boolean isValid = true;
            for (int j=0;j<arr[i].length;j++){
                if (arr[j][i] > 0){
                    isValid = false;
                    break;
                }
            }
            if (isValid){
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiag(int[][] arr){
        boolean isValid = true;
        for (int j=0;j<arr.length;j++){
            if (arr[j][j] > 0){
                isValid = false;
                break;
            }
        }
        if (isValid){
            return true;
        }
        isValid = true;
        for (int j=0;j<arr.length;j++){
            if (arr[j][arr.length - 1 - j] > 0){
                isValid = false;
                break;
            }
        }
        if (isValid){
            return true;
        }
        
        return false;
    }

    public static boolean in(int target, int[] arr){
        for (int number : arr){
            if (target == number){
                return true;
            }
        }
        return false;
    }

}//end class