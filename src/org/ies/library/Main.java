package org.ies.library;

import org.ies.library.components.AutorReader;
import org.ies.library.components.BookReader;
import org.ies.library.components.LibraryReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var autorReader = new AutorReader(scanner);
        var bookReader = new BookReader(scanner, autorReader);
        var libraryReader = new LibraryReader(scanner, bookReader);

        var library = libraryReader.read();

        System.out.println(library);
    }
}