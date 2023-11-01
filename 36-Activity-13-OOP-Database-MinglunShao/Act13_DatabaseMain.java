import java.util.ArrayList;
import java.io.*;

class Act13_DatabaseMain {
    public static void run() {
        ArrayList<Student> classList = new ArrayList();
        
        loadFile("classroom.csv", classList);
        int userChoice = -1;

        System.out.println("This database is a class of student enrolled in an extra curricular board games club. They are all from different classes, different years, different majors. Everyone is welcome whether they are an honour roll student or not, but we do store their grades for future use ;)");
        while (userChoice != 12){
            printMenu();
            userChoice = Library.input.nextInt();
            Library.input.nextLine();
            switch(userChoice){
                case 1:
                    printAllNames(classList);
                    break;
                case 2:
                    System.out.println("Who are you looking for?(first name)");
                    String userTarget = Library.input.nextLine();
                    int foundIndex = searchByName(classList, userTarget);
                    handleFoundStudent(classList, foundIndex);
                    break;
                case 3:
                    addStudent(classList);
                    break;
                case 4:
                    System.out.println("What major do you want to search?");
                    String majorTarget = Library.input.nextLine();
                    printAllInMajor(classList, majorTarget);
                    break;
                case 5:
                    printTotalAndAverage(classList);
                    break;
                case 6:
                    System.out.println("What idiot is dropping french?(first name)");
                    String frenchTarget = Library.input.nextLine();
                    int foundFrenchIndex = searchByName(classList, frenchTarget);
                    if (foundFrenchIndex == -1){
                        System.out.println("USER NOT FOUND ☻");
                    } else{
                        classList.get(foundFrenchIndex).dropFrench();
                        System.out.println("YAY Your average has increased significantly");
                        System.out.println(classList.get(foundFrenchIndex));
                    }
                    break;
                case 7:
                    System.out.println("Who is it?(first name)");
                    String identityTarget = Library.input.nextLine();
                    int foundIdentityIndex = searchByName(classList, identityTarget);
                    if (foundIdentityIndex == -1){
                        System.out.println("USER NOT FOUND ☻");
                    } else{
                        classList.get(foundIdentityIndex).escapeProsecutionByTheCanadianGovernment();
                        System.out.println("Who is this again? Oh ya your identity has changed");
                    }
                    System.out.println(classList.get(foundIdentityIndex));
                    break;
                case 8:
                    for (Student student : classList){
                        student.failStudent();
                    }
                    System.out.println("The whole class has 0% and has been removed from honour roll");
                    break;
                case 9:
                    Sort.selectionSortStudentFirstNames(classList);    
                    System.out.println("Sorted class list by first name:");
                    printAllNames(classList);
                    break;
                case 10:
                    Sort.insertionSortStudentAges(classList);
                    System.out.println("Sorted class list by age:");
                    printAllStudentsWithAge(classList);
                    break;
                case 11:
                    System.out.println("Who are you looking for?(last name)");
                    String lastNameTarget = Library.input.nextLine();
                    Sort.bubbleSortStudentLastNames(classList);
                    int foundLastNameIndex = Search.binarySearchStudentLastNames(classList, lastNameTarget);
                    System.out.println("Sorted class list by last name:");
                    printAllNames(classList);
                    System.out.println("\nThe student you were looking for:");
                    System.out.println(classList.get(foundLastNameIndex));
                    break;
            }

            System.out.println("\n------------------------------------\n");
        }
        saveFile("classroom.csv", classList);
        System.out.println("Bye, thank you for stopping by our class");
    }

    public static void printMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1.  Print all names");
        System.out.println("2.  Search by name");
        System.out.println("3.  Add student");
        System.out.println("4.  Print all in major");
        System.out.println("5.  Get total and average");
        System.out.println("6.  Drop french");
        System.out.println("7.  Change your Identity");
        System.out.println("8.  Fail whole class");
        System.out.println("9.  Sort class list by first name");
        System.out.println("10. Sort class list by age");
        System.out.println("11. Sort and find by last name");
        System.out.println("12. Exit");
        System.out.print("Choice here: ");

    }

    public static void printAllNames(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println(student.firstName + " " + student.lastName);
        }
    }

    public static void printAllStudentsWithAge(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println(student.firstName + " " + student.lastName + " | " + student.age);
        }
    }

    public static int searchByName(ArrayList<Student> list, String targetName) {
        int ind = 0;
        for (Student student : list) {
            if (student.firstName.equalsIgnoreCase(targetName)) {
                return ind;
            }
            ind++;
        }
        return -1;
    }

    public static void handleFoundStudent(ArrayList<Student> list, int foundIndex){
        if (foundIndex == -1){
            System.out.println("Sorry that student is not in this class");
        } else {
            Student foundStudent = list.get(foundIndex);
            System.out.println(foundStudent);
        }
    }

    public static void addStudent(ArrayList<Student> list){
        System.out.println("What is the new student's first name?");
        String newStudentFirstName = Library.input.nextLine();
        System.out.println("What is the new student's last name?");
        String newStudentLastName = Library.input.nextLine();
        System.out.println("What is the new student's age?(integer)");
        int newStudentAge = Library.input.nextInt();
        System.out.println("What is the new student's average(out of 100)?(decimal)");
        double newStudentAverage = Library.input.nextDouble();
        Library.input.nextLine();
        System.out.println("What is the new student's major");
        String newStudentMajor = Library.input.nextLine();
        System.out.println("Is the new student an honour roll student?(yes or no)");
        boolean newStudentIsHonourRoll = Library.input.nextLine().startsWith("y");

        Student newStudent = new Student(newStudentFirstName, newStudentLastName, newStudentAge, newStudentAverage, newStudentMajor, newStudentIsHonourRoll);
        list.add(newStudent);
    }

    public static void printAllInMajor(ArrayList<Student> list, String targetMajor){
        System.out.println("All students in " + targetMajor);
        for (Student student : list){
            if (student.major.equalsIgnoreCase(targetMajor)){
                System.out.println(student);
            }
        }
    }

    public static void printTotalAndAverage(ArrayList<Student> list){
        double total = 0;
        for (Student student : list){
            total += student.average;
        }
        System.out.println("The class grade total is: " + 
              String.format("%.2f", total));
        System.out.println("The class average is: " + 
                           String.format("%.2f percent", total/list.size()));
    }

    public static void loadFile(String filename, ArrayList<Student> list) {
        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));

            String dataToRead;
            while (file.ready()) {
                dataToRead = file.readLine();
                String tempArray[] = dataToRead.split(",");
                list.add(new Student(
                        tempArray[0],
                        tempArray[1],
                        Integer.parseInt(tempArray[2]),
                        Double.parseDouble(tempArray[3]),
                        tempArray[4],
                        Boolean.parseBoolean(tempArray[5])));
            }
        } catch (IOException error) {
            System.out.print(error);
        }
    }// end loadFile

    public static void saveFile(String filename, ArrayList<Student> list) {
        try{
            PrintWriter writer = new PrintWriter(new FileWriter(filename));
            for (Student student : list){
                String toSave = "";
                toSave = student.firstName;
                toSave += "," + student.lastName;
                toSave += "," + student.age;
                toSave += "," + student.average;
                toSave += "," + student.major;
                toSave += "," + student.honourRoll;
                writer.write(toSave + "\n");
            }
            writer.close();

        } catch (IOException error){
            System.out.print(error);
        }
    }// end saveFile
}