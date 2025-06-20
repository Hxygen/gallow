import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.nio.file.*;
import java.util.Random;


public class Loader {

    Random rnd = new Random();
    public String word() {
        Path path = Paths.get("words.txt");

        try {
            List<String> buff = Files.readAllLines(path);
           return buff.get(rnd.nextInt(buff.size()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }














}
