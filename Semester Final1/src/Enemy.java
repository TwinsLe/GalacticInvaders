import java.util.*;
import java.io.*;
import java.awt.*;

public class Enemy extends DynamicObject{

    //If direction = 1, Enemy direction is right.
    //If direction = -1, Enemy direction is left.
    private static int direction;
    private boolean alive;

    public Enemy(){
        super();
    }

    public static int isDirection() { return direction; }
    public static void setDirection(int direction) { Enemy.direction = direction; }


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

    public void moveRight(double dt){
        double time = (1000-dt)/1000;
        this.setX(this.getX() + 5);
    }

    public void moveLeft(double dt){
        double time = (1000-dt)/1000;
        this.setX(this.getX() - 5);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
