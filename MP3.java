
public class MP3 extends TheGadget {
    private double availableMemory; // Memory available for music files in MB
    
    //Constructor initializes MP3 with base TheGadget attributes plus MP3-specific features
    public MP3(String model, double price, int weight, String size, double availableMemory) {
        super(model, price, weight, size); // Call to superclass (TheGadget) constructor
        this.availableMemory = availableMemory; //Initalize available memory
    }
    //Returns the amount of available memory in MB
    public double getAvailableMemory() {
        return availableMemory;
    }
    //Attempts to download music, reducing the available memory accordingly
    public void downloadyMusic(double memoryNeeded) {
        if (memoryNeeded <= 0) {
            System.out.println("Error: Please enter a positive value for the memory needed.");
        } else if (memoryNeeded > availableMemory) {
            System.out.println("Error: Insufficient memory available.");
        } else {
            availableMemory -= memoryNeeded;
            System.out.println(memoryNeeded + "MB of music downloaded. Available memory: " + availableMemory + "MB.");
        }
    }
    //Displays all attributes of the MP3, including inherited ones and available memory
    public void display() {
        super.display(); // Display attributes from TheGadget class
        System.out.println("Available memory: " + availableMemory + "MB"); //Display available memory
    }
}

