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
case class MoveBattleStyleSummary(name: String,
                url: URI
                )

object MoveBattleStyleSummary {
    /**
     * Creates the codec for converting MoveBattleStyleSummary from and to JSON.
     */
    implicit val decoder: Decoder[MoveBattleStyleSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveBattleStyleSummary] = deriveEncoder
}
