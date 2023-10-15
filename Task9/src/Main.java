package Task9.src;

public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet("Земля");
        System.out.println(earth.getName());

        Car bmw = new Car("BMW");
        System.out.println(bmw.getName());

        Phone iphone = new Phone(999.99);
        System.out.println(iphone.getPrice());

        Book harryPotter = new Book(19.99);
        System.out.println(harryPotter.getPrice());
    }
}