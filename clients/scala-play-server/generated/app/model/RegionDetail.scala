package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RegionDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

