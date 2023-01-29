package vehicles;

public class Truck extends Vehicle{

    int capacity;
    String permitType;
    String serviceType;

    public Truck(String color, String model, int numberOfWheels, int capacity, String permitType, String serviceType) {
        super(color, model, numberOfWheels);
        this.capacity = capacity;
        this.permitType = permitType;
        this.serviceType = serviceType;
    }

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
