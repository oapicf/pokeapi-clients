package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param isUnderscorehidden 
 * @param slot 
 * @param pokemon 
 */
case class AbilityDetailPokemonInner(isUnderscorehidden: Boolean,
                slot: Int,
                pokemon: AbilityDetailPokemonInnerPokemon
                )

object AbilityDetailPokemonInner {
    /**
     * Creates the codec for converting AbilityDetailPokemonInner from and to JSON.
     */
    implicit val decoder: Decoder[AbilityDetailPokemonInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[AbilityDetailPokemonInner] = deriveEncoder
}
