package lesson02;

import java.util.ArrayList;
import java.util.List;

public class Programm {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5);
        Cat cat2 = new Cat("Bars", 15);
        Cat cat3 = new Cat("Bak", 25);
        Cat cat4 = new Cat("Bas", 100);
        Cat cat5 = new Cat("Murzik", 20);

        Plate plate = new Plate(100);


        plate.info();

        plate.addFood(100);
        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        for (Cat cat : cats) {
            cat.eat(plate.getFood());
            if (cat.getFull()) {
                plate.setFood(plate.getFood() - cat.getAppetite());
            }
            plate.info();
            cat.CatInfo();
        }
    }
}
