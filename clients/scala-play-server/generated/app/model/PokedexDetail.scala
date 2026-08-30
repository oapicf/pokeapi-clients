package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokedexDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

