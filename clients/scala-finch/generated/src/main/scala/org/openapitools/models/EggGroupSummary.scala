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
case class EggGroupSummary(name: String,
                url: URI
                )

object EggGroupSummary {
    /**
     * Creates the codec for converting EggGroupSummary from and to JSON.
     */
    implicit val decoder: Decoder[EggGroupSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[EggGroupSummary] = deriveEncoder
}
