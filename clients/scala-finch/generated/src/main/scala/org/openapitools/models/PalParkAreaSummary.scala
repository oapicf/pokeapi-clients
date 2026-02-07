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
case class PalParkAreaSummary(name: String,
                url: URI
                )

object PalParkAreaSummary {
    /**
     * Creates the codec for converting PalParkAreaSummary from and to JSON.
     */
    implicit val decoder: Decoder[PalParkAreaSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[PalParkAreaSummary] = deriveEncoder
}
