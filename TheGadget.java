
public class TheGadget {
    private String model;
    private double price; // Price in pounds
    private int weight;  //Weight in grams
    private String size;  //Size format example: 71mm x 137mm x 9mm

    public TheGadget(String model, double price, int weight, String size) {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;
    }
    // Accessor methods
    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getSize() {
        return size;
    }
    // Method to display gadget details
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Price: £" + price);
        System.out.println("Weight: " + weight + "g");
        System.out.println("Size: " + size);
    }
}

