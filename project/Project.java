import processing.core.*;
import java.util.*;

public class Project extends PApplet{
    public void settings(){
        fullScreen(P3D); 
    }
    public void setup(){
       
    }
    public void draw(){
        background(0);
        stroke(255, 0, 0);
        line(0, 0, 400, 0);
        stroke(0, 255, 0);
        line(0, 0, 0, 400);
        stroke(0, 0, 255);
        line(0, 0, 0, 0, 0, 400);
        
        /*if(gameState == "startGame"){
            startGame();
        }else if(gameState == "Game"){
            game();
        } */
    }
    public void startGame(){
        /*background(110, 81, 59);
        rectMode(CENTER);
        fill(158, 158, 158);
        noStroke();
        rect(width/2, height/2, 500, 150);
        fill(255);
        textAlign(CENTER,CENTER);
        textSize(100);
        text("Start Game", width/2,height/2); */
    }
    public void game(){
        //background(190, 233, 250);
    }
    public void keyPressed(){
        
    }
    public void mouseMoved(){
        
    }
    public void mousePressed(){
       /* if(gameState == "startGame"){
            if(mouseX > width/2 - 250 && mouseX < width/2 + 250){
                if(mouseY > height/2 - 75 && mouseY < height/2 + 75){
                    gameState = "Game";
                }
            }
        }*/
    }
    
    //private String gameState = "startGame";
    
    public static void main(String[] args){
        PApplet.main("Project");
    }
}