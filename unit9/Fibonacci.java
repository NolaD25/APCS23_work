public class Fibonacci{
    public static int[] fibonacci(int n){
        int[] result = new int[n+1];
        int a = 0;
        int b = 1;
        for(int i = 0; i < n+1; i++){
            result[i] = a;
            int next = a+b;
            a = b;
            b = next;
        }
        return result;
    }
    public static void main(String[] args){
        for(int f: fibonacci(2)){
            System.out.print(f + " ");
        }
        System.out.println();
        for(int f: fibonacci(3)){
            System.out.print(f + " ");
        }
        System.out.println();
        for(int f: fibonacci(4)){
            System.out.print(f + " ");
        }
        System.out.println();
        for(int f: fibonacci(5)){
            System.out.print(f + " ");
        }
        System.out.println();
    }
}