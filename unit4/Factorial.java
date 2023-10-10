public class Factorial{
    public static void testFactorial(int n, int expected){
        int result = factorial(n);
        System.out.println("n:" + n + " expected:" + expected + " result:" + result);
        
        if(result == expected)
            System.out.println("YAY");
        else
            System.out.println("NOPE");
        
    }
    public static int factorial(int n){
        int total = 1;
        for(int i = 1; i <= n; i++){
            total *= i;
        }
        return total;
        
    }
    public static void main (String[] args){
        testFactorial(0, 1);
        testFactorial(1, 1);
        testFactorial(2, 2);
        testFactorial(3, 6);
        testFactorial(4, 24);
        testFactorial(5, 120);
        testFactorial(6, 720);
        testFactorial(7, 5040);
    }
}