package org.ies.library.model;

import java.util.Objects;

public class Author {
    private String NIF;
    private String Nombre;
    private String Apellidos;

    public Author(String NIF, String nombre, String apellidos) {
        this.NIF = NIF;
        Nombre = nombre;
        Apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author autor = (Author) o;
        return Objects.equals(NIF, autor.NIF) && Objects.equals(Nombre, autor.Nombre) && Objects.equals(Apellidos, autor.Apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NIF, Nombre, Apellidos);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "NIF='" + NIF + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                '}';
    }
}
