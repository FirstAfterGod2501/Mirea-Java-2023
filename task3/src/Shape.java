abstract class Shape {
    private String Color;
    private boolean Filled;

    Shape() {}

    Shape(String color, boolean filled) {
        Color = color;
        Filled = filled;
    }

    String GetColor() {
        return Color;
    }

    void SetColor(String color) {
        Color = color;
    }
    boolean IsFilled() {
        return Filled;
    }
    void SetFilled(boolean filled) {
        Filled = filled;
    }

    double GetArea() {
        return 0.0;
    }

    double GetPerimeter() {
        return 0.0;
    }

    public String toString() {
        return "Shape object: is filled: " + Filled + ", color: " + Color;
    }
}