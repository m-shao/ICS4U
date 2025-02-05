public class LawnClient {

    public String name;
    public String address;
    public int lawnSize;
    public boolean hasDog;
    public double outstandingFees;

    // Constructor Method
    public LawnClient(String n, String a, int s, boolean d) {
        name = n;
        address = a;
        lawnSize = s;
        hasDog = d;
        outstandingFees = 0;
    }

    // This second constructor for new clients with outstanding fees
    public LawnClient(String n, String a, int s, boolean d, double f) {
        name = n;
        address = a;
        lawnSize = s;
        hasDog = d;
        outstandingFees = f;
    }

    // Instance Methods

    public String toString() {
        return name + " Lawn: " + lawnSize + "sq metres. Dog: " + hasDog + " Currently owing: $" + outstandingFees;
    }// toString

    public void mowLawn() {
        double mowFee = 10.0 + lawnSize * 0.5;
        if (hasDog){
            mowFee += 15;
        }
        outstandingFees += mowFee;
        System.out.println("Today's Fee: " + mowFee);
    }// mowLawn

    public void processPayment(double payment) {
        outstandingFees -= payment;
        System.out.println("Thank you for your payment: " + name);
    }// processPayment

    public void delinquentFees() {
        if (outstandingFees > 50){
            outstandingFees *= 1.1;
        }
        if (outstandingFees > 400 && hasDog){
            hasDog = false;
        }
    }// deliquent

}// class