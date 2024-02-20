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
            for(int j = 0; j <10; j++){
                for(int k = 0; k <10; k++){
                    addBlock(i,j,k);
                }
            }
        }
        cam = new PeasyCam(this,0,0,0,400);
        cam.setMinimumDistance(400);
        cam.setMaximumDistance(400);
        
        minecraft = loadImage("Minecraft.png");
        minecraft.resize(width/4, height/4);
        
        play = loadImage("Play.png");
        play.resize(width/7, height/7);
        
        playSelect = loadImage("PlaySelect.png");
        playSelect.resize(width/7, height/7);
        
        quitGame = loadImage("QuitGame.png");
        quitGame.resize(width/9,height/9);
        
        quitGameSelect = loadImage("QuitGameSelect.png");
        quitGameSelect.resize(width/9,height/9);
       
    }
    public void addBlock(int blockPositionX, int blockPositionY, int blockPositionZ){
        float size = 100;
        PVector position = new PVector();
        
        position.x = size * blockPositionX;
        position.y = size * blockPositionY;
        position.z = size * blockPositionZ;
            
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
        
        imageMode(CENTER);
        image(minecraft, 0, -height/8);
        
        if(imageSelect == 1){
            image(play, 0, height/6);
            
        }else if(imageSelect == 2){
            image(playSelect, 0, height/6);
            
        }
        
        if(imageSelect2 == 1){
            image(quitGame, width/6, height/6);
            
        }else if(imageSelect2 == 2){
            image(quitGameSelect, width/6, height/6);
        }
    }
    public void game(){
        background(190, 233, 250);
        cam.lookAt(x,y,z);
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
        
        if (mouseButton == RIGHT) {
            PVector positionNew = new PVector();
            positionNew.x = mouseX;
            positionNew.y = mouseY;
            positionNew.z = 100 * 0;
            Block b = new Block(this,positionNew,100);
            blocks.add(b);
        }
        
        
        updateCamera();
    
    }
    
    public void mouseMoved(){
        
        
    }
    public void mousePressed(){


    }
    public void keyPressed(){
        if(gameState.equals("startGame")){
            if(keyCode == RIGHT && currentKey.equals("Down left")){
                currentKey = "Down right";
                imageSelect = 1;
                imageSelect2 = 2;
            }
            if(keyCode == LEFT && currentKey.equals("Down right")){
                currentKey = "Down left";
                imageSelect = 2;
                imageSelect2 = 1;
            }
            
            if(keyCode == ENTER && currentKey.equals("Down left")){
                gameState = "Game";
            }
            if(keyCode == ENTER && currentKey.equals("Down right")){
                exit();
            }
        }
        if(gameState.equals("Game")){
            
        }
    }
    public void keyReleased(){
        if(gameState.equals("Game")){
            updateCamera();
        }
    }
    public void updateCamera(){
        //cameraSpeed = 5;
        /*
        if(keyPressed){
            if(key == ' '){
                cam.pan(0,-cameraSpeed);
            }else if(keyCode == 16){
                cam.pan(0, cameraSpeed);
            }else if(key == 'a'){
                cam.pan(-cameraSpeed, 0);
            }else if(key == 'd'){
                cam.pan(cameraSpeed, 0);
            }
        }*/
        
        if(keyPressed){
            if(key == 's'){
                z+=20;
            }else if(key == 'w'){
                z-=20;
            }else if(key == 'd'){
                x+=20;
            }else if(key == 'a'){
                x-=20;
            }else if(keyCode == 16){
                y+=20;
            }else if(key == ' '){
                y-=20;
            }
        }
        
    }
    
    private String gameState = "startGame";
    private ArrayList<Block> blocks;
    //private double cameraSpeed;
    private PImage minecraft, play, quitGame, playSelect, quitGameSelect;
    private String currentKey = "Down left";
    private int imageSelect = 2; 
    private int imageSelect2 = 1;
    private double x = 0;
    private double y = 0;
    private double z = 0;

    
   
    
    
    public static void main(String[] args){
        PApplet.main("Project");
    }
}