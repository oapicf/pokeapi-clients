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
case class SuperContestEffectSummary(url: URI
                )

object SuperContestEffectSummary {
    /**
     * Creates the codec for converting SuperContestEffectSummary from and to JSON.
     */
    implicit val decoder: Decoder[SuperContestEffectSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[SuperContestEffectSummary] = deriveEncoder
}
