import InterfaceStudy.MovableCircle;


public class main {
    public static void main(String[] args)
    {
        double x = 1, y = 2, radius = 1, move_distance = 4;
        MovableCircle movableCircle = new MovableCircle(radius, x, y);
        movableCircle.moveDown(move_distance);
        System.out.println(movableCircle.toString());
    }

}
