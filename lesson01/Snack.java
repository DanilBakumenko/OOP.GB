package lesson01;

public class Snack extends Product {
    
    private double weight;
    private double fats;
    private double proteins;
    private double carbohydrates;

    Snack(){
        this("Noname");
    }
    
    Snack(String name){
        this(name,"Noname");
    }

    Snack(String name, String brand){
        this(name,brand,100);
    }

    Snack(String name, String brand, double price){
        this(name, brand, price, 50);
    }

    Snack(String name, String brand, double price, double weight){
        this(name, brand, price, weight, 0.50);
    }

    Snack(String name, String brand, double price, double weight, double proteins){
        this(name, brand, price, weight, proteins, 1.50);
    }

    Snack(String name, String brand, double price, double weight, double proteins, double fats){
        this(name, brand, price, weight, proteins, fats, 48);
    }

    Snack(String name, String brand, double price, double weight, double fats, double proteins, double carbohydrates){
        super(name, brand, price);
        this.weight = weight;
        this.fats = fats;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
    }

    public double getFats() {
        return fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getProteins() {
        return proteins;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    // @Override
    // public String displayInfo(){
    //     return String.format("%s - %s - %.2f  v = %.2f weight = %.2f fats = %.2f carbohydrates = %.2f proteins = %2.f", name, brand, price, weight, fats, carbohydrates, proteins);
    // }
    @Override
    public String displayInfo() {
        return String.format("%s - %s - %.2f\nWeight: %.2f\nf: %.2f, p: %.2f, c: %.2f", name, brand, price, weight, fats, proteins, carbohydrates);
    }
}

