import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public final int MAX = 20;
    Random random = new Random();

    void start () {
        int sau = 0;
        Scanner n = new Scanner(System.in);
        System.out.println("Введите количество игроков");
        int N = n.nextInt();
        System.out.println("Я загадываю число от 1 до " + MAX);
        int number = random.nextInt(MAX);
        if(number==0){
            number+=1;
        }
        System.out.println();
        Player[] a;
        a = new  Player[N];
        for (int i = 0; i <N; i++) {
            int rigota = i+1;
            System.out.print("Игрок №"+rigota);
            Player p = new Player();
            p.askName();
            a[i] = p;
        }
        System.out.println("Угадайте число ");

        while (true) {
            for (int i = 0; i <N; i++) {
                System.out.print(a[i].name);
                a[i].guess();
            }
            for (int i = 0; i <N; i++) {
                System.out.println(a[i].name+" "+"думает, что это " + a[i].number);
            }
            for (int i = 0; i <N; i++) {
                if(a[i].number == number){
                    sau = sau + 1;
                    if (sau==1){
                        System.out.println("У нас есть победитель!");
                    }
                }
                if (a[i].number == number){
                    System.out.println(a[i].name+" угадал!");
                }

                }
            if (sau == 0){
                System.out.println("Никто не угадал.");
                System.out.println("Игроки пробуют еще раз.");
            }
            if(sau!=0){
                break;
            }
        }
        System.out.println("Конец игры.");
        System.exit(-1);
    }
}
