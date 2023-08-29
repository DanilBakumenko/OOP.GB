package lesson01;

public class BottleOfMilk extends Product {
    
    private double fat;
    
    private double volume;

    BottleOfMilk(String name, String brand, double price, double volume, double fat){
        super(name, brand, price);
        this.fat = fat;
        this.volume = volume;
    }

    public double getFat() {
        return fat;
    }
    
    public double getVolume() {
        return volume;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String displayInfo(){
        return String.format("%s - %s - %.2f  v = %.2f f = %.2", name, brand, price, volume, fat);
    }
}
