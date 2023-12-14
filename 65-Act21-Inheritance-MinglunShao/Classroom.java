/*
Last Edited By: Minglun Shao
Last Edited On: 2023/12/14
Description:
Emulates a Classroom
*/

import java.util.ArrayList;

class Classroom {
    private Teacher teacher;
    private ArrayList<Student> students;
    private Human TA; // teacher's assistant is neither teacher or student
    private int classSize; // will not update unless attendence is taken
    private int capacity;
    
    public Classroom(Teacher teacher, Human TA, int capacity) {
        this.teacher = teacher;
        this.TA = TA;
        classSize = 0;
        students = new ArrayList<Student>();
        this.capacity = capacity;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Human getTA() {
        return TA;
    }

    public int getClassSize() {
        return classSize;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setTA(Human TA) {
        this.TA = TA;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setClassSize(int classSize) {
        this.classSize = classSize;
    }

    // add a student to the classroom if not over capacity
    public void enrollStudent(Student student) {
        if (students.size() + 1 > capacity){
            System.out.println("Enrollment Failed, Capacity of " + capacity + " has been reached");
        } else{
            System.out.println(student.getName() + " Successfully enrolled");
            students.add(student);
        }
    }

    // takes attendence, updates the class size
    public void takeAttendence() {
        classSize = students.size();
    }

    @Override
    public String toString() {
        String returnString = teacher.getName() + " teaches " + teacher.getSubject() + " to a class of " + classSize
                + " students. The max capacity is " + capacity + ". The attendence list is: ";
        for (Student student : students) {
            returnString += ("\n" + student.getName());
        }
        returnString += "\nThis class has a TA: " + TA;

        return returnString;

    }
}