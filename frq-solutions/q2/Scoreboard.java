public class Scoreboard {
  private String name1;
  private String name2;
  private int score1;
  private int score2;
  private boolean active;

  public Scoreboard(String n1, String n2){
    name1 = n1;
    name2 = n2;
    score1 = 0;
    score2 = 0;
    active = true;
  }

  public void recordPlay(int score){
    if(score == 0){
      active = !active;
    } else {
      if(active){
        score1 += score; 
      } else {
        score2 += score;
      }
    }
  }

  public String getScore(){
    if(active){
      return score1 + "-" + score2 + "-" + name1;
    } else {
      return score1 + "-" + score2 + "-" + name2;
    }   
  }





  
}
