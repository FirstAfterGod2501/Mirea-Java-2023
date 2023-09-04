public class BallTest {
    public BallTest(){
        Ball b1 = new Ball();
        Ball b2 = new Ball(2);
        Ball b3 = new Ball(2, 2);

        var radius = 4;

        b1.SetRadius(radius);
        b2.SetRadius(radius);
        b3.SetRadius(radius);

        if(!(b1.GetRadius() == b2.GetRadius() && b2.GetRadius() == b3.GetRadius() && b3.GetRadius() == radius)) {
            System.out.println("test not pass");
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
