import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String urlPath = "https://random-word-api.herokuapp.com/word";
        try {
            URL url = new URL(urlPath);
            Scanner scanner = new Scanner(url.openStream());
            String randomWord = scanner.useDelimiter("\\A").nextLine();
            System.out.println(randomWord);

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}