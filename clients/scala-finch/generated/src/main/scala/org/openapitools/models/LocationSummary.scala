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
case class LocationSummary(name: String,
                url: URI
                )

object LocationSummary {
    /**
     * Creates the codec for converting LocationSummary from and to JSON.
     */
    implicit val decoder: Decoder[LocationSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[LocationSummary] = deriveEncoder
}
