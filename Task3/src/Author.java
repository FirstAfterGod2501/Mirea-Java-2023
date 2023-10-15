package Task3.src;

public class Author {
    private String Name;

    private String Email;

    private char Gender;

    public Author(String name, String email, char gender) {
        Name = name;
        Email = email;
        Gender = gender;
    }

    public String GetName() {
        return Name;
    }

    public String GetEmail() {
        return Email;
    }

    public void SetEmail(String email) {
        Email = email;
    }

    public char getGender() {
        return Gender;
    }

    public String toString() {
        return "Name: " + Name + "\nEmail: " + Email + "\nGender: " + Gender;
    }
}
