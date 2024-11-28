package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String isbn;
    private String title;
    private int year;
    private Author[] author;

    public Book(String ISBN, String título, int año, Author[] autor) {
        this.isbn = ISBN;
        title = título;
        year = año;
        author = autor;
    }

    public boolean hasAutor(String NIF) {
        for (Author autor : author){
            if (autor.getNIF().equals(NIF)){
                return true;
            }
        }
        return false;
    }

    // hasBook(isbn)
    // public boolean has;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title) && Objects.deepEquals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, year, Arrays.hashCode(author));
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + isbn + '\'' +
                ", Título='" + title + '\'' +
                ", Año=" + year +
                ", Autor=" + Arrays.toString(author) +
                '}';
    }
}
