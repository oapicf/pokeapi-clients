package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MoveSummary
import org.openapitools.models.MoveTargetDescription
import org.openapitools.models.MoveTargetName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param descriptions 
 * @param moves 
 * @param names 
 */
case class MoveTargetDetail(id: Int,
                name: String,
                descriptions: Seq[MoveTargetDescription],
                moves: Seq[MoveSummary],
                names: Seq[MoveTargetName]
                )

object MoveTargetDetail {
    /**
     * Creates the codec for converting MoveTargetDetail from and to JSON.
     */
    implicit val decoder: Decoder[MoveTargetDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveTargetDetail] = deriveEncoder
}
