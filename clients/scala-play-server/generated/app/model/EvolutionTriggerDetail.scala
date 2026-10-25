package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EvolutionTriggerDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class EvolutionTriggerDetail(
  id: Int,
  name: String,
  names: List[EvolutionTriggerName],
  pokemonSpecies: List[AbilityDetailPokemonInnerPokemon]
)

object EvolutionTriggerDetail {
  implicit lazy val evolutionTriggerDetailJsonFormat: Format[EvolutionTriggerDetail] = Json.format[EvolutionTriggerDetail]
}

