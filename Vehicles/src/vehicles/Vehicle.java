package vehicles;

//Creating Vehicle which will act as a parent class
public class Vehicle {

//    Defining basic attributes of Vehicle
    String color;
    String model;
    String registrationNumber;
    int numberOfWheels;
    int price;

//    Defining constructor to initialize the attributes
    public Vehicle(String color, String model, int numberOfWheels) {
        this.color = color;
        this.model = model;
        this.numberOfWheels = numberOfWheels;
    }

//    Defining setters and getters for the attributes
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

//    Method to display the details of the vehicle
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
