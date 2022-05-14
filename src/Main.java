public class Main {
    public static void main(String[] args) {
        String generosDragonBall[] = {"Ação", "Comedia", "Fantasia"};
        String generos86[] = {"Ação", "Drama", "Sci-Fi"};
        String primavera = "Primavera";

        int episodiosTemp01EigthySix = 11;
        int episodiosTemp02EigthySix = 12;
        int episodiosEigthSix = episodiosTemp01EigthySix + episodiosTemp02EigthySix;

        double notaTemp01EigthSix = 8.24;
        double notaTemp02EigthSix = 8.72;
        double notaEigthySix = (notaTemp01EigthSix + notaTemp02EigthSix)/2;

        String mensagemUsuario = "Eu gosto dos animes da temporada de " + primavera;

        Anime anime01 = new Anime("Dragon Ball Z", 1989, 8.15, "Toei Animatio", 291, generosDragonBall, "Manga", primavera);
        Anime anime02 = new Anime("86 Eighty Six", 2021, notaEigthySix, "A1 Pictures", episodiosEigthSix, generos86, "Ligth Novel", primavera);

        UserAnime userAnime01 = new UserAnime(anime01, "Assistindo", 8.15, 194);
        UserAnime userAnime02 = new UserAnime(anime02, "Complete", 9, 23);

        UserAnime listaAnimes[] = {userAnime01, userAnime02};

        UserAccount usuario = new UserAccount("Lucas", mensagemUsuario, listaAnimes);

        boolean dragonBallZTemNotaMaiorQue07 = anime01.nota > 07;
        boolean usuarioDeuAMesmaNotaDoPublicoParaDragonBall = anime01.nota == userAnime01.notaUsuario;

        System.out.println("Nota média dada pelo publico ao anime " +  anime02.nome + ": " + anime02.nota);
        System.out.println("Quantidade de episodios do anime " +  anime02.nome + ": " + anime02.quantEpisodios);

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Dragon Ball tem nota maior do que 07: " + dragonBallZTemNotaMaiorQue07);
        System.out.println("O usuario deu a mesma nota que o publico para Dragon Ball Z? " + usuarioDeuAMesmaNotaDoPublicoParaDragonBall);

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Nome do Usuario: " + usuario.nome);
        System.out.println("Animes que o usuario já assistiu " + usuario.listaDeAnimes.length + " animes");
        System.out.println("Mensagem de perfil do Usuario: ");
        System.out.println(usuario.mensagem);
    }
}
