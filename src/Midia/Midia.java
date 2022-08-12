package Midia;

public abstract class Midia {
    private String titulo;
    private String[] generos;
    private String autor;

    public Midia(String titulo, String[] generos, String autor) {
        this.titulo = titulo;
        this.generos = generos;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getGeneros() {
        return generos;
    }

    public void setGeneros(String[] generos) {
        this.generos = generos;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return this.titulo;
    }
}
