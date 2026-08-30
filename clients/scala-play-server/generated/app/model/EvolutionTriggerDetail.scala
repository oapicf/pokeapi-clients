package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EvolutionTriggerDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class EvolutionTriggerDetail(
  id: Int,
  name: String,
  names: List[EvolutionTriggerName],
  pokemonSpecies: List[AbilityDetailPokemonInnerPokemon]
)

object EvolutionTriggerDetail {
  implicit lazy val evolutionTriggerDetailJsonFormat: Format[EvolutionTriggerDetail] = Json.format[EvolutionTriggerDetail]
}

