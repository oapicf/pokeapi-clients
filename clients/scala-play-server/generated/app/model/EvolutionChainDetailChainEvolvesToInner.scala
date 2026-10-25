package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EvolutionChainDetail_chain_evolves_to_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class EvolutionChainDetailChainEvolvesToInner(
  evolutionDetails: List[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner],
  isBaby: Boolean,
  species: AbilityDetailPokemonInnerPokemon
)

object EvolutionChainDetailChainEvolvesToInner {
  implicit lazy val evolutionChainDetailChainEvolvesToInnerJsonFormat: Format[EvolutionChainDetailChainEvolvesToInner] = Json.format[EvolutionChainDetailChainEvolvesToInner]
}

