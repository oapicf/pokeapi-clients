package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MoveDamageClassDescription
import org.openapitools.models.MoveDamageClassName
import org.openapitools.models.MoveSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param descriptions 
 * @param moves 
 * @param names 
 */
case class MoveDamageClassDetail(id: Int,
                name: String,
                descriptions: Seq[MoveDamageClassDescription],
                moves: Seq[MoveSummary],
                names: Seq[MoveDamageClassName]
                )

object MoveDamageClassDetail {
    /**
     * Creates the codec for converting MoveDamageClassDetail from and to JSON.
     */
    implicit val decoder: Decoder[MoveDamageClassDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveDamageClassDetail] = deriveEncoder
}
