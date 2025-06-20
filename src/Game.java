import java.util.Scanner;

public class Game {

    String str = "";
    Scanner scan = new Scanner(System.in);

    boolean win = false;

    char[] ch;
    char[] buffer;

    Game(String word){

        str = word;
        ch = new char[str.length()];
        buffer = new char[str.length()];

    }


    // Исходное слово в массиве символов


    public void gamers(String word){

        var risuy = new Painted();
        word = this.str;
        int winCounter = 0;
        int errorCounter = 0;

        for (int i = 0; i < word.length(); i++) {

            boolean verno = false;

            if(winCounter == word.length()){

                win = true;
                break;

            }



            System.out.println("Введите букву");

            // Символ введеный пользователем
            char letter = scan.next().charAt(0);

            for (int j = 0; j < word.length(); j++) {

                if(letter == word.charAt(j)){

                    buffer[j] = letter;
                    winCounter++;
                    i--; //Ответ был верный, эта попытка не идет в минус.
                    //Также нужно установить флаг на верный ответ, чтобы счетчик снижался при одном ответе (а не два раща при потворе буквы типа АА ББ)
                    verno = true;

                }

            }

            if(!verno){

                errorCounter++;
                risuy.error(errorCounter);


            }



            String buffString = new String();

            for(char c : buffer){

                if(c == 0){

                    buffString+= "_";

                } else {

                    buffString+= c;

                }

            }

            System.out.println(buffString);

        }

    if(errorCounter == word.length()){

        System.out.println("lose");

    }

    if(win){

        System.out.println("win!");

    }


    }


}
