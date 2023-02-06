class Game {
    private int score;
    private int levelPoints;
  private int levelCounter = 0;
    
    public void play() {
     
        for (int i = 1; i <= 3; i++) {
            Level level = new Level();
            boolean levelCompleted = level.play();
            if (levelCompleted) {
              levelPoints = level.getPoints();
                score += levelPoints;
              levelCounter++;
                System.out.println("\nCongratulations! You have completed level " + i + " and earned " + levelPoints + " points.\n");
            } else {
                System.out.println("\nSorry, you were unable to complete level " + i + ".\n");
            }
        }
      System.out.println(goalReached());
      
    }
    
    
    
    public String goalReached() {
      String goalOutcome;
        if (levelCounter ==3) {
           goalOutcome = ("\n\nCongratulations! You have completed all levels and earned a total of " + score + " points. WOOOHOOO");
        } else {
           goalOutcome = ("\n\nUnfortunately, you were unable to complete all levels. You earned a total of " + score + " points.");
        }
        return goalOutcome;
    }


  public int getScore(){
    return score;
  }
    
}