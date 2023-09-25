public class isVampire{
    public static void testIsVampire(float hour, boolean awake, boolean expected){
        boolean result = isVampire(hour, awake);
        System.out.println("hour:" + hour + " awake:" + awake + " expected:" + expected + " result:" + result);
        
        if(result == expected)
            System.out.println("YAS");
        else
            System.out.println("NOPE");
        
    }
    
    public static boolean isVampire(float hour, boolean awake){
        if((hour >= 6 && hour < 22) && !awake)
            return false;
        else if((hour < 6 && hour >= -6) && awake)
            return false;
        else
            return true;
    }
    
    public static void main (String[] args){
        testIsVampire(9, false, false);
        testIsVampire(1,true,false);
        testIsVampire(3,false,true);
    }
}