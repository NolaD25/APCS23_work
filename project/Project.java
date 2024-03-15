import processing.core.*;
import java.util.*;
import peasy.*;

public class Project extends PApplet{
    
    public void settings(){
        fullScreen(P3D); 
    }
    public void setup(){
        dirt = loadImage("dirtBlock.png");
        
        blocks = new ArrayList<Block>();
        
        for(int i = 0; i <10; i++){
            for(int j = 0; j <10; j++){
                for(int k = 0; k <10; k++){
                    addBlock(i,j,k,dirt);
                }
            }
        }
        
        minecraft = loadImage("Minecraft.png");
        minecraft.resize(width/2, height/2);
        
        play = loadImage("Play.png");
        play.resize(width/3, height/3);
        
        playSelect = loadImage("PlaySelect.png");
        playSelect.resize(width/3, height/3);
        
        quitGame = loadImage("QuitGame.png");
        quitGame.resize(width/4, height/4);
        
        quitGameSelect = loadImage("QuitGameSelect.png");
        quitGameSelect.resize(width/4, height/4);
        
        
        
        //prevMouseX = mouseX;
        //prevMouseY = mouseY;
        
       
    }
    public void addBlock(int blockPositionX, int blockPositionY, int blockPositionZ, PImage image){
        float size = 100;
        PVector position = new PVector();
        
        position.x = size * blockPositionX;
        position.y = size * blockPositionY;
        position.z = size * blockPositionZ;
            
        Block b = new Block(this, position, size, image);
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
        image(minecraft, width/2, height/4);
        
        if(imageSelect == 1){
            image(play, width/2, height/4 * 3);
            
        }else if(imageSelect == 2){
            image(playSelect, width/2, height/4 * 3);
            
        }
        
        if(imageSelect2 == 1){
            image(quitGame, width/6 * 5, height/4 * 3);
            
        }else if(imageSelect2 == 2){
            image(quitGameSelect, width/6 * 5, height/4 * 3);
        }
    }
    public void game(){
        background(190, 233, 250);
        pushMatrix();
        checkMouseMovement();
        cameraPos.add(cameraVel);
        targetPos.add(cameraVel);
        
        
        camera(cameraPos.x, cameraPos.y, cameraPos.z, targetPos.x, targetPos.y, targetPos.z,0,1,0);
        
        for(Block b: blocks){
            pushMatrix();
            b.display();
            popMatrix();
        }
        
        
        translate(width/2, height/2);
        strokeWeight(10);
        stroke(255, 0, 0);
        line(0, 0, 400, 0);
        stroke(0, 255, 0);
        line(0, 0, 0, 400);
        stroke(0, 0, 255);
        line(0, 0, 0, 0, 0, 400);
        
        /*if (mouseButton == RIGHT) {
            PVector positionNew = new PVector();
            positionNew.x = mouseX;
            positionNew.y = mouseY;
            positionNew.z = 100 * 0;
            Block b = new Block(this,positionNew,100,dirt);
            blocks.add(b);
        }*/
        popMatrix();
        
        
        fill(0);
        text("cameraPos: " + cameraPos.x + ", " + cameraPos.y + ", " + cameraPos.z, width/7*6,height/5);
        text("targetPos: " + targetPos.x + ", " + targetPos.y + ", " + targetPos.z, width/7*6, height/5 + 20);
        text("heading: " + heading.x + ", " + heading.y + ", " + heading.z, width/7*6, height/5 + 40);
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
            updateCamera();
        }
    }
    public void keyReleased(){
        if(gameState.equals("Game")){
            if(key == 'a'){
            //cameraVel.z = 0;
        }if(key == 'd'){
            //cameraVel.z = 0;
        }if(key == 's'){
            cameraVel.mult(0);
        }if(key == 'w'){
            cameraVel.mult(0);
        }if(keyCode == 32){
            cameraVel.y = 0;
        }if(keyCode == 16){
            cameraVel.y = 0;
        }
        }
    }
    public void updateCamera(){
        if(key == 'a'){
            
        }if(key == 'd'){
            
            
        }if(key == 's'){ //fix
            
            cameraVel.x = heading.x;
            cameraVel.y = 0;
            cameraVel.z = heading.y;
            cameraVel.mult(-1);
        }if(key == 'w'){
            
            
            cameraVel.x = heading.x;
            cameraVel.y = 0;
            cameraVel.z = heading.y;
            
            
            
        }if(keyCode == 32){
            cameraVel.y = -camSpeed;
        }if(keyCode == 16){
            cameraVel.y = camSpeed;
        }  
    }
    void checkMouseMovement(){
        /*boolean mouseXInc = mouseX > prevMouseX;
        boolean mouseYInc = mouseY > prevMouseY;
        boolean mouseXDec = mouseX < prevMouseX;
        boolean mouseYDec = mouseY < prevMouseY;
        boolean mouseXStay = mouseX == prevMouseX;
        boolean mouseYStay = mouseY == prevMouseY;
        
        prevMouseX = mouseX;
        prevMouseY = mouseY;
        
        if (mouseXInc) {
            
        } else if (mouseXDec) {
            
        } else if (mouseXStay) {
            
        }
  
        if (mouseYInc) {
            targetPos.y += 2;
        } else if (mouseYDec) {
            targetPos.y -= 2;
        } else if (mouseYStay) {
            
        }*/
        
       
        
        
        if(mouseX < width/4){
            rotationAngle = map(mouseX, 0, width/4, -PI/150, 0);
        }else if(mouseX > width/4*3){
            rotationAngle = map(mouseX, 0, width/4*3, 0, PI/150);
        }else{
            rotationAngle = 0;
        }
    
        heading.rotate(rotationAngle);
    
        targetPos.x = heading.x;
        targetPos.y = 0;
        targetPos.z = heading.y;
    
        targetPos.mult(10);
        targetPos.add(cameraPos);
        
         targetPos.y = map(mouseY,0,height,-50,50) + cameraPos.y;
        

    }
    
    
    private String gameState = "startGame";
    private ArrayList<Block> blocks;
    private PImage minecraft, play, quitGame, playSelect, quitGameSelect, dirt;
    private String currentKey = "Down left";
    private int imageSelect = 2; 
    private int imageSelect2 = 1;
    private int camSpeed = 2;
    private PVector cameraPos = new PVector(-10,-10,10);
    private PVector targetPos = new PVector(-10,-10,0);
    private PVector cameraVel = new PVector(0, 0, 0);
    private PVector heading = new PVector(0,-1);
    private int prevMouseX, prevMouseY;
    private float rotationAngle;

    
    public static void main(String[] args){
        PApplet.main("Project");
    }
}