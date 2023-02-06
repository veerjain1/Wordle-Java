import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      boolean userDemand = true;
      Scanner myObj = new Scanner(System.in);
      
      
      while(userDemand){
        Game game = new Game();
        game.play();
      System.out.println("\nDo you want to play again?\n");
        String demand = myObj.nextLine();
        if(demand.equals("yes")){
          System.out.println("Here is the score from last game ... " +game.getScore()+"\nStarting next game...\n\n");
        }
        else{
          userDemand = false;
          System.out.println("Aw sorry to see you go ... See you later!");
        }
      }

      

    }
}