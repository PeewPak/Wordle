
public class Main {
    public static void main(String[] args) {
        String word = Database.getWord();
        word = word.toLowerCase().strip();

        String[] letters = word.split("");

        System.out.println("Type 5 letter word:");

        for (int i = 0; i<6; i++){
            if(Checker.check(letters) == 5){
                System.out.print("\n----------You won!----------");
                break;
            } else if (i == 5) {
                System.out.println("\n----------You lost!----------");
                System.out.printf("Your word is '%s'", word);
            }
        }
    }
}