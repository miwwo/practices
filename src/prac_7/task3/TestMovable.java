package prac_7.task3;

public class TestMovable {
    public static void main(String[] args) {
        Movable c1 = new MovablePoint(0, 0, 1, 4);
        System.out.println("Point:\n");
        System.out.println(c1);
        c1.moveUp();
        c1.moveRight();
        System.out.println("Up+Right -> " + c1);

        System.out.println("\nCircle:\n");
        c1 = new MovableCircle(0, 0, 2, 4, 6);
        System.out.println(c1);
        c1.moveDown();
        c1.moveLeft();
        System.out.println("Down+Left -> " + c1);

        System.out.println("\nRectangle:\n");
        c1 = new MovableRectangle(0, 0, 4, 4, 2,4);
        System.out.println(c1);
        c1.moveRight();
        c1.moveDown();
        System.out.println("Right+Down -> " + c1);
    }
}