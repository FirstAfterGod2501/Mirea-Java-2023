package Task6.src;

class Table extends Furniture {
    private int numberOfLegs;

    public Table(String material, int weight, int numberOfLegs) {
        super(material, weight);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void sit() {
        System.out.println("Sitting at the table");
    }

    @Override
    public void move() {
        System.out.println("Moving the table");
    }
}