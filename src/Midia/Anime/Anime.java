package Midia.Anime;

import Midia.Midia;
public class Anime extends Midia implements Interfaces.Midia {
    private SeasonAnime[] listaDeTemportadas;

    public Anime(String titulo, String[] generos, String autor, SeasonAnime[] listaDeTemportadas) {
        super(titulo, generos, autor);
        this.listaDeTemportadas = listaDeTemportadas;
    }

    public SeasonAnime[] getListaDeTemportadas() {
        return listaDeTemportadas;
    }

    protected int getQuantEpisodios() {
        int res = 0;

        for (SeasonAnime season : listaDeTemportadas) {
            res += season.getQuantEpisodios();
        }

        return res;
    }

    @Override
    public double getNota() {
        int res = 0;

        for (SeasonAnime season : listaDeTemportadas) {
            res += season.getNota();
        }

        return res/listaDeTemportadas.length;
    }
}