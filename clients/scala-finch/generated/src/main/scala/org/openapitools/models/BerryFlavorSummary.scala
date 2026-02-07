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
case class BerryFlavorSummary(name: String,
                url: URI
                )

object BerryFlavorSummary {
    /**
     * Creates the codec for converting BerryFlavorSummary from and to JSON.
     */
    implicit val decoder: Decoder[BerryFlavorSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[BerryFlavorSummary] = deriveEncoder
}
