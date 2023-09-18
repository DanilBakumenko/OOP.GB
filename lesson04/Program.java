package lesson04;


/**
 * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются
 * по типу фрукта,
 * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
 * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес
 * одного фрукта и их количество:
 * вес яблока – 1.0f, апельFсина – 1.5f (единицы измерения не важны);
 * e. Внутри класса Box сделать метод compare(), который позволяет сравнить
 * текущую коробку с той, которую
 * подадут в compare() в качестве параметра. true – если их массы равны, false в
 * противоположном случае.
 * Можно сравнивать коробки с яблоками и апельсинами;
 * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в
 * другую.
 * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с
 * апельсинами.
 * Соответственно, в текущей коробке фруктов не остается, а в другую
 * перекидываются объекты, которые были в первой;
 * g. Не забываем про метод добавления фрукта в коробку.
 * 
 * Формат сдачи: ссылка на гитхаб проект
 */
public class Program {
    public static void main(String[] args) {
        Apple fruit1 = new Apple();
        Orange fruit2 = new Orange();

        Box<Fruit> box3 = new Box(40);
        Box<Fruit> box4 = new Box(40);
        Box<Fruit> box5 = new Box(40);

        box3.add(30, fruit2);
        box4.add(10, fruit2);
        box5.add(15, fruit1);
        System.out.println(box3);
        System.out.println(box4);
        System.out.println(box5);

        System.out.println(box4.compare(box5));
        box3.fill(box4);

        System.out.println(box3);
        System.out.println(box4);
        System.out.println(box5);

        // ArrayBox<Apple> box1 = new ArrayBox<Apple>();
        // box1.add(fruit1);
        // box1.add(fruit1);
        // box1.add(fruit1);
        // box1.add(fruit1);
        // box1.add(fruit1);
        // box1.add(fruit1);

        // ArrayBox<Apple> box2 = new ArrayBox<Apple>();
        // box2.add(fruit1);
        // box2.add(fruit1);
        // box2.add(fruit1);
        // box2.add(fruit1);
        // box2.add(fruit1);
        // box2.add(fruit1);
        // // box1.add(fruit5);
        // System.out.println(box1);
        // System.out.println(box2);
        // System.out.println(box1.compare(box2));
        // box1.fill(box2);

        // System.out.println(box1);
        // System.out.println(box2);
        // System.out.println(box1.compare(box2));
        
    }
}
