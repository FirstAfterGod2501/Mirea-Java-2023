package Task12.src;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Game("13579", "11110").play());
        System.out.println(new Game("12345", "67890").play());
        System.out.println(new Game("13029", "42685").play());
    }
}