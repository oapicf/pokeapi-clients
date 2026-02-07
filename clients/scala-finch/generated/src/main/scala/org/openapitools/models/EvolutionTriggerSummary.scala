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
case class EvolutionTriggerSummary(name: String,
                url: URI
                )

object EvolutionTriggerSummary {
    /**
     * Creates the codec for converting EvolutionTriggerSummary from and to JSON.
     */
    implicit val decoder: Decoder[EvolutionTriggerSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[EvolutionTriggerSummary] = deriveEncoder
}
