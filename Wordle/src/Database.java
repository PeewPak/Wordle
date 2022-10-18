import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;
import java.nio.file.Paths;
import java.util.Scanner;

public class Database {
    public static String getWord() {

        Random rand = new Random();
        int randomNum = rand.nextInt(howManyLines());
        String word = null;
        try {
             word = Files.readAllLines(Paths.get("src/Words.txt")).get(randomNum);
             //System.out.println("Your word is: " + word);
        } catch (IOException e) {
            System.out.println(e);
        }
        return word;
    }

    protected static int howManyLines() {
        int count = 0;
        try {
            File words = new File("src/Words.txt");
            Scanner sc = new Scanner(words);

            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
            sc.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
        return count;
    }
}
