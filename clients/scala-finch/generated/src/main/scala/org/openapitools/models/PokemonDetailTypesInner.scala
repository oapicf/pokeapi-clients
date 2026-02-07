package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param slot 
 * @param _type 
 */
case class PokemonDetailTypesInner(slot: Int,
                _type: AbilityDetailPokemonInnerPokemon
                )

object PokemonDetailTypesInner {
    /**
     * Creates the codec for converting PokemonDetailTypesInner from and to JSON.
     */
    implicit val decoder: Decoder[PokemonDetailTypesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonDetailTypesInner] = deriveEncoder
}
