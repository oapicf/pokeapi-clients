package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param baseUnderscorescore 
 * @param pokemonMinusspecies 
 * @param rate 
 */
case class PalParkAreaDetailPokemonEncountersInner(baseUnderscorescore: Int,
                pokemonMinusspecies: AbilityDetailPokemonInnerPokemon,
                rate: Int
                )

object PalParkAreaDetailPokemonEncountersInner {
    /**
     * Creates the codec for converting PalParkAreaDetailPokemonEncountersInner from and to JSON.
     */
    implicit val decoder: Decoder[PalParkAreaDetailPokemonEncountersInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PalParkAreaDetailPokemonEncountersInner] = deriveEncoder
}
