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
 * @param language 
 */
case class MoveDetailEffectChangesInnerEffectEntriesInner(effect: String,
                language: AbilityDetailPokemonInnerPokemon
                )

object MoveDetailEffectChangesInnerEffectEntriesInner {
    /**
     * Creates the codec for converting MoveDetailEffectChangesInnerEffectEntriesInner from and to JSON.
     */
    implicit val decoder: Decoder[MoveDetailEffectChangesInnerEffectEntriesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveDetailEffectChangesInnerEffectEntriesInner] = deriveEncoder
}
