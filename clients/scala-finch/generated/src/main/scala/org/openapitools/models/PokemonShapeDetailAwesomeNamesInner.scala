package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param awesomeUnderscorename 
 * @param language 
 */
case class PokemonShapeDetailAwesomeNamesInner(awesomeUnderscorename: String,
                language: AbilityDetailPokemonInnerPokemon
                )

object PokemonShapeDetailAwesomeNamesInner {
    /**
     * Creates the codec for converting PokemonShapeDetailAwesomeNamesInner from and to JSON.
     */
    implicit val decoder: Decoder[PokemonShapeDetailAwesomeNamesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonShapeDetailAwesomeNamesInner] = deriveEncoder
}
