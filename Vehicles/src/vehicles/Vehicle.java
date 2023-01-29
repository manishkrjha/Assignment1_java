package vehicles;

public class Vehicle {
    String color;
    String model;
    String registrationNumber;
    int numberOfWheels;
    int price;

    public Vehicle(String color, String model, int numberOfWheels) {
        this.color = color;
        this.model = model;
        this.numberOfWheels = numberOfWheels;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getPrice() {
        return price;
    }

    public void displayVehicle(){
        System.out.println(
                "Model name: " + model
                + "\nNo. of wheels: " + numberOfWheels
                + "\nRegistration number: " + registrationNumber
                + "\nColor of the vehicle: " + color
                + "\nPrice: " + price
        );
    }
}
