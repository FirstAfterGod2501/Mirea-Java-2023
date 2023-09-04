class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {
        SetColor("blue");
        SetFilled(false);
    }

    Rectangle(double width, double length) {
        SetColor("blue");
        SetFilled(false);
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        SetColor("blue");
        SetFilled(false);
        this.width = width;
        this.length = length;
    }

    double GetWidth() {
        return this.width;
    }

    void SetWidth(double width) {
        if (width > 0) {
            this.width = width;
            System.out.println("Rectangle width setted as: " + this.width);
        } else {
            System.out.println("Rectangle width must be > 0");
        }
    }

    double GetLenght() {
        return this.length;
    }

    void SetLenght(double length) {
        if (length > 0) {
            this.length = length;
            System.out.println("Rectangle length setted as: " + this.length);
        } else {
            System.out.println("Rectangle length must be > 0");
        }
    }

    @Override
    double GetArea() {
        return this.length * this.width;
    }

    @Override
    double GetPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: rectangle, length: " + this.length + ", width: " + this.width;
    }
}