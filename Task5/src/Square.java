class Square extends Rectangle {

    Square() {
        SetColor("blue");
        SetFilled(false);
    }

    Square(double side) {
        SetColor("blue");
        SetFilled(false);
        this.width = side;
        this.length = side;
    }

    Square(double side, String color, boolean filled) {
        SetColor("blue");
        SetFilled(false);
        this.width = side;
        this.length = side;
    }

    double GetSide() {
        return this.width;
    }

    void SetSide(double side) {
        if (side > 0) {
            this.width = side;
            this.length = side;
            System.out.println("Square side setted as: " + this.width);
        } else {
            System.out.println("Square side must be > 0");
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: square, side: " + this.width;
    }
}