package org.ies.library.components;

import org.ies.library.model.Book;
import org.ies.library.model.Library;

import java.util.Scanner;

public class LibraryReader {
    private final Scanner scanner;
    private final BookReader bookReader;

    public LibraryReader(Scanner scanner, BookReader bookReader) {
        this.scanner = scanner;
        this.bookReader = bookReader;
    }

    public Library read() {
        System.out.println("Introduce los siguientes datos:");
        System.out.println("Nombre del libro: ");
        String autor = scanner.nextLine();

        System.out.println("Autores: ");
        String Autores = scanner.nextLine();

        System.out.println("Cuántos libros hay en la biblioteca?: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        
        Book[] books = new Book[size];
        for (int i = 0; i < books.length; i++) {
            books[i] = bookReader.read();
        }

        return new Library(autor, )
    }
}
