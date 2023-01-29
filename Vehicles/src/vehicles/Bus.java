package vehicles;

public class Bus extends Vehicle {

    String serviceType;
    String coachType;
    int numberOfSeats;
    public Bus(String color, String model, int numberOfWheels, String serviceType, String coachType, int numberOfSeats) {
        super(color, model, numberOfWheels);
        this.serviceType = serviceType;
        this.coachType = coachType;
        this.numberOfSeats = numberOfSeats;
    }

    public void display(){
        System.out.println("Here is your bus info: ");
        displayVehicle();
        System.out.println(
              "Service type: " + serviceType
              + "\nCoach type: " + coachType
              + "\nNumber of seats: " + numberOfSeats
        );
    }
}
