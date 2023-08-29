package lesson01;

public class BottleOfWater extends Product{

    private double volume;

    BottleOfWater(String name, String brand, double price, double volume){
        super(name, brand, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String displayInfo(){
        return String.format("%s - %s - %.2f  v = %.2f", name, brand, price, volume);
    }
}
