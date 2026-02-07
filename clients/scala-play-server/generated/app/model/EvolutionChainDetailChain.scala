package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EvolutionChainDetail_chain.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class EvolutionChainDetailChain(
  evolutionDetails: List[OasAnyTypeNotMapped],
  evolvesTo: List[EvolutionChainDetailChainEvolvesToInner],
  isBaby: Boolean,
  species: AbilityDetailPokemonInnerPokemon
)

object EvolutionChainDetailChain {
  implicit lazy val evolutionChainDetailChainJsonFormat: Format[EvolutionChainDetailChain] = Json.format[EvolutionChainDetailChain]
}

