public class backAroundTest{
    public static void testBackAround(String str, String expected){
        String result = backAround(str);
        System.out.println("str:" + str + " expected:" + expected + " result:" + result);
        
        if(result.equals(expected))
            System.out.println("YAS");
        else
            System.out.println("NOPE");
        
    }
    
    public static String backAround(String str){
        String last = str.substring(str.length() -1);
        return last + str + last;
    }
    
    public static void main (String[] args){
        testBackAround("cat", "tcatt");
        testBackAround("Hello", "oHelloo");
        testBackAround("a", "aaa");
    }
}