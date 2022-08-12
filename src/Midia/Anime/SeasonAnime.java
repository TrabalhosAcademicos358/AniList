package Midia.Anime;
import Enums.*;

public class SeasonAnime {
    private String estudio;
    private double nota;
    private int quantEpisodios;
    private Fonte fonte;
    private int anoLançamento;
    private Temporada temporada;

    public SeasonAnime(String estudio, double nota, int quantEpisodios, Fonte fonte, int anoLançamento, Temporada temporada) {
        this.estudio = estudio;
        this.nota = nota;
        this.quantEpisodios = quantEpisodios;
        this.fonte = fonte;
        this.anoLançamento = anoLançamento;
        this.temporada = temporada;
    }

    public String stringTemporada() {
        switch (this.temporada) {
            case PRIMAVERA: return "Primavera/Abril";
            case OUTONO: return "Outono/Outubro";
            case INVERNO: return "Inverno/Janeiro";
            case VERAO: return "Verão/Julho";
        }
        return null;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getQuantEpisodios() {
        return quantEpisodios;
    }

    public void setQuantEpisodios(int quantEpisodios) {
        this.quantEpisodios = quantEpisodios;
    }

    public Fonte getFonte() {
        return fonte;
    }

    public void setFonte(Fonte fonte) {
        this.fonte = fonte;
    }

    public int getAnoLançamento() {
        return anoLançamento;
    }

    public void setAnoLançamento(int anoLançamento) {
        this.anoLançamento = anoLançamento;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }
}
