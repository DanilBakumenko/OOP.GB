package Test_java;

import java.io.FileWriter;
import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
        Toy toy1 = new Toy("bear");
        Toy toy2 = new Toy("cat");
        Toy toy3 = new Toy("dog");
        Toy toy4 = new Toy("apple");
        Toy toy5 = new Toy("bird");

        GetingMachine machine = new GetingMachine();

        machine.add(toy1, 20);
        // toy1.print();
        machine.add(toy2, 200);
        // toy1.print();
        // toy2.print();
        machine.add(toy3, 60);
        // toy1.print();
        // toy2.print();
        // toy3.print();
        // machine.add(toy4);
        // machine.add(toy5);
        ArrayList<String> order = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            order.add(machine.getRandomToy().getName());
        }
        try (FileWriter wr = new FileWriter("order.txt", true);) {
            wr.write(String.join(" ", order));
            wr.append("\n");

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
