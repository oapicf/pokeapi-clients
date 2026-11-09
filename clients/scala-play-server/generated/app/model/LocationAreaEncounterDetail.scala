package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationAreaEncounterDetail.
  * @param minLevel The lowest level the Pokémon could be encountered at.
  * @param maxLevel The highest level the Pokémon could be encountered at.
  * @param chance Percent chance that this encounter will occur.
  * @param method The method by which this encounter happens.
  * @param conditionValues A list of condition values that must be in effect for this encounter to occur.
  * @param pokemonDetails Additional properties of the encountered Pokémon, or null if unspecified.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LocationAreaEncounterDetail(
  minLevel: Int,
  maxLevel: Int,
  chance: Option[Int],
  method: Option[EncounterMethodSummary],
  conditionValues: List[EncounterConditionValueSummary],
  pokemonDetails: EncounterPokemonDetail
)

object LocationAreaEncounterDetail {
  implicit lazy val locationAreaEncounterDetailJsonFormat: Format[LocationAreaEncounterDetail] = Json.format[LocationAreaEncounterDetail]
}

