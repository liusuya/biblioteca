import java.io.PrintStream;
import java.util.Collection;
import java.util.List;

public class Biblioteca {
    PrintStream printStream;
    Collection<Book> bookList;

    public Biblioteca (PrintStream printStream, Collection<Book> bookList) {
        this.printStream = printStream;
        this.bookList = bookList;
    }

    public void listBooks() {

        for (Book book: bookList) book.display();

    }
}
