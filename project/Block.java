import processing.core.*;

public class Block{
    public Block(PApplet p, PVector position, float size){
        this.p = p;
        this.position = position.copy();
        this.size = size;
    }
    public void display(){
        p.fill(110, 81, 59);
        p.stroke(255);
        p.translate(position.x,position.y,position.x);
        p.box(size);
        
    }
    
    private PApplet p;
    private PVector position;
    private float size;
    
}