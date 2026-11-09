package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokemonEncounterDetailResponse.
  * @param chance Percent chance that this encounter will occur.
  * @param conditionValues A list of condition values that must be in effect for this encounter to occur.
  * @param maxLevel The highest level the Pokémon could be encountered at.
  * @param method The method by which this encounter happens.
  * @param minLevel The lowest level the Pokémon could be encountered at.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokemonEncounterDetailResponse(
  chance: Int,
  conditionValues: List[EncounterConditionValueSummary],
  maxLevel: Int,
  method: EncounterMethodSummary,
  minLevel: Int
)

object PokemonEncounterDetailResponse {
  implicit lazy val pokemonEncounterDetailResponseJsonFormat: Format[PokemonEncounterDetailResponse] = Json.format[PokemonEncounterDetailResponse]
}

