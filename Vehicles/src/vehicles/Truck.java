package vehicles;

//Defining Truck class that inherits Vehicle class
public class Truck extends Vehicle{

    //  Defining personalised attributes for Truck
    int capacity;
    String permitType;
    String serviceType;

    //    Defining constructor to initialize the attributes
    //    The super will initialize the parent class
    public Truck(String color, String model, int numberOfWheels, int capacity, String permitType, String serviceType) {
        super(color, model, numberOfWheels);
        this.capacity = capacity;
        this.permitType = permitType;
        this.serviceType = serviceType;
    }

    //    Method to display the details of the Truck
    public void display(){
        System.out.println("Here is your truck info: ");
        displayVehicle();
        System.out.println(
                "Capacity of the truck: " + capacity
                + "\nPermit area: " + permitType
                + "\nService type: " + serviceType
        );
    }
}
