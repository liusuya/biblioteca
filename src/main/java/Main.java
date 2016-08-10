import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PrintStream printStream = new PrintStream(System.out);
        List<Book> bookList = new ArrayList<>();
        Biblioteca biblioteca = new Biblioteca(printStream, bookList);
        Menu menu = new Menu(printStream, biblioteca);
        menu.start();
    }
}
