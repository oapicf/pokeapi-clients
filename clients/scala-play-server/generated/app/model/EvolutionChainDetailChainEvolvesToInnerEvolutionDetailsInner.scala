package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner(
  gender: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
  heldItem: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
  item: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
  knownMove: JsObject,
  knownMoveType: JsObject,
  location: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
  minAffection: Int,
  minBeauty: Int,
  minHappiness: Int,
  minLevel: Int,
  needsOverworldRain: Boolean,
  partySpecies: String,
  partyType: String,
  relativePhysicalStats: String,
  timeOfDay: String,
  tradeSpecies: String,
  trigger: AbilityDetailPokemonInnerPokemon,
  turnUpsideDown: Boolean
)

object EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner {
  implicit lazy val evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerJsonFormat: Format[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner] = Json.format[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner]
}

