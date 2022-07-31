package Midia.Anime;

public class SeasonAnime {
    private String estudio;
    private double nota;
    private int quantEpisodios;
    private String fonte;
    private int anoLançamento;
    private String temporada;

    public SeasonAnime(String estudio, double nota, int quantEpisodios, String fonte, int anoLançamento, String temporada) {
        this.estudio = estudio;
        this.nota = nota;
        this.quantEpisodios = quantEpisodios;
        this.fonte = fonte;
        this.anoLançamento = anoLançamento;
        this.temporada = temporada;
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

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public int getAnoLançamento() {
        return anoLançamento;
    }

    public void setAnoLançamento(int anoLançamento) {
        this.anoLançamento = anoLançamento;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
}
