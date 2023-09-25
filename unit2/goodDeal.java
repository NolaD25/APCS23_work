public class goodDeal{
    public static void testGoodDeal(double originalPrice, double salePrice, boolean expected){
        boolean result = goodDeal(originalPrice, salePrice);
        System.out.println("Original Price:" + originalPrice + " Sale Price" + salePrice + " Expected:" + expected + " Result:" + result);
        
        if(result == expected)
            System.out.println("YAY");
        else
            System.out.println("TRY AGAIN");
        
    }
    public static boolean goodDeal(double originalPrice,double salePrice){
        float percentage;
        percentage = (float) ((salePrice/originalPrice) * 100);
        if(percentage <= 75)
            return true;
        else
            return false;
    }
    public static void main (String[] args){ 
        testGoodDeal(100, 75, true);
        testGoodDeal(230, 25, true);
        testGoodDeal(75, 70, false);
    }
    
}