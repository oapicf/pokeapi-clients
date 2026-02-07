package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param name 
 * @param url 
 */
case class MoveTargetSummary(name: String,
                url: URI
                )

object MoveTargetSummary {
    /**
     * Creates the codec for converting MoveTargetSummary from and to JSON.
     */
    implicit val decoder: Decoder[MoveTargetSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveTargetSummary] = deriveEncoder
}
