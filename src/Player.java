import java.util.Random;
import java.util.Scanner;

public class Player {
    Scanner n = new Scanner(System.in);
    String name;
    int number;

    void askName() {
        System.out.println(" введи имя");
        name = n.nextLine();
    }

    void guess() {

        System.out.println(" введи число");
        number = n.nextInt();
    }
}
