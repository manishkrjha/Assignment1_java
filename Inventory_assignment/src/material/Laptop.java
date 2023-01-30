package material;

import stock.Inventory;

public class Laptop extends Inventory {
    public static int quantity;
    public static int lowOrderLevelQuantity;

    static {
        Laptop.quantity = 0;
        Laptop.lowOrderLevelQuantity = 3;
    }

    public String model;
    public int id;

    public Laptop() {
        model = "HP";
        id = ++Laptop.quantity;
    }
}
