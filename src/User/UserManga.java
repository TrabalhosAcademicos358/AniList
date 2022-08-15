package User;

import Enums.Status;
import Interfaces.UserMidia;
import Midia.Manga.Manga;

public class UserManga extends User.UserMidia implements UserMidia {
    private Manga manga;

    public UserManga(Status status, double notaUsuario, int progesso, Manga manga) {
        super(status, notaUsuario, progesso);
        this.manga = manga;
        this.setProgesso(progesso); // Atualiza o proguesso com as regras definidas aqui
    }

    @Override
    public void setStatus(Status status) {
        if (status == Status.ASSISTINDO) {
            super.setStatus(Status.LENDO);
        } else if (status == Status.PLANEJA_ASSISTIR) {
            super.setStatus(Status.PLANEJA_LER);
        } else if (status == Status.COMPLETO) {
            super.setStatus(Status.COMPLETO);
            int quantCapitulos = this.manga.getQuantCapitulos();
            setProgesso(quantCapitulos);
        } else {
            super.setStatus(status);
        }
    }

    @Override
    public void setProgesso(int capitulosLidos) {
        if (super.getStatus() == Status.COMPLETO) {
            int quantCapitulos = this.manga.getQuantCapitulos();
            super.setProgesso(quantCapitulos);
        } else {
            super.setProgesso(capitulosLidos);
        }
    }

    public Manga getManga() {
        return manga;
    }

    public void setManga(Manga manga) {
        this.manga = manga;
    }
}
