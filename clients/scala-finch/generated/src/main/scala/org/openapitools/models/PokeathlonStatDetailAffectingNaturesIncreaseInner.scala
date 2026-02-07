package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param maxUnderscorechange 
 * @param nature 
 */
case class PokeathlonStatDetailAffectingNaturesIncreaseInner(maxUnderscorechange: Int,
                nature: AbilityDetailPokemonInnerPokemon
                )

object PokeathlonStatDetailAffectingNaturesIncreaseInner {
    /**
     * Creates the codec for converting PokeathlonStatDetailAffectingNaturesIncreaseInner from and to JSON.
     */
    implicit val decoder: Decoder[PokeathlonStatDetailAffectingNaturesIncreaseInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokeathlonStatDetailAffectingNaturesIncreaseInner] = deriveEncoder
}
