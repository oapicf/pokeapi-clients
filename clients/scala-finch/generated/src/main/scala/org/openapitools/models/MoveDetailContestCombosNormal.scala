package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import scala.collection.immutable.Seq

/**
 * 
 * @param useUnderscorebefore 
 * @param useUnderscoreafter 
 */
case class MoveDetailContestCombosNormal(useUnderscorebefore: Seq[AbilityDetailPokemonInnerPokemon],
                useUnderscoreafter: Seq[AbilityDetailPokemonInnerPokemon]
                )

object MoveDetailContestCombosNormal {
    /**
     * Creates the codec for converting MoveDetailContestCombosNormal from and to JSON.
     */
    implicit val decoder: Decoder[MoveDetailContestCombosNormal] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveDetailContestCombosNormal] = deriveEncoder
}
