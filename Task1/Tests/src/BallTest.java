public class BallTest {
    public BallTest(){
        System.out.println("Ball test");

        Ball b1 = new Ball();
        Ball b2 = new Ball(2);
        Ball b3 = new Ball(2, 2);

        final var radius = 4;

        b1.SetRadius(radius);
        b2.SetRadius(radius);
        b3.SetRadius(radius);

        System.out.println("radius test\n\n");
        if(!(b1.GetRadius() == b2.GetRadius() && b2.GetRadius() == b3.GetRadius() && b3.GetRadius() == radius)) {
            System.out.println("test not pass");
            return;
        }
        System.out.println("radius test passed\n\n");

        b1.SetColorId(radius);
        b2.SetColorId(radius);
        b3.SetColorId(radius);

        System.out.println("color test\n\n");
        if(!(b1.GetColorID() == b2.GetColorID() && b2.GetColorID() == b3.GetColorID() && b3.GetColorID() == radius)) {
            System.out.println("test not pass");
            return;
        }
        System.out.println("color test passed\n\n");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


        System.out.println("all tests passed\n\n");
    }
}
