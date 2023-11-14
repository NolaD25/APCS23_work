import java.util.*;
public class FilterGoodScore{
    public static ArrayList<Integer> filterGoodScore(ArrayList<Integer> nums){
        ArrayList<Integer> scores = new ArrayList<Integer>();
        for(int s: nums){
            if(s > 90){
                scores.add(s);
            }
        }
        return scores;
    }
    public static void main(String[] args){
        ArrayList<Integer> scores1 = new ArrayList<Integer>();
        scores1.add(51);
        scores1.add(52);
        scores1.add(53);
        scores1.add(100);
        
        ArrayList<Integer> scores2 = new ArrayList<Integer>();
        scores2.add(92);
        scores2.add(89);
        scores2.add(90);
        scores2.add(99);
        
        System.out.println(filterGoodScore(scores1));
        System.out.println(filterGoodScore(scores2));
    }
}