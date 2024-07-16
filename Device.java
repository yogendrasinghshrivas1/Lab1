package Lab1;

public class Device {

    public String brand;
    public String model;
    public boolean poweredOn;

    // Constructor
    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.poweredOn = false; // Device starts off powered off
    }

    // Method to display device information
    public void displayDeviceInfo() {
        System.out.println("Device: " + brand + " " + model);
    }

    // Method to power on the device
    public void powerOn() {
        if (!poweredOn) {
            poweredOn = true;
            System.out.println(brand + " " + model + " powered on.");
        } else {
            System.out.println(brand + " " + model + " is already powered on.");
        }
    }

    // Method to power off the device
    public void powerOff() {
        if (poweredOn) {
            poweredOn = false;
            System.out.println(brand + " " + model + " powered off.");
        } else {
            System.out.println(brand + " " + model + " is already powered off.");
        }
    }
}
