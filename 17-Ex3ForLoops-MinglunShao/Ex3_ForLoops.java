//Ex3_ForLoops.java
class Ex3_ForLoops {

    static boolean isPrime(int num){
        if (num == 1){
            return false;
        }
        
        for (int i=2;i<=num/2;i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void run() {
    
        //Count up to 1000
        for (int i=0; i<=1000; i++){
            System.out.print(i + " ");
        }
        System.out.println("");
    
    
    	//Count up to 50 showing the square roots of each number
        for (int i=0;i<=50;i++){
            System.out.println(String.format("%.2f", Math.sqrt(i)));
        }
    
    
    	//Count down from 50, showing the even numbers only
        for (int i=50;i>=0;i--){
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    
    
    	//Print out the Prime Numbers up to 100
        for (int i=1;i<=100;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }

    
    	//Code the FizzBuzz Game: https://www.youtube.com/watch?v=QPZ0pIK_wsc
    	for (int i=1;i<=100;i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }
    	
      } // end run
} // end class