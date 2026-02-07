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
case class RegionSummary(name: String,
                url: URI
                )

object RegionSummary {
    /**
     * Creates the codec for converting RegionSummary from and to JSON.
     */
    implicit val decoder: Decoder[RegionSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[RegionSummary] = deriveEncoder
}
