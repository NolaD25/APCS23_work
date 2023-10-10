public class Reverse{
    public static void testReverse(String str, String expected){
        String result = Reverse(str);
        System.out.println("str:" + str + " expected:" + expected + " result:" + result);
        
        if(result.equals(expected))
            System.out.println("YAS");
        else
            System.out.println("NOOO");
    }
    public static String Reverse(String str){
        String rev = "";
        for(int i = str.length() - 1; i>=0; i--){
            rev = rev + str.substring(i,i+1);
        }
        return rev;
    }
    public static void main (String[] args){
        testReverse("bad", "dab");
        testReverse("Hello, world!", "!dlrow ,olleH");
        testReverse("tacocat", "tacocat");
        testReverse("Nola", "aloN");
        testReverse("Coding is fun", "nuf si gnidoC");
        
    }
}