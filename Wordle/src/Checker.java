import java.util.Scanner;
public class Checker {
    public static int check(String[] letters){
        Scanner myObj = new Scanner(System.in);
        System.out.print("\n        {  ");
        String userWord = myObj.nextLine();

        userWord = userWord.toLowerCase();
        String[] userLetters = userWord.split("");

        String white = "\033[0;97m";
        String yellow = "\033[0;93m";
        String green = 	"\033[0;92m";
        String colour = white;

        int correct = 0;
        if (userWord.length()==5) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (userLetters[i].equals(letters[j])) {
                        if (i == j) {
                            colour = green;
                        } else {
                            colour = yellow;
                        }
                        correct++;
                        break;
                    }
                }
                System.out.print(colour + userLetters[i] + "\u001B[0m");
                colour = white;
            }
        }
        else {
            System.out.print("\nIt's not 5 letter word!");
            check(letters);
        }
        return correct;
    }
}
