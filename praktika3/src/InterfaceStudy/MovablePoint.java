package InterfaceStudy;

public class MovablePoint extends Movable{
    public double x = 0, y = 0;
    public MovablePoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp(double move_amount){
        this.y += move_amount;
    }
    @Override
    public void moveDown(double move_amount){
        this.y -= move_amount;
    }
    @Override
    public void moveLeft(double move_amount){
        this.x -= move_amount;
    }
    @Override
    public void moveRight(double move_amount){
        this.x += move_amount;
    }

    @Override
    public String toString()
    {
        return  this.x + " " +this.y;
    }
}
