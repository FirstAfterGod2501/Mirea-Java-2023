package Task5.src;

public class MovableRectangle implements Movable{
   private MovablePoint TopLeft;

   private MovablePoint BottomRight;

   MovableRectangle(int x1, int x2, int y1,int y2, int xSpeed, int ySpeed){
       TopLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);

       BottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
   }

   private boolean isSameSpeed(){
       return TopLeft.GetxSpeed() == BottomRight.GetxSpeed() &&
               TopLeft.GetySpeed() == BottomRight.GetySpeed();
   }

    @Override
    public void moveUp() {
        if (isSameSpeed()) {
            TopLeft.moveUp();
            BottomRight.moveUp();
        }
        else{
            throw new RuntimeException("different speed");
        }
    }

    @Override
    public void moveDown() {
        if (isSameSpeed()) {
            TopLeft.moveDown();
            BottomRight.moveDown();
        }
        else{
            throw new RuntimeException("different speed");
        }
    }

    @Override
    public void moveLeft() {
        if (isSameSpeed()) {
            TopLeft.moveLeft();
            BottomRight.moveLeft();
        }
        else{
            throw new RuntimeException("different speed");
        }
    }

    @Override
    public void moveRight() {
        if (isSameSpeed()) {
            TopLeft.moveRight();
            BottomRight.moveRight();
        }
        else{
            throw new RuntimeException("different speed");
        }
    }
}
