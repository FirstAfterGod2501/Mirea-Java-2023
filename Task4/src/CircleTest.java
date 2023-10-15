package Task4.src;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());

        circle.setRadius(10);
        System.out.println("Updated Radius: " + circle.getRadius());
        System.out.println("Updated Perimeter: " + circle.calculatePerimeter());
        System.out.println("Updated Area: " + circle.calculateArea());
    }
}