public class FrontTimes{
    public static void testFrontTimes(String str, int n, String expected){
        String result = frontTimes(str, n);
        System.out.println("str:" + str + " n:" + n + " expected:" + expected + " result:" + result);
        
        if(result.equals(expected))
            System.out.println("YAY");
        else
            System.out.println("NO");
    }
    public static String frontTimes(String str, int n){
       int frontLength = 3;
        if(frontLength > str.length()){
            frontLength = str.length();
        }
        String front = str.substring(0, frontLength);
        
        String result = "";
        for (int i = 0; i < n; i++){
            result = result + front;
        }
        return result;
    }
    public static void main (String[] args){
        testFrontTimes("Chocolate", 2, "ChoCho");
        testFrontTimes("Chocolate", 3, "ChoChoCho");
        testFrontTimes("Abc", 3, "AbcAbcAbc");
        
    }
    
}