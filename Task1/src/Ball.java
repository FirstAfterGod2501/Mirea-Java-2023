public class Ball {
    private float Radius;

    private int ColorID;

    private int GetDefaultColorId(){
        return 0;
    }

    private int GetDefaultRadius(){
        return 5;
    }

    public Ball(float radius) {

        Radius = radius;

        ColorID = GetDefaultColorId();
    }

    public Ball(float radius, int colorID) {

        Radius = radius;

        ColorID = colorID;
    }

    public Ball() {

        Radius = GetDefaultRadius();

        ColorID = GetDefaultColorId();
    }

    public void SetRadius(float radius) {
        Radius = radius;
    }

    public void SetColorId(int colorID) {
        ColorID = colorID;
    }

    public float GetRadius() {
        return Radius;
    }

    public int GetColorID(){
        return ColorID;
    }

    public String toString(){
        return ColorID +", radius " + Radius;
    }
}
