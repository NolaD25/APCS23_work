import processing.core.*;
import java.util.*;
import processing.sound.*;


public class Project extends PApplet{
    
    public void settings(){
        fullScreen(P3D); 
    }
    public void setup(){
        dirt = loadImage("dirtBlock.png");
        dirt.resize(width/8,width/8);
        diamond = loadImage("Diamond.png");
        water = loadImage("Water.png");
        
        blocks = new ArrayList<Block>();
        
        mobs = new ArrayList<Mob>();
        
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
        
        crossHair = loadImage("CrossHair.png");
        //crossHair.resize(width/2, height/2);
        
        hotbar = loadImage("Hotbar.png");
        
        selection = loadImage("Selection.png");
        
        inventory = loadImage("Inventory.png");
        inventory.resize(width, height);
        
        hand = loadImage("Hand.png");
        
        waterB = loadImage("WaterB.png");
        waterB.resize(width/8, width/8);
        
        diamondSword = loadImage("DiamondSword.png");
        diamondSword.resize(width/5, width/5);
        
        creeper =loadImage("Creeper.png");
        creeper.resize(width/6, width/6);
        
        dirtSound = new SoundFile(this, "Dirt Sound.mp3");
        //diamondSound = new SoundFile(this, "Stone Sound.mp3");
        waterSound = new SoundFile(this, "Water Sound.mp3");
        creeperSound = new SoundFile(this, "Creeper Sound.mp3");
        
        
        
        //prevMouseX = mouseX;
        //prevMouseY = mouseY;
        
       
    }
    public void addBlock(int blockPositionX, int blockPositionY, int blockPositionZ, PImage image){
        float size = 100;
        PVector position = new PVector();
        
        position.x = size * blockPositionX;
        position.y = size * blockPositionY;
        position.z = size * blockPositionZ;
            
        Block b = new Block(this, position, size, image, 0);
        blocks.add(b);
    }

    
    public void draw(){
        
        if(gameState.equals("startGame")){
            startGame();
        }else if(gameState.equals("Inventory")){
            inventory();
        }else if(gameState.equals("Game")){
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
        noCursor();
        pushMatrix();
        checkMouseMovement();
        cameraPos.add(cameraVel);
        targetPos.add(cameraVel);
        
        
        
        camera(cameraPos.x, cameraPos.y, cameraPos.z, targetPos.x, targetPos.y, targetPos.z,0,1,0);
        
        ArrayList<Block> newBlocks = new ArrayList<Block>();
        for(Block b: blocks){
            
            pushMatrix();
            b.display();
            if(b.getWaterCount() > 0 && frameCount%60 == 0){
                PVector positionNew = new PVector(b.getX(), b.getY() + 100, b.getZ());
                Block w = new Block(this, positionNew, 100, water, b.getWaterCount() -1);
                newBlocks.add(w);
                b.setWaterCount(0);
            }
            popMatrix();
        }
        
        for(Block n: newBlocks){
            blocks.add(n);

        }
        for(Mob m: mobs){
            m.display();
        }
        
        /*
        translate(width/2, height/2);
        strokeWeight(10);
        stroke(255, 0, 0);
        line(0, 0, 400, 0);
        stroke(0, 255, 0);
        line(0, 0, 0, 400);
        stroke(0, 0, 255);
        line(0, 0, 0, 0, 0, 400); */
        
        
        popMatrix();
        
        hint(DISABLE_DEPTH_TEST);
        /*fill(255);
        rect(width/7*6,height/5, 100, 100);
        fill(0);
        text("cameraPos: " + cameraPos.x + ", " + cameraPos.y + ", " + cameraPos.z, width/7*6,height/5);
        text("targetPos: " + targetPos.x + ", " + targetPos.y + ", " + targetPos.z, width/7*6, height/5 + 20);
        text("heading: " + heading.x + ", " + heading.y + ", " + heading.z, width/7*6, height/5 + 40);*/
        
        imageMode(CENTER);
        image(crossHair, width/2, height/2);
        
        image(hotbar, width/2, height+70);
        
        image(selection, selectionX, height+70);
        
        imageMode(CORNER);
        if(blockTexture == 1){
            image(dirt, width/5*4, height/2);
        }else if(blockTexture == 2){
            image(diamond, width/5*4, height/2);
        }else if(blockTexture == 3){
            image(waterB, width/5*4, height/2);
        }else if(blockTexture == 4){
            image(diamondSword, width/3*2, height/7*3);
        }else if(blockTexture == 5){
            image(creeper, width/6*4+100, height/2);
        }
        
        image(hand, width/3*2, height/2);
        
        
        
        
        
        hint(ENABLE_DEPTH_TEST);
    }
    
    public void inventory(){
        background(0);
        imageMode(CORNER);
        image(inventory, 0, 0);
        imageMode(CENTER);
        image(selection, selectionX, height+70);
    }
    public void Quit(){

        
    }

    public void mousePressed(){
        if(gameState == "Game"){
            
            PVector positionNew = targetPos.copy();
            PVector headingBlock = heading.copy();
            float dy = cameraPos.y - targetPos.y;
            dy *= -20;
            headingBlock.mult(200);
            positionNew.x += headingBlock.x;
            positionNew.y += dy;
            positionNew.z += headingBlock.y;
            
            if(mouseButton == RIGHT){
                if(blockTexture == 1){
                    Block b = new Block(this, positionNew, 100, dirt,0);
                    blocks.add(b);
                    dirtSound.play();
                }else if(blockTexture == 2){
                    Block b = new Block(this, positionNew, 100, diamond,0);
                    blocks.add(b);
                    
                }else if(blockTexture == 3){
                    Block b = new Block(this, positionNew, 100, water, 5);
                    blocks.add(b);
                    //waterFlow(positionNew);
                    waterSound.play();
                }else if(blockTexture == 4){
                    for(Mob m: mobs){
                        if(dist(positionNew.x, positionNew.y, positionNew. z, m.getX(), m.getY(), m.getZ()) < 50){
                            m.update();
                            m.setHealth(m.getHealth() - 1);
                        }
                    }
                }else if(blockTexture == 5){
                    Mob m = new Mob(this, positionNew, 10);
                    mobs.add(m);
                    creeperSound.play();
                }
            }
            if(mouseButton == LEFT){
                for(int i = blocks.size()-1; i >= 0; i--){
                    Block d = blocks.get(i);
                    if(dist(positionNew.x, positionNew.y, positionNew.z, d.getX(), d.getY(),  d.getZ()) < 50){
                        blocks.remove(i);
                    }
                }
            }
            
        }
        

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
            chooseBlock();
            
            if(key == 'e'){
                gameState = "Inventory";
            }
  
        }
        if(gameState.equals("Inventory")){
            if(key ==  'r'){
                gameState = "Game";
            }
        }
        
    }
    public void keyReleased(){
        if(gameState.equals("Game")){
            if(key == 'a'){
                cameraVel.mult(0);
            }if(key == 'd'){
                cameraVel.mult(0);
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
            PVector temp = heading.copy();
            temp.rotate(-PI/2);
            
            cameraVel.x = temp.x;
            cameraVel.y = 0;
            cameraVel.z = temp.y;
            
        }if(key == 'd'){
            PVector temp = heading.copy();
            temp.rotate(PI/2);
            
            cameraVel.x = temp.x;
            cameraVel.y = 0;
            cameraVel.z = temp.y;
            
        }if(key == 's'){ 
            
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
    public void checkMouseMovement(){
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
    
    public void chooseBlock(){
        if(key == '1'){
            blockTexture = 1;
            selectionX = width/2;
        }
        if(key == '2'){
            blockTexture = 2;
            selectionX = width/2 + 50;
            
        }
        if(key == '3'){
            blockTexture = 3;
            selectionX = width/2 + 100;
            
        }
        if(key == '4'){
            blockTexture = 4;
            selectionX = width/2 + 170;
        }
        if(key == '5'){
            blockTexture = 5;
            selectionX = width/2 +240;
        }
        if(key == '6'){
            blockTexture = 6;
            selectionX = width/2 +310;
        }
        if(key == '7'){
            blockTexture = 7;
            selectionX = width/2 +380;
        }
        if(key == '8'){
            blockTexture = 8;
            selectionX = width/2 +470;
        }
        if(key == '9'){
            blockTexture = 9;
            selectionX = width/2 + 570;
        }
    }
    
    /*public void waterFlow(PVector position){
        int startTime = millis();
        for(int i = 0; i < 100; i+=10){
            if(millis() - startTime >= 500){
                position.y += i;
                Block b = new Block(this, position, 100, water);
                blocks.add(b);
                startTime = millis();
                
            }
        }
        
    }*/
    
    private String gameState = "startGame";
    private ArrayList<Block> blocks;
    private ArrayList<Mob> mobs;
    private PVector mobPosition;
    private PImage minecraft, play, quitGame, playSelect, quitGameSelect, dirt, diamond, water, crossHair, hotbar, selection, inventory, hand, waterB, diamondSword, creeper;
    private String currentKey = "Down left";
    private int imageSelect = 2; 
    private int imageSelect2 = 1;
    private int camSpeed = 3;
    private PVector cameraPos = new PVector(-10,-10,10);
    private PVector targetPos = new PVector(-10,-10,0);
    private PVector cameraVel = new PVector(0, 0, 0);
    private PVector heading = new PVector(0,-3);
    //private int prevMouseX, prevMouseY;
    private float rotationAngle;
    private int blockTexture = 1;
    private float selectionX = width/2;
    SoundFile dirtSound, diamondSound, waterSound, creeperSound;

    
    public static void main(String[] args){
        PApplet.main("Project");
    }
}