class Ex5_BooleanStringMethods {
  public static void run() {

    while (true) {
      int score = 0;

      System.out.println("Java Programming Language Quiz");

      System.out.println("Who Created the Java Programming Language?");
      String answer1 = Library.input.nextLine().toLowerCase();
      if (answer1.startsWith("james") || answer1.startsWith("gosling")) {
        System.out.println("Correct");
        score++;
      } else {
        System.out.println("That is not correct, better luck next time!  :-)  ");
      }	

      System.out.println("What type of language is java?");
      String answer2 = Library.input.nextLine().toLowerCase();
      // discuss that it would be more memory efficient to use the first answer
      // variable every time we want to Scan strings. But for simplicity of
      // understanding, we will use a new one instead.
      if (answer2.contains("object oriented") && (answer2.contains("high level") || answer2.contains("compiled"))) {
        System.out.println("Correct for 2 points");
        score += 2;
      } else if (answer2.contains("object oriented") || answer2.contains("compiled")) {
        System.out.println("Correct for 1 point");
        score += 1;
      } else {
          System.out.println("that is not right");
      }

      System.out.println("How many years has java been around?");
      double numYears = Library.input.nextDouble();
      Library.input.nextLine();
      if (numYears == 28) {
        System.out.println("Correct for 1 point");
        score += 1;
      } else if (numYears > 28) {
        System.out.println("Who do you think java is? They're not that old");
      } else {
          System.out.println("that is not correct");
      }

      System.out.println("Your score is: " + score);
    } // while loop

  }// run

}// end class

