package Lab1;

public class Main {

    public static void main(String[] args) {
        // Create a Smartphone instance
        Smartphone myPhone = new Smartphone("Samsung", "Galaxy S20", "Android", 64);

        // Display smartphone information
        myPhone.displaySmartphoneInfo();

        // Power on the smartphone
        myPhone.powerOn();

        // Take a photo
        myPhone.takePhoto();

        // Power off the smartphone
        myPhone.powerOff();
    }
}
