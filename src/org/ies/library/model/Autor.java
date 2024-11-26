package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Autor {
    private int NIF;
    private String Nombre;
    private String Apellidos;

    public Autor(int NIF, String nombre, String apellidos) {
        this.NIF = NIF;
        Nombre = nombre;
        Apellidos = apellidos;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return NIF == autor.NIF && Objects.equals(Nombre, autor.Nombre) && Objects.equals(Apellidos, autor.Apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NIF, Nombre, Apellidos);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "NIF=" + NIF +
                ", Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                '}';
    }
}
