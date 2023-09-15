abstract class Question {
    String question;
    String answer;

    public Question(String question) {
        this.question = question;
    }

    public boolean ask(){
        System.out.println(question);
        String userResponse = Library.input.nextLine();
        
        if (check(userResponse)){
            System.out.println("You're Right");
            return true;
        } else{
            System.out.println("You're Wrong");
            return false;
        }
    }
    
    abstract boolean check(String userResponse); 
}