package constructors_and_java_keywords.class_problems;

public class LibraryBook {

    String title;
    String isbn;

    public LibraryBook(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public LibraryBook(String title) {
        this(title, "PENDING");
    }

    public void printDetails() {
        System.out.println(title + " " + isbn);
    }

    public static void main(String[] args) {

        LibraryBook[] books = {
                new LibraryBook("Clean Code", "9780132350884"),
                new LibraryBook("Untitled Draft"),
                new LibraryBook("1984", "9780451524935"),
                new LibraryBook("Notes")
        };

        for (LibraryBook book : books) {
            book.printDetails();
        }
    }
}