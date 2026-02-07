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
case class ContestTypeSummary(name: String,
                url: URI
                )

object ContestTypeSummary {
    /**
     * Creates the codec for converting ContestTypeSummary from and to JSON.
     */
    implicit val decoder: Decoder[ContestTypeSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[ContestTypeSummary] = deriveEncoder
}
