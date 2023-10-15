package Task6.src;

class Bulldog extends Dog {
    public Bulldog(int age) {
        super("Bulldog", age);
    }

    @Override
    public void bark() {
        System.out.println("Bulldog is barking");
    }
}