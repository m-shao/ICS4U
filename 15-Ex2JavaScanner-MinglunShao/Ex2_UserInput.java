class Ex2_UserInput {

    public static void run() {
    //Note also the new IMPORT line at the top of this file

    //+++++++++++  Part 1 Scanning Integers +++++++++++
    int time1;
    int time2;
    int time3;
	 double average;

    System.out.println(Library.RED + "What is the time for runner 1?");
    time1 = Library.input.nextInt();
    Library.input.nextLine();//required to flush out the ENTER key that is pressed at the end of integer (and any number) input

    System.out.println(Library.YELLOW + "What is the time for runner 2?");
    time2 = Library.input.nextInt();
    Library.input.nextLine();

    System.out.println(Library.GREEN + "What is the time for runner 3?");
    time3 = Library.input.nextInt();
    Library.input.nextLine();

    average = (time1 + time2 + time3) / 3;
    System.out.println(Library.BLUE + "Team finished with an average " + average + " seconds");
  //+++++++++++  Part 2 Scanning Strings and Doubles +++++++++++   
        String name;
        int numTunes;
        double grade; 
        
        System.out.println(Library.PURPLE + "Ex1_Datatypes");
        System.out.println("There are 5 core data types in java");

        System.out.println();
        System.out.println("Welcome!");    
        System.out.println(Library.CYAN + "What is your name?");        
        name = Library.input.nextLine();
        System.out.println(Library.RED + name + " is a great name!. How old are you?");
        int age = Library.input.nextInt();
        Library.input.nextLine();

        System.out.println("I remember when I was " + age + ", Good times.");

        System.out.println(Library.YELLOW + "This is going to be an exciting class. \nWhat mark did you get in the Grade 11 class?");
        grade = Library.input.nextDouble();
        Library.input.nextLine();  
        System.out.print(Library.GREEN);
        if( grade < 80){
            System.out.println("You are  going to have work really hard in this class to keep up");
        }
       else if( grade  < 90){
            System.out.println("Excellent! keep up the hard work!");
        }        
        else {
            System.out.println("Congratulations, you are going to be a star in this class!");
        }           
    }// end run   
}// end class

