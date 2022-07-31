package User;

import Midia.Anime.Anime;

public class UserAnime {
    private Anime anime;
    private String statusAnime;
    private double notaUsuario;
    private int episodiosAssistidos;

    public UserAnime(Anime anime, String statusAnime, double notaUsuario, int episodiosAssistidos) {
        this.anime = anime;
        this.statusAnime = statusAnime;
        this.notaUsuario = notaUsuario;
        this.episodiosAssistidos = episodiosAssistidos;
    }

    public Anime getAnime() {
        return anime;
    }

    public void setAnime(Anime anime) {
        this.anime = anime;
    }

    public String getStatusAnime() {
        return statusAnime;
    }

    public void setStatusAnime(String statusAnime) {
        this.statusAnime = statusAnime;
    }

    public double getNotaUsuario() {
        return notaUsuario;
    }

    public void setNotaUsuario(double notaUsuario) {
        this.notaUsuario = notaUsuario;
    }

    public int getEpisodiosAssistidos() {
        return episodiosAssistidos;
    }

    public void setEpisodiosAssistidos(int episodiosAssistidos) {
        this.episodiosAssistidos = episodiosAssistidos;
    }
}
