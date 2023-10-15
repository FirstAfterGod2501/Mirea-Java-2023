package Task3.Task2Tests.src;

import Task3.src.Author;

public class AuthorTest {
    public AuthorTest() {
        System.out.println("Author test");

        Author a1 = new Author("Gleb", "gleb@author.com", 'm');
        Author a2 = new Author("Anastasia", "nastya@author.com", 'w');

        System.out.println("author name test");
        if(!(a1.GetName() == "Gleb" && a2.GetName() == "Anastasia")){
            System.out.println("test not passed");
        }
        System.out.println("test passed");

        System.out.println("author email test");

        var email = "authors@author.com";

        a1.SetEmail(email);
        a2.SetEmail(email);

        if(!(a1.GetEmail() == a2.GetEmail() && a2.GetEmail() == email)){
            System.out.println("test not passed");
        }
        System.out.println("test passed");

        System.out.println("author gender test");

        if(!(a1.getGender() == 'm' && a2.getGender() == 'w')){
            System.out.println("test not passed");
        }
        System.out.println("test passed");

        System.out.println(a1);
        System.out.println(a2);

    }
}
