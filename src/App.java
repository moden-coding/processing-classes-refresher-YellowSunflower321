import processing.core.*;
import java.util.*;

public class App extends PApplet{
    ArrayList<Enemy> enemies = new ArrayList<>();
    float positionX;
    float positionY;
    float size = 100;
    ArrayList<Enemy> list = new ArrayList<>();

    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void settings(){
        size(800,600);
    }

    public void setup(){

    }

    public void draw(){
        for(Enemy image : list){
            displayEnemy();
        }
    }

    public void mousePressed(){
        if(mousePressed){
            Enemy enemy = new Enemy(this, mouseX, mouseY);
            positionX = mouseX;
            positionY = mouseY;
            list.add(enemy);
        }
    }

    public void displayEnemy(){
        fill(200,100,100);
        circle(positionX,positionY,size);

    }



}
