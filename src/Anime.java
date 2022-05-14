public class Anime {
    String nome;
    int anoLacamento;
    double nota;
    String estudio;
    int quantEpisodios;
    String[] genero;
    String fonte;
    String temporada;

    public Anime(String nome, int anoLacamento, double nota, String estudio, int quantEpisodios, String[] genero, String fonte, String temporada) {
        this.nome = nome;
        this.anoLacamento = anoLacamento;
        this.nota = nota;
        this.estudio = estudio;
        this.quantEpisodios = quantEpisodios;
        this.genero = genero;
        this.fonte = fonte;
        this.temporada = temporada;
    }
}
