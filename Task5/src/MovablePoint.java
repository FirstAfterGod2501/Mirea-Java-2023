public class MovablePoint implements Movable
{
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    private int x;

    private int y;

    private int xSpeed;

    private int ySpeed;
    @Override
    public void moveUp() {
        x+=xSpeed;
    }

    @Override
    public void moveDown() {
        x-=xSpeed;
    }

    @Override
    public void moveLeft() {
        y-=ySpeed;
    }

    @Override
    public void moveRight() {
        y+=ySpeed;
    }

    public int GetxSpeed(){
        return xSpeed;
    }


    public int GetySpeed(){
        return ySpeed;
    }

    public String toString(){
        return x + " " + y + "\nSpeed " + xSpeed + " " + ySpeed;
    }
}
