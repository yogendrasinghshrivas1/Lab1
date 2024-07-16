package Lab1;

public class Smartphone extends Device {

    private String operatingSystem;
    private int cameraResolution; // in megapixels

    // Constructor
    public Smartphone(String brand, String model, String operatingSystem, int cameraResolution) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
        this.cameraResolution = cameraResolution;
    }

    // Method to display smartphone-specific information
    public void displaySmartphoneInfo() {
        displayDeviceInfo(); // Reuse method from superclass
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Camera Resolution: " + cameraResolution + " MP");
    }

    // Method to take a photo
    public void takePhoto() {
        if (isPoweredOn()) {
            System.out.println("Taking photo with " + brand + " " + model);
            // Additional photo-taking logic can be added here
        } else {
            System.out.println("Cannot take photo. " + brand + " " + model + " is powered off.");
        }
    }

    // Helper method to check if the smartphone is powered on
    private boolean isPoweredOn() {
        return super.poweredOn; // Accessing protected field from superclass
    }
}
