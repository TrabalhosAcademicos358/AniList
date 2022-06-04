public class Main {
    public static void main(String[] args) {
        String generosDragonBall[] = {"Ação", "Comedia", "Fantasia"};
        String generos86[] = {"Ação", "Drama", "Sci-Fi"};
        String primavera = "Primavera";

        // Variaveis com dados do anime 86 somado a operações aritméticas

        int episodiosTemp01EigthySix = 11;
        int episodiosTemp02EigthySix = 12;
        int episodiosEigthSix = episodiosTemp01EigthySix + episodiosTemp02EigthySix;

        double notaTemp01EigthSix = 8.24;
        double notaTemp02EigthSix = 8.72;
        double notaEigthySix = (notaTemp01EigthSix + notaTemp02EigthSix)/2;

        // Concatenação de Strings

        String mensagemUsuario = "Eu gosto dos animes da temporada de " + primavera;

        // Criando Objetos do tipo Anime e UserAnime

        Anime anime01 = new Anime("Dragon Ball Z", 1989, 8.15, "Toei Animatio", 291, generosDragonBall, "Manga", primavera);
        Anime anime02 = new Anime("86 Eighty Six", 2021, notaEigthySix, "A1 Pictures", episodiosEigthSix, generos86, "Ligth Novel", primavera);

        UserAnime userAnime01 = new UserAnime(anime01, "Assistindo", 8.15, 194);
        UserAnime userAnime02 = new UserAnime(anime02, "Complete", 9, 23);

        // Array com os animes do Usuário

        UserAnime listaAnimes[] = {userAnime01, userAnime02};

        // Criando Objeto do tipo UserAccount, a conta do usuario

        UserAccount usuario = new UserAccount("Lucas", mensagemUsuario, listaAnimes);

        // Acessando atributos do objeto anime

        System.out.println("Nota média dada pelo publico ao anime " +  anime02.nome + ": " + anime02.nota);
        System.out.println("Quantidade de episodios do anime " +  anime02.nome + ": " + anime02.quantEpisodios);

        System.out.println("-----------------------------------------------------------------------------");

        // Estruturas Condicionais, uso do Switch

        imprimirTemporadaDoAnime(anime01);
        imprimirTemporadaDoAnime(anime02);

        System.out.println("-----------------------------------------------------------------------------");

        // Operações Logicas, guardando o resultado em uma variavel

        boolean dragonBallZTemNotaMaiorQue07 = anime01.nota > 07;
        boolean usuarioDeuAMesmaNotaDoPublicoParaDragonBall = anime01.nota == userAnime01.notaUsuario;

        // Estruturas Condicionais, uso do If e Else

        if (dragonBallZTemNotaMaiorQue07) {
            System.out.println("A nota media dada pelo pelo publico ao anime Dragon Ball é maior que 7");
        } else {
            System.out.println("O público não deu uma nota media maior que 7 ao anime Dragon Ball");
        }

        if (usuarioDeuAMesmaNotaDoPublicoParaDragonBall) {
            System.out.println("Curiosamente o usuário deu a mesma nota que o publico ao anime Dragon Ball");
        } else {
            System.out.println("De forma normal o usuário não deu a mesma nota que o público");
        }

        System.out.println("-----------------------------------------------------------------------------");

        // Acessando atributos dos objetos

        System.out.println("Nome do Usuario: " + usuario.nome);
        System.out.println("Animes que o usuario já assistiu " + usuario.listaDeAnimes.length + " animes");
        System.out.println("Mensagem de perfil do Usuario: ");
        System.out.println(usuario.mensagem);
    }

    static void imprimirTemporadaDoAnime(Anime anime) {
        switch (anime.temporada) {
            case "Primavera":
                System.out.println("O anime " + anime.nome + " foi lançando na temporada de primavera");
                break;
            case "Verão":
                System.out.println("O anime " + anime.nome + " foi lançando na temporada de Verão");
                break;
            case "Outono":
                System.out.println("O anime " + anime.nome + " foi lançando na temporada de Outono");
                break;
            case "Inverno":
                System.out.println("O anime " + anime.nome + " foi lançando na temporada de Inverno");
                break;
        }
    }
}
