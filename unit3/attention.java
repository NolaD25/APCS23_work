public class attention{
    public static void testAttention(String str, boolean expected){
        boolean result = attention(str);
        System.out.println("str:" + str + " expected:" + expected + " result:" + result);
        
        if(result == expected)
            System.out.println("YAY");
        else
            System.out.println("NOPE");
    }
    
    public static boolean attention(String str){
        if(str.length() < 8)
            return false;
        
        String firstEight = str.substring(0,8);
        
        if(firstEight.equals("Hey you!"))
            return true;
        else
            return false;
    }
    
    public static void main (String[] args){
        testAttention("Hello, my name is Inigo Montoya.", false);
        testAttention("Excuse me, Dr. Kessner?", false);
        testAttention("Hey you! Give me your code!", true);
    }
}