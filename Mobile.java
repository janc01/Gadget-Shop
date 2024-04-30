
public class Mobile extends TheGadget {
    private int minutesOfCredit; //Available calling minutes
    
    //Contructor initializes Mobile with base Gadget attributes plus mobile specificaitons
    public Mobile(String model, double price, int weight, String size, int minutesOfCredit) {
        super(model, price, weight, size); // Call to Gadget constructor
        this.minutesOfCredit = minutesOfCredit; //Initialize calling credit
    }
    
    //Returns the number of minutes of available calling credit
    public int getMinutesOfCredit() {
        return minutesOfCredit;
    }
    
    //Adds credit if the amount is positive
    public void addCredit(int credit) {
        if (credit > 0) {
            minutesOfCredit += credit;
            System.out.println(credit + " minutes of credit added successfully.");
        } else {
            System.out.println("Please enter a positive amount of credit.");
        }
    }
    
    //Attempts to make a phone call if enough credit is available
    public void makeCall(String phoneNumber, int duration) {
        if (minutesOfCredit >= duration) {
            minutesOfCredit -= duration;
            System.out.println("Call made to: " + phoneNumber + " | Duration: " + duration + " minutes.");
        } else {
            System.out.println("Insufficient credit to make the call.");
        }
    }
    
    //Display all attributes of the mobile, including inherited ones
    public void display() {
        super.display();
        System.out.println("Minutes of Calling Credit Remaining: " + minutesOfCredit);
    }
}
