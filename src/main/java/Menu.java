import java.io.PrintStream;

public class Menu {


    private PrintStream printStream;
    private Biblioteca biblioteca;

    public Menu(PrintStream printStream, Biblioteca biblioteca) {

        this.printStream = printStream;
        this.biblioteca = biblioteca;
    }

    public void start() {
        printStream.println("Welcome!");
        displayOptions();
    }

    private void displayOptions() {
        printStream.println("Select option by number:");
        printStream.println("List Books (1)");
    }
}
