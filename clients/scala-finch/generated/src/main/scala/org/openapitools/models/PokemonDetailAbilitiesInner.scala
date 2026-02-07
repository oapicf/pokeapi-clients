package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param ability 
 * @param isUnderscorehidden 
 * @param slot 
 */
case class PokemonDetailAbilitiesInner(ability: AbilityDetailPokemonInnerPokemon,
                isUnderscorehidden: Boolean,
                slot: Int
                )

object PokemonDetailAbilitiesInner {
    /**
     * Creates the codec for converting PokemonDetailAbilitiesInner from and to JSON.
     */
    implicit val decoder: Decoder[PokemonDetailAbilitiesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonDetailAbilitiesInner] = deriveEncoder
}
