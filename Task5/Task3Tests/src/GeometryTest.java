package Task5.Task3Tests.src;

import Task5.src.*;

//в задании не сказано тестировать, но если вообще без тестов то техлид ругаца будет
public class GeometryTest
{
    public GeometryTest(){

        var circle = new Circle(5.4, "black", true);
        System.out.println(circle);

        var rectangle = new Rectangle(5.4 , 4.5);
        System.out.println("Rect area: " + rectangle.GetArea());
        System.out.println(rectangle);

        var square = new Square(13, "white", false);
        square.SetSide(25);
        System.out.println(square);
    }

}
