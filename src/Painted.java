public class Painted {

    String[] asciiArt = {
            " ======",
            " |   ||",
            "     ||",
            "     ||",
            "     ||",
            "     ||",
            "     ||",
            "========"
    };

    // Создаём двумерный массив
    char[][] galoowImage = new char[asciiArt.length][];
    Painted(){

    for (int i = 0; i < asciiArt.length; i++) {
        galoowImage[i] = asciiArt[i].toCharArray();
    }
    }

    // Добавь сюда char[] wordLetters, char[] errorLetter для обозначения введенных букв и ошибочных букв (отрисовка в одном месте)
    public void error(int flag){
        switch (flag){

            case 1:
                galoowImage[2][1] = '0';
                break;
            case 2:
                galoowImage[3][1] = '|';
                break;
            case 3:
                galoowImage[3][0] = '/';
                break;
            case 4:
                galoowImage[3][2] = '\\';
                break;
            case 5:
                galoowImage[4][0] = '/';
                break;
            case 6:
                galoowImage[4][2] = '\\';
                break;



        }

        // Пример вывода:
        for (char[] row : galoowImage) {
            System.out.println(new String(row));
        }



    }





}
