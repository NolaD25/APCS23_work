import processing.core.*;

public class Mob{
    public Mob(PApplet p, PVector position, int healthBar){
        this.p = p;
        this.position = position.copy();
        this.healthBar = healthBar;
        alpha = 255;
        from = p.color(25, 163, 15);
        to = p.color(227,0,0);
        inter = from;
    }
    
    public float getX(){return position.x;}
    public float getY(){return position.y;}
    public float getZ(){return position.z;}
    public int getHealth(){return healthBar;}
    
    public void setHealth(int healthBar){
        this.healthBar = healthBar;
    }

    
    public void display(){
        p.noStroke();
        p.fill(inter,alpha);
            p.pushMatrix();
                p.translate(position.x, position.y, position.z);
                p.box(50);
            p.popMatrix();
            p.pushMatrix();
                p.translate(position.x, position.y+50,position.z);
                p.box(50,100,25);
            p.popMatrix();
            p.pushMatrix();
                p.translate(position.x,position.y+112,position.z+25);
                p.box(50,25,25);
            p.popMatrix();
            p.pushMatrix();
                p.translate(position.x,position.y+112,position.z-25);
                p.box(50,25,25);
            p.popMatrix();;
        if(healthBar <= 0){
            alpha = 0;
        }
        
    }
    public void update(){
        inter = p.lerpColor(from,to, 1-healthBar/10.0f);
     
    }
    private PApplet p;
    private PVector position;
    private int from, to, inter;
    private int healthBar;
    private int alpha;
}