<h1 align="center">AniList</h1>

Normalmente se há um interesse em guardar os animes assistidos e mangás lidos dentro de uma lista, sendo assim meu projeto terá a idealização de ser um simples software que permita esse feito. O **AniList** será simples, conterá apenas 8 classes, incluindo a Main e a abstrata Midia, 2 interfaces e 3 Enums. Cada um dos elementos falados deverá ser implementado da seguinte forma:

## Classes

### Midia

**Classe Base** das classes `Anime` e `Manga`, deverá guardar tudo o que for comum entre esses dois, sendo uma **classe abstracta**

### Manga

**Classe Derivada** a classe `Midia`, que implementa a **interface** `Midia`, guardando os dados comuns a todos mangas.

### Anime

Como é de se esperar é uma **classe derivada** a classe `Midia`, ao qual também implementa a **interface** `Midia`, guardar os dados de todas as temporadas por meio de uma **lista de objetos** `SeasonAnime`, guardando os dados restantes ou conseguindo os mesmos por **metodos** da classe.

### SeasonAnime

Dados de cada temporada de um anime, aqui fica as informações que podem vim a ser modificadas de temporada em temporada.

### UserAnime

Está classe deve ser focada na interação do usuário com algum anime, recebendo a **interface** `UseMidia` ao qual definirá todos os seus metodos getter e setter dos seus atributos, e um **objeto** do tipo `Anime` para assimilar com as informações das reações do que o usuario achou deste anime.

### UserManga

Como a outra falada acima está classe deve ser focada na interação do usuário mas só que com mangas, recebendo a **interface** `UseMidia` ao qual definirá todos os seus metodos getter e setter dos seus atributos, e um **objeto** do tipo `Manga` para assimilar com os dados do que o usuario achou deste mangá.

### UserAccount

Como fica bem evidente pelo nome, essa é a aréa destinada a conta do usuário, para isso deve armazenar em cada usuario apenas o **nome** do usuário, a **mensagem** do perfil, uma lista para animes e outra para mangas, formada a partir de **objetos** do tipo `UserAnime` e `UserManga`.

## Interfaces

Nesse caso adicionei **2 interfaces**, a **`UserMidia`** que defini os metodos getter e setter de `UserAnime` e `UserManga`, e outra que é a **`Midia`** que defini os metodos getter de `Anime` e `Manga`

## Enums

Para melhor tratamento de alguns dados os Enums pareceram mais interessantes para esses casos, descrevendo alguns temos:

### Fonte

A fonte do que o anime se baseou para a sua criação, entre as adicionadas se variou em `ORIGINAL`, `MANGA` e `LIGTH_NOVEL`

### Temporada

A temporada de animes em que se foi lançada, podendo variar entre `PRIMAVERA`, `VERAO`, `OUTONO` e `INVERNO`

### Status

O status da interação de um usuario com alguma obra, valendo tanto para **animes** e **mangas**, podendo variar entre `ASSISTINDO` (para animes), LENDO (para mangas), `COMPLETO`, `ESPERANDO`, `PLANEJA_ASSISTIR` (Anime), `PLANEJA_LER` (Anime), `DROPADO`

# Observação

Todos os dados para a aplicação devem ser retiradas do [**MyAnimeList**](https://myanimelist.net/).
