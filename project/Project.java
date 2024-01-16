import processing.core.*;
import java.util.*;
import peasy.*;

public class Project extends PApplet{
    PeasyCam cam;
    
    public void settings(){
        fullScreen(P3D); 
    }
    public void setup(){
        blocks = new ArrayList<Block>();
        
        for(int i = 0; i <10; i++){
            addBlock(i,0,0);
        }
        cam = new PeasyCam(this,400);
       
    }
    public void addBlock(int blockPositionX, int blockPositionY, int blockPositionZ){
        float size = 100;
        PVector position = new PVector();
        
        position.x = size * blockPositionX;
        position.y = size * blockPositionY;
        position.z = blockPositionZ;
            
        Block b = new Block(this,position,size);
        blocks.add(b);
    }
    public void draw(){

        
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
        for(Block b: blocks){
            pushMatrix();
            b.display();
            popMatrix();
        }
        translate(width/2, height/2);
        stroke(255, 0, 0);
        line(0, 0, 400, 0);
        stroke(0, 255, 0);
        line(0, 0, 0, 400);
        stroke(0, 0, 255);
        line(0, 0, 0, 0, 0, 400);
        
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
    private ArrayList<Block> blocks;
    
    
    public static void main(String[] args){
        PApplet.main("Project");
    }
}