package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner(
  chance: BigDecimal,
  conditionValues: List[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner],
  maxLevel: BigDecimal,
  method: PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod,
  minLevel: BigDecimal
)

object PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner {
  implicit lazy val pokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerJsonFormat: Format[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner] = Json.format[PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner]
}

