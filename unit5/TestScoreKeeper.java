public class TestScoreKeeper{
    public static void main(String[] args){
        ScoreKeeper s = new ScoreKeeper();
        
        s.scoreNormal();
        s.scoreBonus();
        s.scoreNormal();
        s.scoreBonus();
        s.scoreNormal();
        s.scoreBonus();
        s.scoreBonus();
        s.scoreNormal();
        
        System.out.println("Score: " + s.getScore());
    }
    
}