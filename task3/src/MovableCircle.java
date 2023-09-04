public class MovableCircle implements Movable
{
    private int radius;

    private MovablePoint center;

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    public String toString(){
        return "radius: " + radius + " center: " + center;
    }
}
