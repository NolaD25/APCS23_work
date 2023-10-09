public class sumOfSquares{
    public static void testSumOfSquares(int n, int expected){
        int result = sumOfSquares(n);
        System.out.println("n:" + n + " expected:" + expected + " result:" + result);
        
        if(result == expected)
            System.out.println("YAY");
        else
            System.out.println("NOPE");
        
    }
    public static int sumOfSquares(int n){
        int total = 0;
        for(int i = 1; i <= n; i++){
            total += Math.pow(i,2);
        }
        return total;
        
    }
    public static void main (String[] args){
        testSumOfSquares(1, 1);
        testSumOfSquares(2, 5);
        testSumOfSquares(3, 14);
        testSumOfSquares(10, 385);
        testSumOfSquares(5, 55);
    }
}