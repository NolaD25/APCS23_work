import java.util.*;

public class ZName{
    public static void testZName(ArrayList<String> words, int expected){
        int result = zName(words);
        System.out.println("expected: " + expected + " result: " + result);
        
        if(result == expected){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static int zName(ArrayList<String> words){
        int total = 0;
        for(int i = 0; i < words.size(); i++){
            if(words.get(i).substring(0,1).equals("z")){
                total+= words.get(i).length();
            }
        }
        return total;
    }
    public static void main(String[] args){
        ArrayList<String> words1 = new ArrayList<String>();
        words1.add("Dr. Kessner");
        words1.add( "Dr. Sands");
        ArrayList<String> words2 = new ArrayList<String>();
        words2.add("zorro");
        words2.add("zero");
        words2.add("zippy");
        
        testZName(words1, 0);
        testZName(words2, 14);
    }
}