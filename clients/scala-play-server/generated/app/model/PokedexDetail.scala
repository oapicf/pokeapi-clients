package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokedexDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokedexDetail(
  id: Int,
  name: String,
  isMainSeries: Option[Boolean],
  descriptions: List[PokedexDescription],
  names: List[PokedexName],
  pokemonEntries: List[PokedexDetailPokemonEntriesInner],
  region: RegionSummary,
  versionGroups: List[AbilityDetailPokemonInnerPokemon]
)

object PokedexDetail {
  implicit lazy val pokedexDetailJsonFormat: Format[PokedexDetail] = Json.format[PokedexDetail]
}

