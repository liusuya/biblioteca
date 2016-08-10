import java.io.PrintStream;

public class Book {

    private String title;
    private final String author;
    private final String yearPublished;
    private PrintStream printStream;

    public Book(String title, String author, String yearPublished, PrintStream printStream) {

        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.printStream = printStream;
    }

    private String formatBookInfo(){
        return  title + " | " + author + " | " + yearPublished;
    }

    public void display() {
        printStream.println(formatBookInfo());
    }
}
