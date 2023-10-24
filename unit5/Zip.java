import processing.core.*;

public class Zip{
    public Zip(PApplet p, float x, float y, float w, float h){
        this.p = p;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        
        
    }
    public void display(){
    
        p.noStroke();
        p.ellipse(x,y,w,h);
        p.rectMode(p.CENTER);
        p.rect(x,y+10,w/4*3,h);
        p.fill(100);
    }
    public void update(){
        y++;
        
    }
    
    private PApplet p;
    private float x;
    private float y;
    private float w;
    private float h;
}