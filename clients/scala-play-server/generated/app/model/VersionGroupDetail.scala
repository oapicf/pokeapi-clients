package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionGroupDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class VersionGroupDetail(
  id: Int,
  name: String,
  order: Option[Int],
  generation: GenerationSummary,
  moveLearnMethods: List[AbilityDetailPokemonInnerPokemon],
  pokedexes: List[AbilityDetailPokemonInnerPokemon],
  regions: List[AbilityDetailPokemonInnerPokemon],
  versions: List[VersionSummary]
)

object VersionGroupDetail {
  implicit lazy val versionGroupDetailJsonFormat: Format[VersionGroupDetail] = Json.format[VersionGroupDetail]
}

