package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String ISBN;
    private String Título;
    private int Año;
    private Autor[] Autor;

    public Book(String ISBN, String título, int año, org.ies.library.model.Autor[] autor) {
        this.ISBN = ISBN;
        Título = título;
        Año = año;
        Autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String título) {
        Título = título;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        Año = año;
    }

    public org.ies.library.model.Autor[] getAutor() {
        return Autor;
    }

    public void setAutor(org.ies.library.model.Autor[] autor) {
        Autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Año == book.Año && Objects.equals(ISBN, book.ISBN) && Objects.equals(Título, book.Título) && Objects.deepEquals(Autor, book.Autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, Título, Año, Arrays.hashCode(Autor));
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", Título='" + Título + '\'' +
                ", Año=" + Año +
                ", Autor=" + Arrays.toString(Autor) +
                '}';
    }
}
