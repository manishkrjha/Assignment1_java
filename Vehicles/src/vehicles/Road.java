package vehicles;

public class Road {
    public static void main(String[] args){
//        Creating object for Car class
        Car c = new Car("Black", "Thar", 4, "SUV", "Petrol engine", 4);
        c.setPrice(1500000);
        c.setRegistrationNumber("WB1E1919");
        c.display();
        System.out.println("--------------");

//        Creating object for Bus class
        Bus b = new Bus("White", "Bharat Benz", 6, "School Bus", "Single-deck bus", 20);
        b.setPrice(2500000);
        b.setRegistrationNumber("DL4F2020");
        b.display();
        System.out.println("--------------");

//        Creating object for truck class
        Truck t = new Truck("Brown", "Ashok Leyland", 8, 3, "National level transport perit", "Packers and movers");
        t.setPrice(4500000);
        t.setRegistrationNumber("MP095Y71");
        t.display();
    }
}
