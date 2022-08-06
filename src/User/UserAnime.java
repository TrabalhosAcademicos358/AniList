package User;

import Interfaces.UserMidia;
import Midia.Anime.Anime;

public class UserAnime implements UserMidia {
    private Anime anime;
    private String status;
    private double notaUsuario;
    private int episodiosAssistidos;

    public UserAnime(Anime anime, String status, double notaUsuario, int episodiosAssistidos) {
        this.anime = anime;
        this.status = status;
        this.notaUsuario = notaUsuario;
        this.episodiosAssistidos = episodiosAssistidos;
    }

    public Anime getAnime() {
        return anime;
    }

    public void setAnime(Anime anime) {
        this.anime = anime;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public double getNotaUsuario() {
        return notaUsuario;
    }

    @Override
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
