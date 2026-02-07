package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.MoveDetailEffectChangesInnerEffectEntriesInner
import scala.collection.immutable.Seq

/**
 * 
 * @param effectUnderscoreentries 
 * @param versionUnderscoregroup 
 */
case class MoveDetailEffectChangesInner(effectUnderscoreentries: Seq[MoveDetailEffectChangesInnerEffectEntriesInner],
                versionUnderscoregroup: AbilityDetailPokemonInnerPokemon
                )

object MoveDetailEffectChangesInner {
    /**
     * Creates the codec for converting MoveDetailEffectChangesInner from and to JSON.
     */
    implicit val decoder: Decoder[MoveDetailEffectChangesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveDetailEffectChangesInner] = deriveEncoder
}
