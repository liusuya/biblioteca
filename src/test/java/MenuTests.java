import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PRIVATE_MEMBER;

import java.io.PrintStream;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.verify;

public class MenuTests {

    private PrintStream printStream;
    private Biblioteca biblioteca;
    private Menu menu;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        biblioteca = mock(Biblioteca.class);
        menu = new Menu(printStream, biblioteca);
    }

    @Test
    public void shouldPrintWelcomeWhenStart() {
        menu.start();
        verify(printStream).println("Welcome!");
    }

    @Test
    public void shouldDisplayOptionsWhenMenuStarts() throws Exception {
        menu.start();
        verify(printStream).println(contains("option"));

    }

    @Test
    public void shouldListOptionsWHenMenuStarts() throws Exception {
        menu.start();
        verify(printStream).println(contains("List Books"));
    }

}
