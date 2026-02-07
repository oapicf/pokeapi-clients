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
case class PokeathlonStatDetailAffectingNaturesDecreaseInner(maxUnderscorechange: Int,
                nature: AbilityDetailPokemonInnerPokemon
                )

object PokeathlonStatDetailAffectingNaturesDecreaseInner {
    /**
     * Creates the codec for converting PokeathlonStatDetailAffectingNaturesDecreaseInner from and to JSON.
     */
    implicit val decoder: Decoder[PokeathlonStatDetailAffectingNaturesDecreaseInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokeathlonStatDetailAffectingNaturesDecreaseInner] = deriveEncoder
}
