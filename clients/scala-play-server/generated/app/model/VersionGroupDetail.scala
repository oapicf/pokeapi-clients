package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VersionGroupDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

