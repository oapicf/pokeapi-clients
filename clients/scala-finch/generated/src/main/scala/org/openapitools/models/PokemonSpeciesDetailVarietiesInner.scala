package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param isUnderscoredefault 
 * @param pokemon 
 */
case class PokemonSpeciesDetailVarietiesInner(isUnderscoredefault: Boolean,
                pokemon: AbilityDetailPokemonInnerPokemon
                )

object PokemonSpeciesDetailVarietiesInner {
    /**
     * Creates the codec for converting PokemonSpeciesDetailVarietiesInner from and to JSON.
     */
    implicit val decoder: Decoder[PokemonSpeciesDetailVarietiesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonSpeciesDetailVarietiesInner] = deriveEncoder
}
