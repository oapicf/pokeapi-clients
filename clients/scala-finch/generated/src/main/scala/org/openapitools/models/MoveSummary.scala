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
case class MoveSummary(name: String,
                url: URI
                )

object MoveSummary {
    /**
     * Creates the codec for converting MoveSummary from and to JSON.
     */
    implicit val decoder: Decoder[MoveSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveSummary] = deriveEncoder
}
