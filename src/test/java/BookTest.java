import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookTest {

    private PrintStream printStream;
    private Book book;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
    }

    @Test
    public void shouldPrintTitleWhenPrinting() throws Exception {
        book = new Book("title", null, null, printStream);
        book.display();
        verify(printStream).println(contains("title"));
    }

    @Test
    public void shouldPrintAuthorAndYearPubWhenPrinting() throws Exception {
        book = new Book("title", "author", "year", printStream);
        book.display();
        verify(printStream).println("title | author | year");

    }
}