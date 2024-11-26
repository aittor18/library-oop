package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Library {
    private String Nombre;
    private Book[] libros;

    public Library(String nombre, Book[] libros) {
        Nombre = nombre;
        this.libros = libros;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Book[] getLibros() {
        return libros;
    }

    public void setLibros(Book[] libros) {
        this.libros = libros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(Nombre, library.Nombre) && Objects.deepEquals(libros, library.libros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Arrays.hashCode(libros));
    }

    @Override
    public String toString() {
        return "Library{" +
                "Nombre='" + Nombre + '\'' +
                ", libros=" + Arrays.toString(libros) +
                '}';
    }
}
