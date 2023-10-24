import processing.core.*;
import java.util.*;

public class Animation extends PApplet{
    
    public void settings(){
        size(800,800);
        
    }
    public void setup(){
         zips = new ArrayList<Zip>();
         for(int i = 0; i<2; i++){
             addZip();
         }
    }
    public void addZip(){
    
        float x = width/2;
        float y = 0;
        float w = 20;
        float h = 20;
        Zip z = new Zip(this,x,y,w,h);
        zips.add(z);
    }
        
    
    public void draw(){
        background(0);
        for(Zip z: zips){
            z.display();
            z.update();
        }
        
    }
    private ArrayList<Zip> zips;
    
    public static void main(String[] args){
        PApplet.main("Animation");
    }
    
}