package User;

import Midia.Manga.Manga;

public class UserManga {
    private Manga manga;
    private String statusManga;
    private double notaUsuario;
    private int capitulosLidos;

    public UserManga(Manga manga, String statusManga, double notaUsuario, int capitulosLidos) {
        this.manga = manga;
        this.statusManga = statusManga;
        this.notaUsuario = notaUsuario;
        this.capitulosLidos = capitulosLidos;
    }

    public Manga getManga() {
        return manga;
    }

    public void setManga(Manga manga) {
        this.manga = manga;
    }

    public String getStatusManga() {
        return statusManga;
    }

    public void setStatusManga(String statusManga) {
        this.statusManga = statusManga;
    }

    public double getNotaUsuario() {
        return notaUsuario;
    }

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
