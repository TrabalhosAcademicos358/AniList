package User;

import Interfaces.UserMidia;
import Midia.Anime.Anime;
import Enums.Status;

public class UserAnime extends User.UserMidia implements UserMidia {
    private Anime anime;

    public UserAnime(Status status, double notaUsuario, int progesso, Anime anime) {
        super(status, notaUsuario, progesso);
        this.anime = anime;
        this.setProgesso(progesso);
    }

    @Override
    public void setStatus(Status status) {
        if (status == Status.LENDO) {
            super.setStatus(Status.ASSISTINDO);
        } else if (status == Status.PLANEJA_LER) {
            super.setStatus(Status.PLANEJA_ASSISTIR);
        } else if (status == Status.COMPLETO) {
            super.setStatus(Status.COMPLETO);
            int quantEpisodios = this.anime.getQuantEpisodios();
            setProgesso(quantEpisodios);
        } else {
            super.setStatus(status);
        }
    }

    @Override
    public void setProgesso(int episodiosAssistidos) {
        if (super.getStatus() == Status.COMPLETO) {
            int quantEpisodios = this.anime.getQuantEpisodios();
            super.setProgesso(quantEpisodios);
        } else {
            super.setProgesso(episodiosAssistidos);
        }
    }

    public Anime getAnime() {
        return anime;
    }

    public void setAnime(Anime anime) {
        this.anime = anime;
    }
}
