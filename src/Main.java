import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        while (true){


        //Получение случайного слова из файла
        var ld = new Loader();
        var gm = new GProcess(ld.word());

        // Запуск игры
        gm.game();

            System.out.println("Новая игра?: y/n");

            if(sc.next().equals("n")){

                break;

            } else {

                System.out.println("Новая игра!");
            }

        }




    }
}
