package lesson06;

import java.util.Scanner;

public class Input {

    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
