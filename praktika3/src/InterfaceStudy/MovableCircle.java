package InterfaceStudy;

public class MovableCircle extends Movable{
    private double radius = 0;

    private MovablePoint centrePoint = new MovablePoint(1, 1);

    public MovableCircle() {}

    public double getRadius() {
        return radius;
    }

    public MovableCircle(double radius, double x, double y)
    {
        this.radius = radius;
        this.centrePoint.setXY(x, y);
    }
    public double getArea()
    {
        return this.radius*this.radius*Math.PI;
    }
    public double getCircleLength()
    {
        return 2*this.radius*Math.PI;
    }
    @Override
    public void moveDown(double move_amount)
    {
        this.centrePoint.moveDown(move_amount);
    }

    @Override
    public void moveLeft(double move_amount)
    {
        this.centrePoint.moveLeft(move_amount);
    }

    @Override
    public void moveRight(double move_amount)
    {
        this.centrePoint.moveRight(move_amount);
    }

    @Override
    public void moveUp(double move_amount)
    {
        this.centrePoint.moveUp(move_amount);
    }

    @Override
    public String toString()
    {
        return  this.getArea() + " " +this.getCircleLength()+ " " +this.getRadius()+ " " +this.centrePoint.toString();
    }
}
