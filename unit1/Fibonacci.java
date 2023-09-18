public class Fibonacci
{
    public static void main (String[] args)
    {
        int a = 0;
        int b = 1;
        for(int i = 0; i < 30;i++)
        {
            System.out.println(a);
            int next = a+b;
            a = b;
            b = next;
        }
        
    }
    
}