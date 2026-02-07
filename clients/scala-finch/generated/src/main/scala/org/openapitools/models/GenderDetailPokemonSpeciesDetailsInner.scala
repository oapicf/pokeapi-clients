package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param rate 
 * @param pokemonUnderscorespecies 
 */
case class GenderDetailPokemonSpeciesDetailsInner(rate: Int,
                pokemonUnderscorespecies: AbilityDetailPokemonInnerPokemon
                )

object GenderDetailPokemonSpeciesDetailsInner {
    /**
     * Creates the codec for converting GenderDetailPokemonSpeciesDetailsInner from and to JSON.
     */
    implicit val decoder: Decoder[GenderDetailPokemonSpeciesDetailsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenderDetailPokemonSpeciesDetailsInner] = deriveEncoder
}
