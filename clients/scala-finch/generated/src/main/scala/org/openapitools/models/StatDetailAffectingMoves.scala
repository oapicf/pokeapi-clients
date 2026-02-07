package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.StatDetailAffectingMovesIncreaseInner
import scala.collection.immutable.Seq

/**
 * 
 * @param increase 
 * @param decrease 
 */
case class StatDetailAffectingMoves(increase: Seq[StatDetailAffectingMovesIncreaseInner],
                decrease: Seq[StatDetailAffectingMovesIncreaseInner]
                )

object StatDetailAffectingMoves {
    /**
     * Creates the codec for converting StatDetailAffectingMoves from and to JSON.
     */
    implicit val decoder: Decoder[StatDetailAffectingMoves] = deriveDecoder
    implicit val encoder: ObjectEncoder[StatDetailAffectingMoves] = deriveEncoder
}
