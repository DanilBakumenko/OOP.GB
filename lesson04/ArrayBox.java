package lesson04;

import java.util.ArrayList;

public class ArrayBox<T extends Fruit> {
    private ArrayList<T> fruits;
    private double boxWeight;
    private String type;

    public ArrayBox() {
        fruits = new ArrayList<>();
        boxWeight = 0;
        type = null;
    }


    public double getWeight() {
        return boxWeight;
    }

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }
    
    public void setBoxWeight(double boxWeight) {
        this.boxWeight = boxWeight;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    private void pourOut() {
        setFruits(new ArrayList<>());
        setBoxWeight(0);
    }

    public void fill(ArrayBox<T> box) {
        if (type == box.getFruits().get(0).getClass().getSimpleName()) {
            for (T t : box.getFruits()) {
                add(t);
            }
            box.pourOut();
        }
    }

    @Override
    public String toString() {
        return String.format("Weight = %.2f, value = %d", boxWeight, fruits.size());
    }
    
    public void add(T fruit) {
        if (type == null) {
            type = fruit.getClass().getSimpleName();
            fruits.add(fruit);
            changeWeight(fruit);
        } else if (type == fruit.getClass().getSimpleName()) {
            fruits.add(fruit);
            changeWeight(fruit);
        } else
        System.out.printf("We can't put %s in a box of %s\n", fruit.getClass().getSimpleName(), type);
    }

    public boolean compare(ArrayBox<T> box){
        return box.getWeight() == boxWeight ? true : false;
    }

    private void changeWeight(T frut) {
        boxWeight += frut.getWeight();
    }
}
