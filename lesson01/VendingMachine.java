package lesson01;

import java.util.List;

public class VendingMachine {
    
    private List<Product> products;
    
    VendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products) {
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (product.name.equals(name) && bottleOfWater.getVolume() == volume){
                    return bottleOfWater;
                }
            }
            
        }
        return null;
    }

    public Snack getSnack(String name, double weight){
        for (Product product : products) {
            if (product instanceof Snack){
                Snack snack = (Snack)product;
                if (product.name.equals(name) && snack.getWeight() == weight){
                    return snack;
                }
            }
            
        }
        return null;
    }
}
