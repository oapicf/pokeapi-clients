package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon

/**
 * 
 * @param effect 
 * @param shortUnderscoreeffect 
 * @param language 
 */
case class MoveChangeEffectEntriesInner(effect: String,
                shortUnderscoreeffect: String,
                language: AbilityDetailPokemonInnerPokemon
                )

object MoveChangeEffectEntriesInner {
    /**
     * Creates the codec for converting MoveChangeEffectEntriesInner from and to JSON.
     */
    implicit val decoder: Decoder[MoveChangeEffectEntriesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveChangeEffectEntriesInner] = deriveEncoder
}
