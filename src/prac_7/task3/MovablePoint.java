package prac_7.task3;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp()
    {
        this.x = this.x + this.xSpeed;
    }
    public void moveDown()
    {
        this.x-= xSpeed;
    }
    public void moveLeft()
    {
        this.y-=ySpeed;
    }
    public void moveRight()
    {
        this.y+=ySpeed;
    }
    @Override
    public String toString(){
        return "Point is at x:"+this.x+" , y:"+this.y;
    }
}
