package Task6.src;

class Plate extends Dish {
    private boolean isDivided;

    public Plate(String material, int capacity, boolean isDivided) {
        super(material, capacity);
        this.isDivided = isDivided;
    }

    @Override
    public void wash() {
        System.out.println("Washing the plate");
    }

    @Override
    public void use() {
        System.out.println("Using the plate");
    }
}
