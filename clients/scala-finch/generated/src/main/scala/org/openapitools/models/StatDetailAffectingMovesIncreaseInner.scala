package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param change 
 * @param move 
 */
case class StatDetailAffectingMovesIncreaseInner(change: Int,
                move: AbilityDetailPokemonInnerPokemon
                )

object StatDetailAffectingMovesIncreaseInner {
    /**
     * Creates the codec for converting StatDetailAffectingMovesIncreaseInner from and to JSON.
     */
    implicit val decoder: Decoder[StatDetailAffectingMovesIncreaseInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[StatDetailAffectingMovesIncreaseInner] = deriveEncoder
}
