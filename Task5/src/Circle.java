class Circle extends Shape {
    protected double radius;

    Circle() {
        super.SetColor("blue");
        super.SetFilled(false);
        this.radius = 1;
    }

    Circle(double radius) {
        super.SetColor("blue");
        super.SetFilled(false);
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled) {
        super.SetColor(color);
        super.SetFilled(filled);
        this.radius = radius;
    }
    public double GetRadius() {
        return this.radius;
    }
    public void SetRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
        }
    }

    @Override
    double GetArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    double GetPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: circle, radius: " + this.radius;
    }
}