package Midia.Anime;

import Midia.Midia;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Anime extends Midia implements Interfaces.Midia {
    private List<SeasonAnime> listaDeTemportadas = new ArrayList<>();

    public Anime(String titulo, String[] generos, String autor, SeasonAnime[] listaDeTemportadas) {
        super(titulo, generos, autor);
        this.listaDeTemportadas = asList(listaDeTemportadas);
    }

    public List<SeasonAnime> getListaDeTemportadas() {
        return listaDeTemportadas;
    }

    public void setListaDeTemportadas(List<SeasonAnime> listaDeTemportadas) {
        this.listaDeTemportadas = listaDeTemportadas;
    }

    public void addTemporada(SeasonAnime temporada) {
        listaDeTemportadas.add(temporada);
    }

    public void imprimirLancamentos() {
        int cont = 0;
        while (cont < listaDeTemportadas.size()) {
            SeasonAnime temporada = listaDeTemportadas.get(cont);
            cont++;
            System.out.println("A " + cont + "º temporada do anime foi lancada na temporada de " + temporada.stringTemporada() + " do ano de " + temporada.getAnoLançamento());
        }
    }

    public int getQuantEpisodios() {
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

        return res/listaDeTemportadas.size();
    }
}