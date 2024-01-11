/*
Last Edited By: Minglun Shao
Last Edited On: 2023/12/13
Description:
Emulates a Student
*/

class Student extends Human {
    private int average;
    private int grade;

    public Student(int age, String name, boolean inRelationship, int average, int grade) {
        super(age, name, inRelationship);
        this.average = average;
        this.grade = grade;
    }

    public Student(int age, String name, int average, int grade) {
        super(age, name);
        this.average = average;
        this.grade = grade;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getAverage() {
        return average;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    // if a student skips school, they lose one percent off their average
    public void skipSchool() { 
        average--;
    }

    @Override
    public String toString() {
        return super.toString() + ". They have an average of " + average + "% in grade " + grade;
    }
    
}