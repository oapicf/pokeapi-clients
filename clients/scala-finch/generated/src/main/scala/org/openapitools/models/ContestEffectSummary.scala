package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param url 
 */
case class ContestEffectSummary(url: URI
                )

object ContestEffectSummary {
    /**
     * Creates the codec for converting ContestEffectSummary from and to JSON.
     */
    implicit val decoder: Decoder[ContestEffectSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[ContestEffectSummary] = deriveEncoder
}
