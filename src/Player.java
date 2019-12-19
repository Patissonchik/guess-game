import java.util.Random;
import java.util.Scanner;

public class Player {
    Scanner n = new Scanner(System.in);
    int number;
    void guess(int bound) {
        System.out.println("Введите имя");
        String name = n.toString();
        System.out.println("Введите ваше число");
        number = n.nextInt();
    }
}
