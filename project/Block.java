import processing.core.*;

public class Block{
    public Block(PApplet p, PVector position, float size){
        this.p = p;
        this.position = position.copy;
        this.size = size;
    }
    public void display(){
        p.pushMatrix();
        p.translate(position.x,position.y,position.z);
        p.box(size);
        p.popMatrix();
        
    }
    
    private PApplet p;
    private PVector position;
    private float size;
    
}