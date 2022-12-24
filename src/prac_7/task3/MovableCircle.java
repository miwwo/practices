package prac_7.task3;

public class MovableCircle  implements  Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public void moveUp()
    {
        center.moveUp();
    }
    public void moveDown()
    {
        center.moveDown();
    }
    public void moveLeft()
    {
        center.moveLeft();
    }
    public void moveRight()
    {
        center.moveRight();
    }
    @Override
    public String toString(){
        return "Circle is at x:"+this.center.x+" , y:"+this.center.y;
    }
}
