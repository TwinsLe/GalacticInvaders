public class Projectile extends DynamicObject{

    public Projectile(){
        super();
    }

    //yvelocity should remain constant. May need to change speed based on tests
    public Projectile(double xx, double yy, double w, double h){
        super(xx, yy, w, h);
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

    @Override
    public String toString() {
        return super.toString();
    }
}
