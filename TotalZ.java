public class TotalZ{
    public static void testTotalZ(String[] words, int expected){
        int result = totalZ(words);
        System.out.println("expected: " + expected + " result: " + result);
        
        if(expected == result){
            System.out.println("YAY");
        }else{
            System.out.println("NO");
        }
    }
    public static int totalZ(String[] words){
        int total = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].substring(0,1).equals("z")){
                total+= words[i].length();
            }
        }
        return total;
    }
    public static void main(String[] args){
        String[] words1 = {"Dr. Kessner", "Dr. Sands"};
        String[] words2 = {"zorro", "zero", "zippy"};
        
        testTotalZ(words1, 0);
        testTotalZ(words2, 14);
    }
}