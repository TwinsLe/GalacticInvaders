import java.util.*;
import java.io.*;
import java.awt.*;

public class Player extends DynamicObject{

    private double health;

    public Player(){
        super();
        health = 5;
    }

    public Player(double xx, double yy, double w, double h){
        super(xx, yy, w, h);
        health = 5;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public double getX() {
        return super.getX();
    }

    @Override
    public double getY() {
        return super.getY();
    }

    @Override
    public void setX(double x) {
        super.setX(x);
    }

    @Override
    public void setY(double y) {
        super.setY(y);
    }

    public void moveRight(){
        this.setX(this.getX() + 5);
    }

    public void moveLeft(){
        this.setX(this.getX() - 5);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //Make sure to adjust for size of Player hitbox and spawn projectile right outside it.
    //yvelocity may need to be adjusted/tested later.
    public void Fire(){
        Projectile p = new Projectile(this.getX(), this.getY()+this.getHeight()/2, this.getWidth()/4, this.getHeight()/2);


    }
}
