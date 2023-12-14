/*
Last Edited By: Minglun Shao
Last Edited On: 2023/12/13
Description:
Emulates a Teacher
*/

class Teacher extends Human {
    private int classroom;
    private String subject;

    public Teacher(int age, String name, boolean inRelationship, int classroom, String subject) {
        super(age, name, inRelationship);
        this.classroom = classroom;
        this.subject = subject;
    }

    public Teacher(int age, String name, int classroom, String subject) {
        super(age, name);
        this.classroom = classroom;
        this.subject = subject;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    // prints out: Teaching in progress...
    public void teach() {
        System.out.println(super.getName()  + " has teaching in progress...");
    }

    @Override
    public String toString() {
        return super.toString() + ". They teach " + subject + " in room " + classroom;
    }
}