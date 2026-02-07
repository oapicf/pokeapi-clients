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
case class PokeathlonStatSummary(name: String,
                url: URI
                )

object PokeathlonStatSummary {
    /**
     * Creates the codec for converting PokeathlonStatSummary from and to JSON.
     */
    implicit val decoder: Decoder[PokeathlonStatSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokeathlonStatSummary] = deriveEncoder
}
