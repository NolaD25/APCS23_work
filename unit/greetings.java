public class greetings{
    public static void testGreetings(String name, String expected){
        String result = greetings(name);
        System.out.println("name:" + name + " expected:" + expected + " result:" + result);
        
        if(result.equals(expected))
            System.out.println("YAY");
        else
            System.out.println("NOPE");
        
    }
    public static String greetings(String name){
        String Hello = "Hello, ";
        String HAY = ", how are you?";
        
        return Hello + name + HAY;
        
    }
    public static void main (String[] args){
        testGreetings("Dr. Kessner", "Hello, Dr. Kessner, how are you?");
        testGreetings("Ascii Cat", "Hello, Ascii Cat, how are you?");
        testGreetings("Sydneys", "Hello, Sydneys, how are you?");
        System.out.println(greetings("nola"));
    }
    
    
}