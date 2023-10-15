package Task6.src;

abstract class Furniture {
    protected String material;
    protected int weight;

    public Furniture(String material, int weight) {
        this.material = material;
        this.weight = weight;
    }

    public abstract void sit();

    public abstract void move();
}