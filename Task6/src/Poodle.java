package Task6.src;

class Poodle extends Dog {
    public Poodle(int age) {
        super("Poodle", age);
    }

    @Override
    public void bark() {
        System.out.println("Poodle is barking");
    }
}
