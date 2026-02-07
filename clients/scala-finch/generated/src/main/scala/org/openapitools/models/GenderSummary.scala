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
case class GenderSummary(name: String,
                url: URI
                )

object GenderSummary {
    /**
     * Creates the codec for converting GenderSummary from and to JSON.
     */
    implicit val decoder: Decoder[GenderSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenderSummary] = deriveEncoder
}
