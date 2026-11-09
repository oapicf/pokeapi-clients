package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EvolutionChainLink.
  * @param isBaby Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
  * @param species The Pokémon species at this point in the evolution chain.
  * @param evolutionDetails All details regarding the specific details of the referenced Pokémon species evolution.
  * @param evolvesTo A List of chain objects.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class EvolutionChainLink(
  isBaby: Boolean,
  species: PokemonSpeciesSummary,
  evolutionDetails: List[PokemonEvolution],
  evolvesTo: List[EvolutionChainLink]
)

object EvolutionChainLink {
  implicit lazy val evolutionChainLinkJsonFormat: Format[EvolutionChainLink] = Json.format[EvolutionChainLink]
}

