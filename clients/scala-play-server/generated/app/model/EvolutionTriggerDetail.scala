package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EvolutionTriggerDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param names The name of this resource listed in different languages.
  * @param pokemonSpecies A list of pokemon species that result from this evolution trigger.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class EvolutionTriggerDetail(
  id: Int,
  name: String,
  names: List[EvolutionTriggerName],
  pokemonSpecies: List[PokemonSpeciesSummary]
)

object EvolutionTriggerDetail {
  implicit lazy val evolutionTriggerDetailJsonFormat: Format[EvolutionTriggerDetail] = Json.format[EvolutionTriggerDetail]
}

