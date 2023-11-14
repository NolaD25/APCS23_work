public class ReverseAll{
    public static String reverse(String str){
        String rev = "";
        for(int i = str.length() - 1; i>=0; i--){
            rev = rev + str.substring(i,i+1);
        }
        return rev;
    }
    public static String[] reverseAll(String[] words){
        String[] result = new String[words.length];
        for(int i = 0; i < words.length; i++){
            result[i] = reverse(words[i]);
        }
        return result;
    }
    public static void main(String[] args){
        String[] words1 = {"abcd", "xyz"};
        String[] words2 = {"1234", "5678"};
        String[] words3 = {"racecar", "tacocat", "izzi"};
        
        String[] reverse1 = reverseAll(words1);
        for(String r1: reverse1)
            System.out.print(r1 + " ");
        System.out.println();
        String[] reverse2 = reverseAll(words2);
        for(String r2: reverse2)
            System.out.print(r2 + " ");
        System.out.println();
        String[] reverse3 = reverseAll(words3);
        for(String r3: reverse3)
            System.out.print(r3 + " ");
        System.out.println();
            
    }
}