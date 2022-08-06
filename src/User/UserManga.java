package User;

import Interfaces.UserMidia;
import Midia.Manga.Manga;

public class UserManga implements UserMidia {
    private Manga manga;
    private String status;
    private double notaUsuario;
    private int capitulosLidos;

    public UserManga(Manga manga, String status, double notaUsuario, int capitulosLidos) {
        this.manga = manga;
        this.status = status;
        this.notaUsuario = notaUsuario;
        this.capitulosLidos = capitulosLidos;
    }

    public Manga getManga() {
        return manga;
    }

    public void setManga(Manga manga) {
        this.manga = manga;
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

    public int getCapitulosLidos() {
        return capitulosLidos;
    }

    public void setCapitulosLidos(int capitulosLidos) {
        this.capitulosLidos = capitulosLidos;
    }
}
