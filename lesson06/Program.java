package lesson06;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Save save = new Save<>();
        Input p = new Input();
        System.out.println("Введите заказ:");
        Order order = new Order(p.prompt("Client name: "), p.prompt("Product: "),
                Integer.parseInt(p.prompt("Quantity: ")), Integer.parseInt(p.prompt("Price: ")));
        save.saveTo(order, p.prompt("Enter the type file for save: "));

    }
}
