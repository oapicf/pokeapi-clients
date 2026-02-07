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
case class NatureSummary(name: String,
                url: URI
                )

object NatureSummary {
    /**
     * Creates the codec for converting NatureSummary from and to JSON.
     */
    implicit val decoder: Decoder[NatureSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[NatureSummary] = deriveEncoder
}
