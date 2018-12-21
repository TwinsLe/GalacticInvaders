import java.util.*;
import java.io.*;
import java.awt.*;

public class DynamicObject {

    private double x, y, width, height;

    public DynamicObject(){
        x = y = width = height = 0;
    }

    public DynamicObject(double xx, double yy, double w, double h){
        x = xx;
        y = yy;
        width = w;
        height = h;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    @Override
    public String toString() {
        return "X Position: " + getX() + "\nY Position: " + getY();
    }

    public static void main(String[] args) {
        DynamicObject obj = new DynamicObject(0, 0, 10, 10);
        System.out.println(obj);
        while(true){

        }
    }
}
