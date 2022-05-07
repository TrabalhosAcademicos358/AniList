<h1 align="center">AniList</h1>

Normalmente se há um interesse em guardar os animes assistidos dentro de uma lista, sendo assim meu projeto terá a idealização de ser um simples software que permita esse feito. O **AniList** será simples, ele deve conter apenas as classes **`Anime`**, **`UserAnime`** e **`UserAccount`**. Cada classe deve ser implementada da seguinte maneira:

## Anime

Essa classe deverá guardar o **nome**, o **ano do lançamento**, a **nota** dada pelo publico, o seu **estúdio**, o **gênero**, a **fonte** que o anime foi baseado (manga, linght nove e etc) e a **temporada** da sua época de lançamento (inverno, primavera, verão, outono), todas as informações devem ser retiradas do [**MyAnimeList**](https://myanimelist.net/).

## UserAnime

Já essa classe deve ser focada na interação do usuário com algum anime, para isso ela deve receber o **status** atual (assistindo, se desistiu de assistir, na lista para assistir ou terminou de assisti), a **nota** dada pelo usuário, quantos episódios já assistiu, em outras palavras o progresso, e por fim deve guardar um **objetos do tipo Anime**.

## UserAccount

Como fica bem evidente pelo nome, essa é a aréa destinada a conta do usuário, para isso deve conter apenas o **nome** do usuário, a **mensagem** do perfil e uma lista com os animes, formada a partir de **objetos do tipo UserAnime**.
