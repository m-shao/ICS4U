class Ex1_JavaIntro {
  public static void run() {
   //++++++++  Example 1 - Focusing on Java Printing and Datatypes ++++

    System.out.println();
    System.out.println();
    System.out.println("Welcome to Grade 12 Computer Science");
  
    System.out.println();
    System.out.println("\tMean Aunt Java's Big 5 Data Types");
    
    System.out.println("int - for whole numbers");
    int age = 26;
    System.out.println("\tMr. Buckland is older than " + age + " years old");
    
    System.out.println("'String' for words (notice the capital S) because it is not a basic data type");
    String course = "ICS4U";
    System.out.println("\tWe are in the class for " + course);

    System.out.println("'char' for single characters (not needed often in Java becuase strings will suffice)");
    char goalGrade = 'b';

    System.out.println("'boolean' for true or false");
    boolean metGoal = true;
    if( metGoal ){
      System.out.println("\tCongratulations on earning a " + goalGrade);
    }

    System.out.println("'double' or 'float' for numbers that may contain decimals. \n\tI usually use doubles but floats are more memory efficient.");
    double average = 74.8;
    System.out.println("\tYour average in this class was " + average);
  }// run
}// end class
