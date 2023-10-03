public class startHi{
    public static void testStartHi(String str, boolean expected){
        boolean result = startHi(str);
        System.out.println("str:" + str + " expected:" + expected + " result:" + result);
        
        if(result == expected)
            System.out.println("YAS");
        else
            System.out.println("NOPE");
        
    }
    
    public static boolean startHi(String str){
        if(str.length() < 2)
            return false;
        String firstTwo = str.substring(0,2);
        
        if(firstTwo.equals("hi"))
            return true;
        else
            return false;
    }
    
    public static void main (String[] args){
        testStartHi("hi there", true);
        testStartHi("hi", true);
        testStartHi("hello hi",false);
    }
    
}