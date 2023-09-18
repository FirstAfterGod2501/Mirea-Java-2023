public class BookTest {
    public BookTest() {

        System.out.println("Book test");

        Book b1 = new Book("Geoffrey Richter", "CLR via C#", 0);
        Book b2 = new Book("Andrew Troelsen, Philip Japikse", "C# 7 programming language and .NET and .NET Core platforms");
        Book b3 = new Book("java for testers");

        var name = "C# = Java";

        b1.SetName(name);
        b2.SetName(name);
        b3.SetName(name);

        System.out.println("name test\n\n");
        if (!(b1.GetName() == b2.GetName() && b2.GetName() == b3.GetName() && b3.GetName() == name)) {
            System.out.println("test not pass");
            return;
        }
        System.out.println("name test passed");


        var author = "Mordvinov V.A";

        b1.SetAuthor(author);
        b2.SetAuthor(author);
        b3.SetAuthor(author);

        System.out.println("author test");
        if (!(b1.GetAuthor() == b2.GetAuthor() && b2.GetAuthor() == b3.GetAuthor() && b3.GetAuthor() == author)) {
            System.out.println("test not pass");
            return;
        }
        System.out.println("author test passed");


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


        System.out.println("all tests passed\n\n");
    }
}
