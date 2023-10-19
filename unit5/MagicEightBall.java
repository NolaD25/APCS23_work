public class MagicEightBall{
    public MagicEightBall(){
        randomNum = 0;
        yes = "Yes";
        no = "No";
        maybe = "perhaps";
    }
    
    public void ask(String questionIn){
        question = questionIn;
        randomNum = (int)(Math.random() * 3) + 1;
        if(randomNum == 1){
            System.out.println(yes);
        }else if(randomNum == 2){
            System.out.println(no);
        }else{
            System.out.println(maybe);
        }
        
    }
    
    private final String yes;
    private final String no;
    private final String maybe;
    private String question;
    private int randomNum;
}