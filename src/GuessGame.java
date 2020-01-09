import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public final int MAX = 10;
    Random random = new Random();

    void start () {
        int sau = 0;
        Scanner n = new Scanner(System.in);
        System.out.print("Введите количество игроков");
        int N = n.nextInt();
        System.out.println("Я загадываю число от 0 до " + MAX);
        int number = random.nextInt(MAX);
        System.out.println();
        Player[] a;
        a = new  Player[N];
        for (int i = 0; i <N; i++) {
            Player p = new Player();
            p.name();
            a[i] = p;
        }
        System.out.println("Угадайте число ");

        while (true) {
            for (int i = 0; i <N; i++) {
                a[i].guess();
            }
            for (int i = 0; i <N; i++) {
                System.out.println(i+"игрок думает, что это " + a[i].number);
            }
            for (int i = 0; i <N; i++) {
                if(a[i].number == number){
                    sau += 1;
                    if (sau==1){
                        System.out.println("У нас есть победитель!");
                    }
                }
                if (a[i].number == number){
                    System.out.println(i+"игрок угадал!");
                }
                if (sau == 0){
                    System.out.println("Никто не угадал.");
                    System.out.println("Игроки пробуют еще раз.");
                }
                }
            if(sau!=0){
                break;
            }
        }
        System.out.println("Конец игры.");
        System.exit(-1);
    }
}
