package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.PokemonDetailAbilitiesInner
import scala.collection.immutable.Seq

/**
 * 
 * @param abilities 
 * @param generation 
 */
case class PokemonDetailPastAbilitiesInner(abilities: Seq[PokemonDetailAbilitiesInner],
                generation: AbilityDetailPokemonInnerPokemon
                )

object PokemonDetailPastAbilitiesInner {
    /**
     * Creates the codec for converting PokemonDetailPastAbilitiesInner from and to JSON.
     */
    implicit val decoder: Decoder[PokemonDetailPastAbilitiesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonDetailPastAbilitiesInner] = deriveEncoder
}
