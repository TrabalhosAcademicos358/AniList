package User;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class UserAccount {
    private String nome;
    private String mensagem;
    private List<UserAnime> listaDeAnimes = new ArrayList<>();
    private List<UserManga> listaDeMangas = new ArrayList<>();

    public UserAccount(String nome, String mensagem, UserAnime[] listaDeAnimes, UserManga[] listaDeMangas) {
        this.nome = nome;
        this.mensagem = mensagem;
        this.listaDeAnimes = asList(listaDeAnimes);
        this.listaDeMangas = asList(listaDeMangas);
    }

    public int quantAnimes() {
        return listaDeAnimes.size();
    }

    public void addUserAnime(UserAnime anime) {
        listaDeAnimes.add(anime);
    }

    public int quantMangas() {
        return listaDeMangas.size();
    }

    public void addUserManga(UserManga manga) {
        listaDeMangas.add(manga);
    }

    public void imprimirMensagem() {
        System.out.println("Mensagem do usuario " + this.nome + ":\n    " + this.mensagem);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public List<UserAnime> getListaDeAnimes() {
        return listaDeAnimes;
    }

    public void setListaDeAnimes(List<UserAnime> listaDeAnimes) {
        this.listaDeAnimes = listaDeAnimes;
    }

    public List<UserManga> getListaDeMangas() {
        return listaDeMangas;
    }

    public void setListaDeMangas(List<UserManga> listaDeMangas) {
        this.listaDeMangas = listaDeMangas;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
