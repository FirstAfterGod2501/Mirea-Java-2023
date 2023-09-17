public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head();
        Leg leg = new Leg();
        Hand hand = new Hand();

        Human human = new Human(head, leg, hand);
    }
}