package Midia.Manga;

import Midia.Midia;

public class Manga extends Midia {
    private String editora;
    private double nota;
    private int anoLacamento;
    private int quantCapitulos;
    private int quantVolumes;
    private String Demografia;

    public Manga(String titulo, String[] generos, String autor, String editora, double nota, int anoLacamento, int quantCapitulos, int quantVolumes, String demografia) {
        super(titulo, generos, autor);
        this.editora = editora;
        this.nota = nota;
        this.anoLacamento = anoLacamento;
        this.quantCapitulos = quantCapitulos;
        this.quantVolumes = quantVolumes;
        Demografia = demografia;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getAnoLacamento() {
        return anoLacamento;
    }

    public void setAnoLacamento(int anoLacamento) {
        this.anoLacamento = anoLacamento;
    }

    public int getQuantCapitulos() {
        return quantCapitulos;
    }

    public void setQuantCapitulos(int quantCapitulos) {
        this.quantCapitulos = quantCapitulos;
    }

    public int getQuantVolumes() {
        return quantVolumes;
    }

    public void setQuantVolumes(int quantVolumes) {
        this.quantVolumes = quantVolumes;
    }

    public String getDemografia() {
        return Demografia;
    }

    public void setDemografia(String demografia) {
        Demografia = demografia;
    }
}
