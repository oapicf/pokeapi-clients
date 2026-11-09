package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GenerationDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param abilities A list of abilities that were introduced in this generation.
  * @param mainRegion The main region travelled in this generation.
  * @param moves A list of moves that were introduced in this generation.
  * @param names The name of this resource listed in different languages.
  * @param pokemonSpecies A list of Pokémon species that were introduced in this generation.
  * @param types A list of types that were introduced in this generation.
  * @param versionGroups A list of version groups that were introduced in this generation.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

