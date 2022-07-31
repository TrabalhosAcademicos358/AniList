import Midia.Anime.Anime;
import Midia.Anime.SeasonAnime;
import Midia.Manga.Manga;
import User.*;
public class Main {
    public static void main(String[] args) {
        String generosDragonBall[] = {"Ação", "Comedia", "Fantasia"};
        String generos86[] = {"Ação", "Drama", "Sci-Fi"};
        String primavera = "Primavera";

        // Temporadas dos animes adicionados

        SeasonAnime parte01EigthySix = new SeasonAnime("A1 Pictures", 8.25, 12, "Ligth Novel", 2021, primavera);
        SeasonAnime parte02EigthySix = new SeasonAnime("A1 Pictures", 8.72, 11, "Ligth Novel", 2021, "Outono");

        SeasonAnime listTempEigthySix[] = {parte01EigthySix, parte02EigthySix};

        SeasonAnime temporadaDragonBall = new SeasonAnime("Pierrot", 8.15, 291, "Manga", 1989, primavera);

        // Criando Objetos do tipo Anime e UserAnime

        Anime anime01 = new Anime("Dragon Ball Z", generosDragonBall, "Akira Toriyama", new SeasonAnime[]{temporadaDragonBall});
        Anime anime02 = new Anime("86 Eighty Six", generos86, "Asato Asato (Toru Asakura)", listTempEigthySix);

        UserAnime userAnime01 = new UserAnime(anime01, "Assistindo", 8.15, 194);
        UserAnime userAnime02 = new UserAnime(anime02, "Complete", 9, 23);

        // Mangas do usuario

        String[] fullMetallGeneros = {"Ação", "Aventura", "Drama", "Fantasia"};

        Manga manga01 = new Manga("Full Metall Alchemist", fullMetallGeneros, "Hiromu Arakawa", "Shounen Gangan", 9.05, 2001, 116, 27, "Shounen");

        UserManga userManga01 = new UserManga(manga01, "Lido", 10, 116);

        // Listas com Animes e Mangas do Usuário

        UserAnime listaAnimes[] = {userAnime01, userAnime02};
        UserManga listaMangas[] = {userManga01};

        // Criando Objeto do tipo User.UserAccount, a conta do usuario

        String mensagemUsuario = "Eu gosto dos animes da temporada de " + primavera;

        UserAccount usuario = new UserAccount("Lucas", mensagemUsuario, listaAnimes, listaMangas);

        System.out.println("Usuario " + usuario.getNome() + " criado com sucesso");
        System.out.println("O usuario referido já assistiu " + usuario.quantAnimes() + " animes e leu " + usuario.quantMangas() + " mangas");
        System.out.println("Dando nota " + userAnime01.getNotaUsuario() + " ao anime " + userAnime01.getAnime().getTitulo());
    }
}
