package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender

/**
 * 
 * @param gender 
 * @param heldUnderscoreitem 
 * @param item 
 * @param knownUnderscoremove 
 * @param knownUnderscoremoveUnderscoretype 
 * @param location 
 * @param minUnderscoreaffection 
 * @param minUnderscorebeauty 
 * @param minUnderscorehappiness 
 * @param minUnderscorelevel 
 * @param needsUnderscoreoverworldUnderscorerain 
 * @param partyUnderscorespecies 
 * @param partyUnderscoretype 
 * @param relativeUnderscorephysicalUnderscorestats 
 * @param timeUnderscoreofUnderscoreday 
 * @param tradeUnderscorespecies 
 * @param trigger 
 * @param turnUnderscoreupsideUnderscoredown 
 */
case class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner(gender: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
                heldUnderscoreitem: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
                item: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
                knownUnderscoremove: Object,
                knownUnderscoremoveUnderscoretype: Object,
                location: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
                minUnderscoreaffection: Int,
                minUnderscorebeauty: Int,
                minUnderscorehappiness: Int,
                minUnderscorelevel: Int,
                needsUnderscoreoverworldUnderscorerain: Boolean,
                partyUnderscorespecies: String,
                partyUnderscoretype: String,
                relativeUnderscorephysicalUnderscorestats: String,
                timeUnderscoreofUnderscoreday: String,
                tradeUnderscorespecies: String,
                trigger: AbilityDetailPokemonInnerPokemon,
                turnUnderscoreupsideUnderscoredown: Boolean
                )

object EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner {
    /**
     * Creates the codec for converting EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner from and to JSON.
     */
    implicit val decoder: Decoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner] = deriveEncoder
}
