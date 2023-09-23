package util;

import global.GlobalStrings;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Util {


    public static void writeWordsToFile() {

        String urlPath = GlobalStrings.URL_PATH;
        try {

            URL url = new URL(urlPath);

            for (int i = 0; i < 20; i++) {

                Scanner scanner = new Scanner(url.openStream());
                String randomWord = scanner.useDelimiter("\\A").nextLine();
                String newWord = randomWord.replace("[\"", "").replace("\"]", "");
                writeFile(newWord);
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }

    public static void writeFile(String word) {
        try (FileWriter fileWriter = new FileWriter(GlobalStrings.FILE_NAME, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(word);
            bufferedWriter.newLine();
            bufferedWriter.flush();

        } catch (IOException ex) {

            ex.printStackTrace();
        }


    }

    

}
