package orderItems;

import material.Accessory;
import material.Laptop;

public class Order {
    String status;

    public Order() {
        this.status = "Ordering";
    }

    void placeOrder(String item, int orderQuantity) {
        if (item.equals("Laptop")) {
            int newQuantity = Laptop.quantity - orderQuantity;
            if(newQuantity < 0) System.out.println("Cannot place order as quantity not available.");
            else if (newQuantity < Laptop.lowOrderLevelQuantity) System.out.println("RequestForMaterial issued.");
            else {
                System.out.println("Invoice generated.");
                Laptop.quantity = newQuantity;
            }
        }
        else if (item.equals("Accessory")) {
            int newQuantity = Accessory.quantity - orderQuantity;
            if(newQuantity < 0) System.out.println("Cannot place order as quantity not available.");
            else if (newQuantity < Accessory.lowOrderLevelQuantity) System.out.println("RequestForMaterial issued.");
            else {
                System.out.println("Invoice generated.");
                Accessory.quantity = newQuantity;
            }
        }
    }
}
