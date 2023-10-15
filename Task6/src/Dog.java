package Task6.src;

abstract class Dog {
    protected String breed;
    protected int age;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public abstract void bark();

    public void sleep() {
        System.out.println("The dog is sleeping");
    }
}