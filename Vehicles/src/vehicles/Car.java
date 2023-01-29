package vehicles;

public class Car extends Vehicle {

    String bodyType;
    String engineType;
    int numberOfAirbags;

    public Car(String color, String model, int numberOfWheels, String bodyType, String engineType, int numberOfAirbags) {
        super(color, model, numberOfWheels);
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.numberOfAirbags = numberOfAirbags;
    }

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
