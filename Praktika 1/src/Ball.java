public class Ball
{
    private int radius_pr;
    private String colour_pr;
    public Ball(String colour, int radius)
    {
        colour_pr = colour;
        radius_pr = radius;
    }
    public Ball(String colour)
    {
        colour_pr = colour;
        radius_pr = 0;
    }
    public Ball(int radius)
    {
        colour_pr = "see-through";
        radius_pr = radius;
    }
    public Ball()
    {
        colour_pr = "see-through";
        radius_pr = 0;
    }
    public int getBallRadius()
    {
        return this.radius_pr;
    }
    public void setBallRadius(int newradius)
    {
        this.radius_pr = newradius;
    }
    public String getBallColour()
    {
        return this.colour_pr;
    }
    public void setBallColour(String newcolour)
    {
        this.colour_pr = newcolour;
    }
    public String getBallInfo()
    {

        return "A " + this.colour_pr + " ball with a radius " + this.radius_pr;
    }
}
