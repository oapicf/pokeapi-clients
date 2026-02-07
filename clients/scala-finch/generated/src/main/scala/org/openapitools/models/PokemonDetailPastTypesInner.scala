package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.PokemonDetailTypesInner
import scala.collection.immutable.Seq

/**
 * 
 * @param generation 
 * @param types 
 */
case class PokemonDetailPastTypesInner(generation: AbilityDetailPokemonInnerPokemon,
                types: Seq[PokemonDetailTypesInner]
                )

object PokemonDetailPastTypesInner {
    /**
     * Creates the codec for converting PokemonDetailPastTypesInner from and to JSON.
     */
    implicit val decoder: Decoder[PokemonDetailPastTypesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonDetailPastTypesInner] = deriveEncoder
}
