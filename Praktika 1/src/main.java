public class main
{
    public static void main(String[] args)
    {
        Ball b0 = new Ball();
        Ball b1 = new Ball("black");
        Ball b2 = new Ball(10);
        Ball b3 = new Ball("white", 10);
        b0.setBallColour("red");
        b0.setBallRadius(100);
        b1.setBallRadius(2);
        b2.setBallColour("yellow");
        System.out.println(b0.getBallColour() + " " + b0.getBallRadius());
        System.out.println(b0.getBallInfo());
        System.out.println(b1.getBallInfo());
        System.out.println(b2.getBallInfo());
        System.out.println(b3.getBallInfo());
    }
}
