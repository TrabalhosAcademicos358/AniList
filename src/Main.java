import Enums.Status;
import Midia.Anime.Anime;
import Midia.Anime.SeasonAnime;
import Midia.Manga.Manga;
import User.UserAccount;
import User.UserAnime;
import User.UserManga;

import static Enums.Temporada.OUTONO;
import static Enums.Temporada.PRIMAVERA;
import static Enums.Fonte.*;

public class Main {
    public static void main(String[] args) {
        String generosDragonBall[] = {"Ação", "Comedia", "Fantasia"};
        String generos86[] = {"Ação", "Drama", "Sci-Fi"};

        // Temporadas dos animes adicionados

        SeasonAnime parte01EigthySix = new SeasonAnime("A1 Pictures", 8.25, 12, LIGTH_NOVEL, 2021, PRIMAVERA);
        SeasonAnime parte02EigthySix = new SeasonAnime("A1 Pictures", 8.72, 11, LIGTH_NOVEL, 2021, OUTONO);

        SeasonAnime listTempEigthySix[] = {parte01EigthySix, parte02EigthySix};

        SeasonAnime temporadaDragonBall = new SeasonAnime("Pierrot", 8.15, 291, MANGA, 1989, PRIMAVERA);

        // Criando Objetos do tipo Anime e UserAnime

        Anime anime01 = new Anime("Dragon Ball Z", generosDragonBall, "Akira Toriyama", new SeasonAnime[]{temporadaDragonBall});
        Anime anime02 = new Anime("86 Eighty Six", generos86, "Asato Asato (Toru Asakura)", listTempEigthySix);

        UserAnime userAnime01 = new UserAnime(anime01, Status.ASSISTINDO, 8.15, 194);
        UserAnime userAnime02 = new UserAnime(anime02, Status.COMPLETO, 9, 23);

        // Mangas do usuario

        String[] fullMetallGeneros = {"Ação", "Aventura", "Drama", "Fantasia"};

        Manga manga01 = new Manga("Full Metall Alchemist", fullMetallGeneros, "Hiromu Arakawa", "Shounen Gangan", 9.05, 2001, 116, 27, "Shounen");

        UserManga userManga01 = new UserManga(manga01, Status.COMPLETO, 10, 116);

        // Listas com Animes e Mangas do Usuário

        UserAnime listaAnimes[] = {userAnime01, userAnime02};
        UserManga listaMangas[] = {userManga01};

        // Criando Objeto do tipo User.UserAccount, a conta do usuario

        String mensagemUsuario = "Imagine aqui uma mensagem legal e marcante";

        UserAccount usuario = new UserAccount("Lucas", mensagemUsuario, listaAnimes, listaMangas);

        System.out.println("Usuario " + usuario + " criado com sucesso");
        System.out.println("O usuario referido já assistiu " + usuario.quantAnimes() + " anime(s) e leu " + usuario.quantMangas() + " manga(s)");
        System.out.println("Dando nota " + userAnime01.getNotaUsuario() + " ao anime " + userAnime01.getAnime());

        System.out.println("-----------------------------------------------------------------------------");

        userAnime01.setStatus(Status.COMPLETO);

        System.out.println("O Usuario " + usuario + " acabou de terminar de assistir o anime " + userAnime01.getAnime());
        System.out.println("Sendo assim ele tem " + userAnime01.getEpisodiosAssistidos() + " episodios marcados como assistidos");

        System.out.println("-----------------------------------------------------------------------------");

        usuario.imprimirMensagem();
    }
}