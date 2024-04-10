import processing.core.*;

public class Block{
    public Block(PApplet p, PVector position, float size, PImage texture){
        this.p = p;
        this.position = position.copy();
        this.size = size;
        this.texture = texture;
    }
    public void display(){
        p.pushMatrix();
        p.translate(position.x,position.y,position.z);
        rotateSides();
        p.popMatrix();
        
    }
    public float getX(){return position.x;}
    public float getY(){return position.y;}
    public float getZ(){return position.z;}
    
    private void drawBox(){
        p.noStroke();
        
        p.textureMode(PConstants.NORMAL);
        p.beginShape(PConstants.QUADS);
        p.texture(texture);
        p.vertex(-size/2, -size/2, size/2, 0, 0);
        p.vertex(size/2, -size/2, size/2, 1, 0);
        p.vertex(size/2, size/2, size/2, 1, 1);
        p.vertex(-size/2, size/2, size/2, 0, 1);
        p.endShape();
        //p.textureMode(PConstants.MODEL);

    }
    private void rotateSides(){
        drawBox();
        
        p.pushMatrix();
        p.rotateX(p.PI/2);
        drawBox();
        p.popMatrix();
        
        p.pushMatrix();
        p.rotateX(-p.PI/2);
        drawBox();
        p.popMatrix();
        
        p.pushMatrix();
        p.rotateY(-p.PI/2);
        drawBox();
        p.popMatrix();
        
        p.pushMatrix();
        p.rotateY(p.PI/2);
        drawBox();
        p.popMatrix();
        
        p.pushMatrix();
        p.rotateY(p.PI);
        drawBox();
        p.popMatrix();
    }
    
    private PApplet p;
    private PVector position;
    private float size;
    private PImage texture;
    
}