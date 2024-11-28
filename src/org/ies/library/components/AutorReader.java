package org.ies.library.components;

import org.ies.library.model.Author;

import java.util.Scanner;

public class AutorReader {
    private final Scanner scanner;

    public AutorReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Author read() {
        System.out.println("Introduce los datos...");
        System.out.println("NIF: ");
        String NIF = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Nombre: ");
        String name = scanner.nextLine();

        System.out.println("Apellidos: ");
        String surname = scanner.nextLine();


        return new Author(
            NIF,
            name,
            surname
        );
    }
}
