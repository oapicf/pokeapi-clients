package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GenerationDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GenerationDetail(
  id: Int,
  name: String,
  abilities: List[AbilitySummary],
  mainRegion: RegionSummary,
  moves: List[MoveSummary],
  names: List[GenerationName],
  pokemonSpecies: List[PokemonSpeciesSummary],
  types: List[TypeSummary],
  versionGroups: List[VersionGroupSummary]
)

object GenerationDetail {
  implicit lazy val generationDetailJsonFormat: Format[GenerationDetail] = Json.format[GenerationDetail]
}

