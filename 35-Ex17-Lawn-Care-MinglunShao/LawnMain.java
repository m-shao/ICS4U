import java.util.ArrayList;
import java.io.*;

class LawnMain {
    public static void run() {
        ArrayList<LawnClient> allClients = new ArrayList();

        allClients.add(new LawnClient("Mr. Buckland", "666 Maple Lane", 20, false));
        allClients.add(new LawnClient("Grogu", "444 Galaxy far far away", 10, true));
        allClients.add(new LawnClient("Luke", "35 Tatoinne Drive", 100, false));
        allClients.add(new LawnClient("Queen Amidala", "5 Naboo Street", 200, true));

        while (true) {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1.  Print all addresses");
            System.out.println("2.  Mow all lawns");
            System.out.println("3.  Recieve Payment");
            System.out.println("4.  Add new client");
            System.out.println("5.  Delinquent Payments");
            System.out.println("6.  Save and Exit");

            int choice = Library.input.nextInt();
            Library.input.nextLine();
            if (choice == 1) {
                printAllClients(allClients);
            } else if (choice == 2) {
                for (LawnClient client : allClients) {
                    client.mowLawn();
                }
            } else if (choice == 3) {
                System.out.println("Which name is making the payment?");
                String clientName = Library.input.nextLine();
                System.out.println("How much are you paying today?");
                double payment = Library.input.nextInt();
                Library.input.nextLine();
                int index = searchByName(allClients, clientName);
                if (index == -1) {
                    System.out.println("Name Not Found");
                } else {
                    allClients.get(index).processPayment(payment);
                }
            } else if (choice == 4) {
                System.out.println("Manually(m) or from a csv file(f)");
                String newClientType = Library.input.nextLine();
                if (newClientType.equalsIgnoreCase("m")) {
                    System.out.println("What is the new client's name?");
                    String newClientName = Library.input.nextLine();
                    System.out.println("What is the new client's address?");
                    String newClientAddress = Library.input.nextLine();
                    System.out.println("What is the size of the new client's lawn?");
                    int newClientLawnSize = Library.input.nextInt();
                    Library.input.nextLine();
                    System.out.println("Does the new client have a dog?");
                    boolean newClientHasDog = Library.input.nextLine().startsWith("y");
                    System.out.println("Amount of outstanding fees?");
                    double newClientOustandingFees = Library.input.nextDouble();
                    Library.input.nextLine();
                    allClients.add(new LawnClient(newClientName,
                        newClientAddress,
                        newClientLawnSize,
                        newClientHasDog,
                        newClientOustandingFees));
                    
                } else {
                    System.out.println("What is the name of the file?");
                    String fileName = Library.input.nextLine();
                    if (!fileName.endsWith(".csv")) {
                        fileName += ".csv";
                    }
                    loadFile(fileName, allClients);
                }
            } else if (choice == 5) {
                for (LawnClient client : allClients){
                    client.delinquentFees();
                }
            } else {
                saveFile("lawn.csv", allClients); 
                break;
            }
        } // while

    }// run

    public static void printAllClients(ArrayList<LawnClient> list) {
        for (LawnClient client : list) {
            System.out
                    .println(client.address + " Owner " + client.name + " Currently owing: $" + client.outstandingFees);
        }
    }// printAllClients

    public static int searchByName(ArrayList<LawnClient> list, String searchTerm) {
        int ind = 0;
        for (LawnClient client : list) {
            if (client.name.equalsIgnoreCase(searchTerm)) {
                return ind;
            }
            ind++;
        }
        return -1;
    }// end search

    public static void loadFile(String filename, ArrayList<LawnClient> list) {
        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));

            String dataToRead;
            while (file.ready()) {
                dataToRead = file.readLine();
                String tempArray[] = dataToRead.split(",");
                list.add(new LawnClient(tempArray[0],
                        tempArray[1],
                        Integer.parseInt(tempArray[2]),
                        Boolean.parseBoolean(tempArray[3]),
                        Double.parseDouble(tempArray[4])));
            }
        } catch (IOException error) {
            System.out.print(error);
        }
    }// end loadFile

    public static void saveFile(String filename, ArrayList<LawnClient> tempList) {
        try{
            PrintWriter writer = new PrintWriter(new FileWriter(filename));
            String toSave = "";
            for (LawnClient client : tempList){
                toSave = client.name;
                toSave += "," + client.address;
                toSave += "," + client.lawnSize;
                toSave += "," + client.hasDog;
                toSave += "," + client.outstandingFees;
                writer.write(toSave + "\n");
            }
            writer.close();
            
        } catch (IOException error){
            System.out.print(error);
        }
    }// end saveFile

}// class