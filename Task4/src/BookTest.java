package Task4.src;

public class BookTest {
    public void Test(){
        Book book = new Book("John Doe", "The Book", 2020);
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year: " + book.getYear());

        book.setAuthor("Jane Doe");
        book.setTitle("Another Book");
        book.setYear(2021);
        System.out.println("Updated Author: " + book.getAuthor());
        System.out.println("Updated Title: " + book.getTitle());
        System.out.println("Updated Year: " + book.getYear());
    }
}
