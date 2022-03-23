package Interfaz;

import java.io.Serializable;

public class Libro implements Serializable {

    private int codigoDeLibro;
    private String nobreDelLibro;
    private String decripcionDelLibro;
    private String autor;

    public Libro(int codigoDeLibro, String nobreDelLibro, String decripcionDelLibro, String autor) {
        this.codigoDeLibro = codigoDeLibro;
        this.nobreDelLibro = nobreDelLibro;
        this.decripcionDelLibro = decripcionDelLibro;
        this.autor = autor;
    }

    public int getCodigoDeLibro() {
        return codigoDeLibro;
    }

    public void setCodigoDeLibro(int codigoDeLibro) {
        this.codigoDeLibro = codigoDeLibro;
    }

    public String getNobreDelLibro() {
        return nobreDelLibro;
    }

    public void setNobreDelLibro(String nobreDelLibro) {
        this.nobreDelLibro = nobreDelLibro;
    }

    public String getDecripcionDelLibro() {
        return decripcionDelLibro;
    }

    public void setDecripcionDelLibro(String decripcionDelLibro) {
        this.decripcionDelLibro = decripcionDelLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}