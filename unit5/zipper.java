import processing.core.*;

public class Zipper{
    public Zipper(PApplet p, float x, float y, float w, float h){
        this.p = p;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        
        
    }
    public void display(){
        p.rectMode(CENTER);
        p.rect(x, y, w, h);
        
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