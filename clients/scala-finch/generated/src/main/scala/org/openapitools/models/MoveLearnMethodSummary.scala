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
case class MoveLearnMethodSummary(name: String,
                url: URI
                )

object MoveLearnMethodSummary {
    /**
     * Creates the codec for converting MoveLearnMethodSummary from and to JSON.
     */
    implicit val decoder: Decoder[MoveLearnMethodSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveLearnMethodSummary] = deriveEncoder
}
