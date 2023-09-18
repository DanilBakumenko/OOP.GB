package lesson04;

public class Box<T extends Fruit> {

    private final Integer value;
    private Integer quantity;
    private double weight;
    private String type;

    public Box(Integer value) {
        this.value = value;
        weight = 0;
        type = null;
    }

    public Integer getQuantity() {
        return quantity;
    }
    
    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    private void pourOut() {
        quantity = 0;
        weight = 0;
        type = null;
    }

    public boolean compare(Box<T> box){
        return box.getWeight() == weight ? true : false;
    }

    public void fill(Box<T> box){
        if (box.getQuantity() <= value - quantity && box.getType() == type) {
            quantity += box.getQuantity();
            weight += box.getWeight();
            box.pourOut();
        } System.out.println("We can't pour into this box");
    }

    public void add(int quantityOF, T fruit) {
        if (type == null && quantityOF <= value) {
            type = fruit.getClass().getSimpleName();
            quantity = quantityOF;
            weight = fruit.getWeight() * quantityOF;
        } else if (type.equals(fruit.getClass().getSimpleName()) && quantityOF <= value - quantity) {
            quantityOF += quantity;
            weight += fruit.getWeight() * quantityOF;
        } else
            System.out.println("We cant put fruits in a box");
    }

    @Override
    public String toString(){
        return String.format("Box with %s: wight = %.2f, quantity = %d", type, weight, quantity);
    }
}
