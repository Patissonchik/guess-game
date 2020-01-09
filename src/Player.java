import java.util.Random;
import java.util.Scanner;

public class Player {
    Scanner n = new Scanner(System.in);
    int number;
    void name(){
        System.out.println("Введите имя");
        String name = n.toString();
    }
    void guess() {

        System.out.println("Введите ваше число");
        number = n.nextInt();
    }
}
