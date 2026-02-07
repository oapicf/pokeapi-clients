package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param levelUnderscorelearnedUnderscoreat 
 * @param moveUnderscorelearnUnderscoremethod 
 * @param versionUnderscoregroup 
 */
case class PokemonDetailMovesInnerVersionGroupDetailsInner(levelUnderscorelearnedUnderscoreat: Int,
                moveUnderscorelearnUnderscoremethod: AbilityDetailPokemonInnerPokemon,
                versionUnderscoregroup: AbilityDetailPokemonInnerPokemon
                )

object PokemonDetailMovesInnerVersionGroupDetailsInner {
    /**
     * Creates the codec for converting PokemonDetailMovesInnerVersionGroupDetailsInner from and to JSON.
     */
    implicit val decoder: Decoder[PokemonDetailMovesInnerVersionGroupDetailsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonDetailMovesInnerVersionGroupDetailsInner] = deriveEncoder
}
