
public class Book {

    private int NumberOfPages;

    private String Author;

    private String Name;

    public Book(String author, String name, int numberOfPages) {

       Author = author;

       Name = name;

       NumberOfPages = numberOfPages;
    }

    public Book(String author, String name) {

       Author = author;

       Name = name;
    }


    public Book( String name) {

        Author = "undefined";

        Name = name;

        NumberOfPages = 0;
    }

    public Book() {

        Author = "undefined";

        Name = "undefined";

        NumberOfPages = 0;
    }

    public String GetAuthor() {
        return Author;
    }

    public void SetAuthor(String author){
        Author = author;
    }

    public int GetNumberOfPages() {
        return NumberOfPages;
    }

    public void SetNumberOfPages(final int numberOfPages){
        NumberOfPages = numberOfPages;
    }

    public String GetName() {
        return Name;
    }

    public void SetName(String name) {
        Name = name;
    }

    public String toString() {
        return Author + ":  " + Name + " number of pages: " + NumberOfPages;
    }

}
