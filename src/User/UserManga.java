package User;

import Enums.Status;
import Interfaces.UserMidia;
import Midia.Manga.Manga;

public class UserManga implements UserMidia {
    private Manga manga;
    private Status status;
    private double notaUsuario;
    private int capitulosLidos;

    public UserManga(Manga manga, Status status, double notaUsuario, int capitulosLidos) {
        this.manga = manga;
        setStatus(status);
        this.notaUsuario = notaUsuario;
        setCapitulosLidos(capitulosLidos);
    }

    public Manga getManga() {
        return manga;
    }

    public void setManga(Manga manga) {
        this.manga = manga;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public void setStatus(Status status) {
        if (status == Status.ASSISTINDO) {
            this.status = Status.LENDO;
        } else if (status == Status.COMPLETO) {
            this.status = Status.COMPLETO;
            int quantCapitulos = this.manga.getQuantCapitulos();
            setCapitulosLidos(quantCapitulos);
        } else {
            this.status = status;
        }
    }

    public double getNotaUsuario() {
        return notaUsuario;
    }

    @Override
    public void setNotaUsuario(double notaUsuario) {
        this.notaUsuario = notaUsuario;
    }

    public int getCapitulosLidos() {
        return capitulosLidos;
    }

    public void setCapitulosLidos(int capitulosLidos) {
        if (this.status == Status.COMPLETO) {
            int quantCapitulos = this.manga.getQuantCapitulos();
            this.capitulosLidos = quantCapitulos;
        } else {
            this.capitulosLidos = capitulosLidos;
        }
    }
}
