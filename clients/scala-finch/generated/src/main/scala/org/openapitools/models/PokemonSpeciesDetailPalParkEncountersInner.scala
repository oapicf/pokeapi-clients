package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param area 
 * @param baseUnderscorescore 
 * @param rate 
 */
case class PokemonSpeciesDetailPalParkEncountersInner(area: AbilityDetailPokemonInnerPokemon,
                baseUnderscorescore: Int,
                rate: Int
                )

object PokemonSpeciesDetailPalParkEncountersInner {
    /**
     * Creates the codec for converting PokemonSpeciesDetailPalParkEncountersInner from and to JSON.
     */
    implicit val decoder: Decoder[PokemonSpeciesDetailPalParkEncountersInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonSpeciesDetailPalParkEncountersInner] = deriveEncoder
}
