package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.MoveLearnMethodDescription
import org.openapitools.models.MoveLearnMethodName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param names 
 * @param descriptions 
 * @param versionUnderscoregroups 
 */
case class MoveLearnMethodDetail(id: Int,
                name: String,
                names: Seq[MoveLearnMethodName],
                descriptions: Seq[MoveLearnMethodDescription],
                versionUnderscoregroups: Seq[AbilityDetailPokemonInnerPokemon]
                )

object MoveLearnMethodDetail {
    /**
     * Creates the codec for converting MoveLearnMethodDetail from and to JSON.
     */
    implicit val decoder: Decoder[MoveLearnMethodDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveLearnMethodDetail] = deriveEncoder
}
