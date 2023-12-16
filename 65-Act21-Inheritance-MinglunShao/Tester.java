/*
Last Edited By: Minglun Shao
Last Edited On: 2023/12/15
Description:
Tester Class to test Human, Student, Teacher and Classroom classes
*/

class Tester {
    public static void run() {
        Human callum = new Human(17, "Callum McIntyre");
        Human misterBuckland = new Human(100, "Ras", true);

        Student callumButBetter = new Student(17, "Callum But Better", true, 98, 12);

        Teacher misterBucklandMk2 = new Teacher(100, "The Buck", true, 266, "Computer Science");

        System.out.println(callum);
        callum.says("I am super cool!");
        System.out.println("--------------------------------\n");

        System.out.println(misterBuckland);
        misterBuckland.says("Questions?! Questions?!");
        System.out.println("--------------------------------\n");

        System.out.println(callumButBetter);
        callumButBetter.says("I am very studious!");
        System.out.println(callumButBetter.getName() + "'s average: " + callumButBetter.getAverage());
        callumButBetter.skipSchool();
        callumButBetter.skipSchool();
        callumButBetter.skipSchool();
        System.out.println(callumButBetter.getName() + " skipped school!");
        System.out.println(callumButBetter.getName() + "'s average: " + callumButBetter.getAverage());
        System.out.println("--------------------------------\n");

        System.out.println(misterBucklandMk2);
        misterBucklandMk2.says("You suck at coding!");
        misterBucklandMk2.teach();
        System.out.println("--------------------------------\n");

        Student adan = new Student(30, "Adan", true, 51, 3);
        Student aiden = new Student(15, "Aiden", false, 65, 12);
        Student aidan = new Student(12, "Aidan", false, 76, 5);
        Student ayden = new Student(21, "Ayden", false, 82, 8);

        Classroom classroom = new Classroom(misterBucklandMk2, callum, 4);
        classroom.enrollStudent(callumButBetter);
        classroom.enrollStudent(adan);
        classroom.enrollStudent(aiden);
        classroom.enrollStudent(aidan);
        classroom.enrollStudent(ayden);
        classroom.takeAttendence();

        System.out.println(classroom);

        System.out.println("\n--------------------------------\n");
        System.out.println("Setter and Getter Test");

        System.out.println("\nHuman Getter Test:");
        System.out.println("----------------");
        System.out.print("Get Name: ");
        System.out.println(callum.getName());
        System.out.print("Get Age: ");
        System.out.println(callum.getAge());
        System.out.print("Get Relationship status: ");
        System.out.println(callum.getInRelationship());

        System.out.println("\nResetting all of " + callum.getName() + "'s properties");
        callum.setName("NewCallum");
        callum.setInRelationship(!callum.getInRelationship());

        System.out.println("\nHuman Getter Test(After reset):");
        System.out.println("----------------");
        System.out.print("Get Name: ");
        System.out.println(callum.getName());
        System.out.print("Get Age: ");
        System.out.println(callum.getAge());
        System.out.print("Get Relationship status: ");
        System.out.println(callum.getInRelationship());

        System.out.println("\n--------------------------------\n");

        System.out.println("\nStudent Getter Test:");
        System.out.println("----------------");
        System.out.print("Get Name: ");
        System.out.println(adan.getName());
        System.out.print("Get Age: ");
        System.out.println(adan.getAge());
        System.out.print("Get Relationship status: ");
        System.out.println(adan.getInRelationship());
        System.out.print("Get Average: ");
        System.out.println(adan.getAverage());
        System.out.print("Get Grade: ");
        System.out.println(adan.getGrade());

        System.out.println("\nResetting all of " + adan.getName() + "'s properties");
        adan.setName("New" + adan.getName());
        adan.setInRelationship(!adan.getInRelationship());
        adan.setAverage(101);
        adan.setGrade(adan.getGrade() + 1);

        System.out.println("\nHuman Getter Test(After reset):");
        System.out.println("----------------");
        System.out.print("Get Name: ");
        System.out.println(adan.getName());
        System.out.print("Get Age: ");
        System.out.println(adan.getAge());
        System.out.print("Get Relationship status: ");
        System.out.println(adan.getInRelationship());
        System.out.print("Get Average: ");
        System.out.println(adan.getAverage());
        System.out.print("Get Grade: ");
        System.out.println(adan.getGrade());

        System.out.println("\n--------------------------------\n");

        System.out.println("\nTeacher Getter Test:");
        System.out.println("----------------");
        System.out.print("Get Name: ");
        System.out.println(misterBucklandMk2.getName());
        System.out.print("Get Age: ");
        System.out.println(misterBucklandMk2.getAge());
        System.out.print("Get Relationship status: ");
        System.out.println(misterBucklandMk2.getInRelationship());
        System.out.print("Get Classroom: ");
        System.out.println(misterBucklandMk2.getClassroom());
        System.out.print("Get Subject: ");
        System.out.println(misterBucklandMk2.getSubject());

        System.out.println("\nResetting all of " + misterBucklandMk2.getName() + "'s properties");
        misterBucklandMk2.setName("New" + misterBucklandMk2.getName());
        misterBucklandMk2.setInRelationship(!misterBucklandMk2.getInRelationship());
        misterBucklandMk2.setClassroom(226);
        misterBucklandMk2.setSubject("Math");

        System.out.println("\nHuman Getter Test(After reset):");
        System.out.println("----------------");
        System.out.print("Get Name: ");
        System.out.println(misterBucklandMk2.getName());
        System.out.print("Get Age: ");
        System.out.println(misterBucklandMk2.getAge());
        System.out.print("Get Relationship status: ");
        System.out.println(misterBucklandMk2.getInRelationship());
        System.out.print("Get Classroom: ");
        System.out.println(misterBucklandMk2.getClassroom());
        System.out.print("Get Subject: ");
        System.out.println(misterBucklandMk2.getSubject());

    }
}