package lesson01;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Product product = new Product("ProductName", "ProductBrand", 100);
        // System.out.println(product.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Water", "LLC Mountain", 200, 1.5);
        BottleOfWater bottleOfWater2 = new BottleOfWater("Water", "LLC Mountain", 250, 2);
        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Milk", "LLC Mountain", 300, 1.5, 15);
        BottleOfMilk bottleOfMilk2 = new BottleOfMilk("Milk", "LLC Mountain", 450, 3, 15);
        Snack snack1 = new Snack("Cheese", "Lay's", 120, 145, 15, 0.50, 119.5);
        Snack snack2 = new Snack("Onions", "Lay's", 120, 145, 15, 0.50, 119.5);

        List<Product> list = new ArrayList<>();
        list.add(bottleOfMilk1);
        list.add(bottleOfMilk2);
        list.add(bottleOfWater1);
        list.add(bottleOfWater2);
        list.add(snack1);
        list.add(snack2);

        VendingMachine machine = new VendingMachine(list);

        System.out.println(machine.getSnack("Cheese", 145).displayInfo());

    }
}
