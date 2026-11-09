package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonEncounterVersionDetailResponse.
  * @param version The game version this encounter happens in.
  * @param maxChance The total percentage of all encounter potential.
  * @param encounterDetails A list of encounters and their specifics.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonEncounterVersionDetailResponse(
  version: VersionSummary,
  maxChance: Int,
  encounterDetails: List[PokemonEncounterDetailResponse]
)

object PokemonEncounterVersionDetailResponse {
  implicit lazy val pokemonEncounterVersionDetailResponseJsonFormat: Format[PokemonEncounterVersionDetailResponse] = Json.format[PokemonEncounterVersionDetailResponse]
}

