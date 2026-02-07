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
case class LocationAreaSummary(name: String,
                url: URI
                )

object LocationAreaSummary {
    /**
     * Creates the codec for converting LocationAreaSummary from and to JSON.
     */
    implicit val decoder: Decoder[LocationAreaSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[LocationAreaSummary] = deriveEncoder
}
