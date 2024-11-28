package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private String name;
    private Book[] books;

    public Library(String nombre, Book[] libros) {
        name = nombre;
        this.books = libros;
    }

    public boolean hasBook(String ISBN) {
        for (var book : books) {
            if (book.getIsbn().equals(ISBN)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAutor(String NIF){
        for (var book : books) {
            if (book.hasAutor(NIF)) {
                return true;
            }
        }
        return false;
    }

    //countBooks(autorNIF)
    public int countBooks(String autorNIF){
        int count = 0;
        for (Book libro : books) {
            if (libro.hasAutor(autorNIF)) {
                count++;
            }
        }
        return count;
    }

    //countYearBooks(year): dado un año, devuelve el número de libros de ese año.
    public int countYearBooks(int year){
        int count = 0;
        for (Book libro : books) {
            if (libro.getYear()==year) {
                count++;
            }
        }
        return count;
    }

    public Book findBook(String isbn) {
        for (Book libro : books) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Objects.deepEquals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Arrays.hashCode(books));
    }

    @Override
    public String toString() {
        return "Library{" +
                "Nombre='" + name + '\'' +
                ", libros=" + Arrays.toString(books) +
                '}';
    }
}
