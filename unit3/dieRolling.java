public class dieRolling{
    
    public static int dieRolling(){
        int die = (int) (Math.random() * 6) + 1;
        
        return die;
    }
    
    public static void main (String[] args){
        for(int i = 0; i < 10; i++){
            System.out.println(dieRolling());
        }
    }
}