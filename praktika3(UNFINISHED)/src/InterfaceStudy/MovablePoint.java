package InterfaceStudy;

public class MovablePoint extends Movable{
    public double x = 0, y = 0;
    public MovablePoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void moveUp(double move_amount){
        this.y += move_amount;
    }
    @Override
    void moveDown(double move_amount){
        this.y -= move_amount;
    }
    @Override
    void moveLeft(double move_amount){
        this.x -= move_amount;
    }
    @Override
    void moveRight(double move_amount){
        this.x += move_amount;
    }
}
