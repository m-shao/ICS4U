class Act3_Quiz {

    public static int highScore = 0;
    public static int currentScore = 0;
    public static String highScoreHolder = "";

    public static Question[] questions = {
        new Question("What is the Largest Country by Land Mass?") {
            boolean check(String userResponse){
                return userResponse.equalsIgnoreCase("russia");
            }
        },
        new Question("What Year did Canada becoming indpendent?") {
            boolean check(String userResponse){
                int intUserResponse = Integer.valueOf(userResponse);
                return intUserResponse == 1867;
            }
        },
        new Question("true or false, Callum was born in Ajax") {
            boolean check(String userResponse){
                boolean booleanUserResponse = Boolean.valueOf(userResponse);
                return booleanUserResponse;
            }
        },
        new Question("What does UAE stand for?") {
            boolean check(String userResponse){
                return userResponse.toLowerCase().startsWith("united");
            }
        },
        new Question("What is the Third Largest Country by Land Mass?") {
            boolean check(String userResponse){
                return userResponse.toLowerCase().contains("usa") ||
                    userResponse.toLowerCase().contains("united") ||
                    userResponse.toLowerCase().contains("states") ||
                    userResponse.toLowerCase().contains("america");
            }
        }
    };
    
    public static void run() {

        while (true){
            System.out.println("Welcome to Minglun's Geo Quiz!");
            System.out.println("_______________________________\n");
            System.out.println("What is your name?('exit' to quit)");
            String name = Library.input.nextLine();
            if (name.equalsIgnoreCase("exit")){
                break;
            }
    
            for (int i = 0;i<questions.length; i++){
                if (questions[i].ask()){
                    currentScore++;
                }
            }
            System.out.println(name + ", You SCORED: " + String.valueOf(currentScore) + "/" + questions.length);
            if (currentScore > highScore){
                System.out.println("!!!!YOU GOT A NEW HIGHSCORE!!!!");
                highScore = currentScore;
                highScoreHolder = name;
            } else {
                System.out.println("Highscore is: " +  String.valueOf(highScore) + " held by " + highScoreHolder);
            }
            System.out.println("This test was created and marked by Minglun Shao.");
            System.out.println("Press enter to continue");
            Library.input.nextLine();
            currentScore = 0;
            
        }
        System.out.println("Highscore is: " +  String.valueOf(highScore) + " held by " + highScoreHolder);
    
    }

}