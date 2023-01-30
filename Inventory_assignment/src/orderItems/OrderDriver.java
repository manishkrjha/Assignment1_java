package orderItems;

import material.*;
import stock.Inventory;

import java.util.*;

public class OrderDriver {
    public static void main(String[] args) {

        ArrayList<Inventory> l = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            l.add(new Laptop());
        }

        for(int i = 0; i < 10; i++) {
            l.add(new Accessory());
        }

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Press 1 for ordering laptop, 2 for accessory and 0 for exit:");
            int input = sc.nextInt();
            if (input == 0) break;
            System.out.println("Enter quantity to order:");
            int qnt = sc.nextInt();
            Order o = new Order();
            if(input == 1) o.placeOrder("Laptop", qnt);
            else if(input == 2) o.placeOrder("Accessory", qnt);
        } while(true);
    }
}

