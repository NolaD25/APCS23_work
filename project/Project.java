import processing.core.*;
import java.util.*;

public class Project extends PApplet{
    public void settings(){
        fullScreen(P3D); 
    }
    public void setup(){
       blocks = new Arraylist<Block>();
        for(int i = 0; i <10; i++){
            addBlock();
        }
    }
    public void addBlock(){
        float size = 100;
        PVector position = new PVector()
            
        position.x =
        position.y =
        position.z =
            
        Block b = new Block(this,position,size);
        blocks.add(b);
    }
    public void draw(){
        /*background(0);
        translate(width/2, height/2);
        stroke(255, 0, 0);
        line(0, 0, 400, 0);
        stroke(0, 255, 0);
        line(0, 0, 0, 400);
        stroke(0, 0, 255);
        line(0, 0, 0, 0, 0, 400);*/
        
        if(gameState == "startGame"){
            startGame();
        }else if(gameState == "Game"){
            game();
        }
    }
    public void startGame(){
        background(110, 81, 59);
    }
    public void game(){
        background(190, 233, 250);
    }
    public void keyPressed(){
        
    }
    public void mouseMoved(){
        
    }
    public void mousePressed(){
       if(gameState == "startGame"){
            gameState = "Game";  
        }
    }
    
    private String gameState = "startGame";
    
    public static void main(String[] args){
        PApplet.main("Project");
    }
}