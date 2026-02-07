package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MoveBattleStyleName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param names 
 */
case class MoveBattleStyleDetail(id: Int,
                name: String,
                names: Seq[MoveBattleStyleName]
                )

object MoveBattleStyleDetail {
    /**
     * Creates the codec for converting MoveBattleStyleDetail from and to JSON.
     */
    implicit val decoder: Decoder[MoveBattleStyleDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveBattleStyleDetail] = deriveEncoder
}
