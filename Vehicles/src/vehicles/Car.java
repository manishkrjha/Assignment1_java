package vehicles;

//Defining Car class that inherits Vehicle class
public class Car extends Vehicle {

//    Defining personalised attributes for Car
    String bodyType;
    String engineType;
    int numberOfAirbags;

    //    Defining constructor to initialize the attributes
    //    The super will initialize the parent class
    public Car(String color, String model, int numberOfWheels, String bodyType, String engineType, int numberOfAirbags) {
        super(color, model, numberOfWheels);
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.numberOfAirbags = numberOfAirbags;
    }

    //    Method to display the details of the Car
    public void display(){
        System.out.println("Here is your car info: ");
        displayVehicle();
        System.out.println(
                "body type: " + bodyType
                + "\nengine type: " + engineType
                + "\nnumber of airbags: " + numberOfAirbags
        );
    }
}
