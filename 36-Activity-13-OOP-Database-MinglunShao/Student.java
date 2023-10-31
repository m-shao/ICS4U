public class Student {
    String firstName;
    String lastName;
    int age;
    double average;
    String major;
    boolean honourRoll;

    public Student(String firstName, String lastName, int age, double average, String major, boolean honourRoll) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.average = average;
        this.major = major;
        this.honourRoll = honourRoll;
    }

    public void dropFrench(){
        average += 20;
        if (average > 100){
            average = 100;
        }
    }

    public void escapeProsecutionByTheCanadianGovernment(){
        System.out.println("What is their new first name?");
        String newFirstName = Library.input.nextLine();
        System.out.println("What is their new last name?");
        String newLastName = Library.input.nextLine();
        System.out.println("What is their new age?");
        int newAge = Library.input.nextInt();
        Library.input.nextLine();
        firstName = newFirstName;
        lastName = newLastName;
        age = newAge;
        System.out.println("Identity changed");
    }

    public void failStudent(){
        average = 0;
        honourRoll = false;
    }

    public String toString(){
        return firstName + " " + lastName +
                  " is " + age + " years old. Their average is a "
                  + average + " while majoring in " + 
                  major + ". Is an honour roll student?: "
                  + honourRoll;
    }
}