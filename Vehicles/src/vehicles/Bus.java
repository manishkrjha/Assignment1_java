package vehicles;

//Defining Bus class that inherits Vehicle class
public class Bus extends Vehicle {

    //  Defining personalised attributes for Bus
    String serviceType;
    String coachType;
    int numberOfSeats;

    //    Defining constructor to initialize the attributes
    //    The super will initialize the parent class
    public Bus(String color, String model, int numberOfWheels, String serviceType, String coachType, int numberOfSeats) {
        super(color, model, numberOfWheels);
        this.serviceType = serviceType;
        this.coachType = coachType;
        this.numberOfSeats = numberOfSeats;
    }

    //    Method to display the details of the Bus
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
