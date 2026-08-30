package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RegionDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RegionDetail(
  id: Int,
  name: String,
  locations: List[LocationSummary],
  mainGeneration: GenerationSummary,
  names: List[RegionName],
  pokedexes: List[PokedexSummary],
  versionGroups: List[AbilityDetailPokemonInnerPokemon]
)

object RegionDetail {
  implicit lazy val regionDetailJsonFormat: Format[RegionDetail] = Json.format[RegionDetail]
}

