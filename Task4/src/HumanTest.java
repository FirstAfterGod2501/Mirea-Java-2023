package Task4.src;

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head();
        Leg leg = new Leg();
        Hand hand = new Hand();

        Human human = new Human(head, leg, hand);
        System.out.println("Head created");
        System.out.println("Head test passed");

        System.out.println("leg created");
        System.out.println("leg test passed");

        System.out.println("hand created");
        System.out.println("hand test passed");
    }
}