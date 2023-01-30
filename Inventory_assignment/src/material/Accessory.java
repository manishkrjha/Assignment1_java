package material;

import stock.Inventory;

public class Accessory extends Inventory {
    public static int quantity;
    public static int lowOrderLevelQuantity;
    static {
        Accessory.quantity = 0;
        Accessory.lowOrderLevelQuantity = 5;
    }

    public String type;
    public int id;
    public Accessory() {
        type = "Headphones";
        id = ++Accessory.quantity;
    }
}
