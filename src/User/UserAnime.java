package User;

import Interfaces.UserMidia;
import Midia.Anime.Anime;
import Enums.Status;

public class UserAnime implements UserMidia {
    private Anime anime;
    private Status status;
    private double notaUsuario;
    private int episodiosAssistidos;

    public UserAnime(Anime anime, Status status, double notaUsuario, int episodiosAssistidos) {
        this.anime = anime;
        setStatus(status);
        this.notaUsuario = notaUsuario;
        setEpisodiosAssistidos(episodiosAssistidos);
    }

    public Anime getAnime() {
        return anime;
    }

    public void setAnime(Anime anime) {
        this.anime = anime;
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public void setStatus(Status status) {
        if (status == Status.LENDO) {
            this.status = Status.ASSISTINDO;
        } else if (status == Status.PLANEJA_LER) {
            this.status = Status.PLANEJA_ASSISTIR;
        } else if (status == Status.COMPLETO) {
            this.status = Status.COMPLETO;
            int quantEpisodios = this.anime.getQuantEpisodios();
            setEpisodiosAssistidos(quantEpisodios);
        } else {
            this.status = status;
        }
    }

    @Override
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
        if (this.status == Status.COMPLETO) {
            int quantEpisodios = this.anime.getQuantEpisodios();
            this.episodiosAssistidos = quantEpisodios;
        } else {
            this.episodiosAssistidos = episodiosAssistidos;
        }
    }
}
