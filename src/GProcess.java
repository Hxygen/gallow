import javax.swing.Painter;
import java.util.Scanner;

public class GProcess {

    String word = new String();
    char[] bufferChars;
    char[] errorChars;
    int errorCounter = 0;
    Scanner scan = new Scanner(System.in);


    GProcess(String word){

        this.word = word;
        // System.out.println(word);
        bufferChars = new char[word.length()];
        errorChars = new char[word.length()];
        for (int i = 0; i < bufferChars.length; i++) {
            bufferChars[i] = '_';
        }

    }

    public void game(){

        int rightQA = 0;
        boolean youWinner = false;

        Painted pntd = new Painted();




        for (int i = 0; i < word.length(); i++) {

            boolean goodCheck = false;

            if(rightQA == word.length()){

                youWinner = true;
                break;
            }

            System.out.println("Введите букву?");
            char inputLetter = scan.next().charAt(0);

            for (int j = 0; j < word.length(); j++) {

                if(inputLetter == word.charAt(j)){

                    bufferChars[j] = inputLetter;
                    goodCheck = true;
                    rightQA++;

                }

            }

            if(goodCheck){

                i--;

            } else {

                errorChars[errorCounter] = inputLetter;
                errorCounter++;


            }

            pntd.error(errorCounter);

            String bufferString = new String();
            for (char c : bufferChars){

                bufferString+= c;

            }

            System.out.println(bufferString);

            String bufferCharsString = "Ошибки (" + errorCounter + "): ";

            for(char c : errorChars){

                if(c != 0) {
                    bufferCharsString += c + ", ";
                }

            }

            System.out.println(bufferCharsString);


        }

        if(youWinner){

            System.out.println("Вы выиграли!");

        } else {

            System.out.println("Вы проиграли!");
            pntd.error(6);

        }



    }

}
