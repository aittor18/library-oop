package org.ies.library.components;

import org.ies.library.model.Author;
import org.ies.library.model.Book;

import java.util.Scanner;

public class BookReader {
    private final Scanner scanner;
    private final AutorReader autorReader; // Para enlazar un Reader con otro.

    public BookReader(Scanner scanner, AutorReader autorReader) {
        this.scanner = scanner;
        this.autorReader = autorReader;
    }

    public Book read() {
        System.out.println("Intrdouce los siguientes datos...");

        System.out.println("ISBN: ");
        String ISBN = scanner.nextLine();

        System.out.println("Título: ");
        String Título = scanner.nextLine();

        System.out.println("Año: ");
        int Año = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cuántos autores hay?:");
        int size = scanner.nextInt();
        scanner.nextLine();


        Author[] autors = new Author[size];
        for (int i = 0; i < autors.length; i++) {
            autors[i] = autorReader.read();
        }

        return new Book(
                ISBN,
                Título,
                Año,
                autors

        );
    }
}
