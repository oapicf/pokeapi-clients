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
case class GenerationSummary(name: String,
                url: URI
                )

object GenerationSummary {
    /**
     * Creates the codec for converting GenerationSummary from and to JSON.
     */
    implicit val decoder: Decoder[GenerationSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerationSummary] = deriveEncoder
}
