public class Sequences
{
    public static void main (String[] args)
    {
        int n = 5;
        System.out.println(n);
        
        n =23;
        System.out.println(n);
        
        float x = 1.23f;
        System.out.println(x);
        
        double y = 2.34;
        System.out.println(y);
        
        boolean happy = true;
        System.out.println(happy);
        
        String name = "Nola";
        System.out.println(name);
        
        //print odd numbers
        
        for(int i=0; i<10; i++)
        {
           if(i%2==1)
               System.out.println(i);
            
        }
        
        int value = 1;
        for(int i =0; i<5; i++)
        {
            System.out.println(value);
            value += 2; // value = value + 2
            
        }
        
    }
}