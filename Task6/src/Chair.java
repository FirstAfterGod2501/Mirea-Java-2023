package Task6.src;

class Chair extends Furniture {
    private boolean hasBackrest;

    public Chair(String material, int weight, boolean hasBackrest) {
        super(material, weight);
        this.hasBackrest = hasBackrest;
    }

    @Override
    public void sit() {
        System.out.println("Sitting on the chair");
    }

    @Override
    public void move() {
        System.out.println("Moving the chair");
    }
}