public class Smartphone {
    // Attributes
    String brand;
    String model;
    int storage; 
    double price; 

    // Default constructor
    public Smartphone() {
        brand = "Unknown";
        model = "Unknown";
        storage = 0;
        price = 0.0;
    }

    // Parameterized constructor
    public Smartphone(String b, String m, int s, double p) {
        brand = b;
        model = m;
        storage = s;
        price = p;
    }

    // Method to display smartphone information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: $" + price);
    }

    // Method to apply a discount
    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            price = price - (price * percent / 100);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }
}
