public class UserAccount {
    String nome;
    String mensagem;
    UserAnime[] listaDeAnimes;

    public UserAccount(String nome, String mensagem, UserAnime[] listaDeAnimes) {
        this.nome = nome;
        this.mensagem = mensagem;
        this.listaDeAnimes = listaDeAnimes;
    }
}
