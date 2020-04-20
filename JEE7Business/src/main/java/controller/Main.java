package controller;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import services.BookService;

public class Main {

    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        BookService bookService = container.instance().select(BookService.class).get();
        bookService.kiir();
    }
}
