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
 * @param increase 
 * @param decrease 
 */
case class StatDetailAffectingNatures(increase: Seq[AbilityDetailPokemonInnerPokemon],
                decrease: Seq[AbilityDetailPokemonInnerPokemon]
                )

object StatDetailAffectingNatures {
    /**
     * Creates the codec for converting StatDetailAffectingNatures from and to JSON.
     */
    implicit val decoder: Decoder[StatDetailAffectingNatures] = deriveDecoder
    implicit val encoder: ObjectEncoder[StatDetailAffectingNatures] = deriveEncoder
}
