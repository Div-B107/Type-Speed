import global.GlobalStrings;
import util.Util;

import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Util.writeWordsToFile();
        Util.writeWordsToArray();

        Random random =  new Random();
        for(int i = 0 ; i<5 ; i++) {
            int randomNumber = random.nextInt(GlobalStrings.stringDynamicArray.getSize());
            System.out.println(GlobalStrings.stringDynamicArray.get(randomNumber));
        }


    }
}