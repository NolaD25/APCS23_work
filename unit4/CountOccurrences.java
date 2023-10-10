public class CountOccurrences{
    public static void testCountOccurrences(String str, String strSeg, int expected){
        int result = countOccurrences(str, strSeg);
        System.out.println("str:" + str + " strSeg:" + strSeg + " expected:" + expected + " result:" + result);
        
        if(result == expected)
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }
    public static int countOccurrences(String str, String strSeg){
        int count = 0;
        for(int i = 0; i <= str.length() - strSeg.length(); i++)
            if(str.substring(i, i + strSeg.length()).equals(strSeg)){
                count++;
            }
        return count;
        
    }
    public static void main (String[] args){
        testCountOccurrences("Mississippi", "iss", 2);
        testCountOccurrences("Banananana", "na", 4);
        testCountOccurrences("HiHiHiHiHi", "Hi", 5);
        testCountOccurrences("Hello", "ll", 1);
        
    }
    
}