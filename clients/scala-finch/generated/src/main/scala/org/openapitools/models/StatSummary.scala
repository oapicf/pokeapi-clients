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
case class StatSummary(name: String,
                url: URI
                )

object StatSummary {
    /**
     * Creates the codec for converting StatSummary from and to JSON.
     */
    implicit val decoder: Decoder[StatSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[StatSummary] = deriveEncoder
}
