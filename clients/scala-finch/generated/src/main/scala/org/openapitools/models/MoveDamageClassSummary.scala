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
case class MoveDamageClassSummary(name: String,
                url: URI
                )

object MoveDamageClassSummary {
    /**
     * Creates the codec for converting MoveDamageClassSummary from and to JSON.
     */
    implicit val decoder: Decoder[MoveDamageClassSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveDamageClassSummary] = deriveEncoder
}
