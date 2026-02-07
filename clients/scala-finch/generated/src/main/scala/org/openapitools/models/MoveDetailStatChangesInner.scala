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
 * @param stat 
 */
case class MoveDetailStatChangesInner(change: Int,
                stat: AbilityDetailPokemonInnerPokemon
                )

object MoveDetailStatChangesInner {
    /**
     * Creates the codec for converting MoveDetailStatChangesInner from and to JSON.
     */
    implicit val decoder: Decoder[MoveDetailStatChangesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveDetailStatChangesInner] = deriveEncoder
}
