package prac_7.task3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed); this.topLeft.x = x1;
    }
    public boolean speedControl()
    {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }
    public void moveUp()
    {
        if(speedControl()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }
    public void moveDown() {
        if (speedControl()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }
    public void moveLeft() {
        if (speedControl()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }
    public void moveRight() {
        if (speedControl()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
    @Override
    public String toString(){
        return "this.topLeft point of rectangle is at x: "+this.topLeft.x+", y:"+this.topLeft.y+"; BottomRight point of rectagle is at x: "+this.bottomRight.x+", y:"+this.bottomRight.y;
    }


}
