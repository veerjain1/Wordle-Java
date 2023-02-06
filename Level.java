import java.util.Random;
import java.util.Scanner;
class Level {
    private String word;
    private int tries;
    private int points;
    
    public Level() {

      String[] words = {"plate", "curio", "adieu", "stick", "mouse", "notes"};
      Random rand = new Random(); 
      int int_random = rand.nextInt(words.length);
      
        word = words[int_random];
        tries = 0;
        points = 0;
    }
    
    public boolean play() {
        Scanner scanner = new Scanner(System.in);
        while (tries < 5) {
            System.out.println("Enter a 5 letter word: \n");
            String guess = scanner.nextLine();
            if (guess.equals(word)) {
                points = 5 - tries;
                return true;
            } else {
                tries++;
                System.out.println("\nSorry, that is not the correct word. You have " + (5 - tries) + " tries left.");
            }
        }
        return false;
    }
    
    public int getPoints() {
        return points;
    }
}