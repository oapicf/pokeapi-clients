package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokedexDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param isMainSeries Whether or not this Pokédex originated in the main series of the video games.
  * @param descriptions The description of this resource listed in different languages.
  * @param names The name of this resource listed in different languages.
  * @param pokemonEntries A list of Pokémon catalogued in this Pokédex and their indexes.
  * @param region The region this Pokédex catalogues Pokémon for.
  * @param versionGroups A list of version groups this Pokédex is relevant to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokedexDetail(
  id: Int,
  name: String,
  isMainSeries: Option[Boolean],
  descriptions: List[PokedexDescription],
  names: List[PokedexName],
  pokemonEntries: List[PokemonDexNumber],
  region: RegionSummary,
  versionGroups: List[VersionGroupSummary]
)

object PokedexDetail {
  implicit lazy val pokedexDetailJsonFormat: Format[PokedexDetail] = Json.format[PokedexDetail]
}

