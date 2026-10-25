package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EvolutionChainDetail_chain.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class EvolutionChainDetailChain(
  evolutionDetails: List[OasAnyTypeNotMapped],
  evolvesTo: List[EvolutionChainDetailChainEvolvesToInner],
  isBaby: Boolean,
  species: AbilityDetailPokemonInnerPokemon
)

object EvolutionChainDetailChain {
  implicit lazy val evolutionChainDetailChainJsonFormat: Format[EvolutionChainDetailChain] = Json.format[EvolutionChainDetailChain]
}

