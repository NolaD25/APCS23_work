public class coinFlip{
    public static String coinFlip(){
        int coin = (int) (Math.random()* 10) + 1;
        
        String heads = "heads";
        String tails = "tails";
        
        if(coin <= 5)
            return heads;
        else
            return tails;
    }
    public static void main (String[] args){
        for(int i = 0; i < 20; i++){
            System.out.println(coinFlip());
        }
        
    }
    
}