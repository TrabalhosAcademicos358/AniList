package User;

public class UserAccount {
    private String nome;
    private String mensagem;
    private UserAnime[] listaDeAnimes;
    private UserManga[] listaDeMangas;

    public UserAccount(String nome, String mensagem, UserAnime[] listaDeAnimes, UserManga[] listaDeMangas) {
        this.nome = nome;
        this.mensagem = mensagem;
        this.listaDeAnimes = listaDeAnimes;
        this.listaDeMangas = listaDeMangas;
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

    public UserAnime[] getListaDeAnimes() {
        return listaDeAnimes;
    }

    public void setListaDeAnimes(UserAnime[] listaDeAnimes) {
        this.listaDeAnimes = listaDeAnimes;
    }

    public UserManga[] getListaDeMangas() {
        return listaDeMangas;
    }

    public void setListaDeMangas(UserManga[] listaDeMangas) {
        this.listaDeMangas = listaDeMangas;
    }

    public int quantAnimes() {
        return listaDeAnimes.length;
    }

    public int quantMangas() {
        return listaDeMangas.length;
    }
}
