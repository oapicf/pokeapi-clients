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
case class BerrySummary(name: String,
                url: URI
                )

object BerrySummary {
    /**
     * Creates the codec for converting BerrySummary from and to JSON.
     */
    implicit val decoder: Decoder[BerrySummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[BerrySummary] = deriveEncoder
}
