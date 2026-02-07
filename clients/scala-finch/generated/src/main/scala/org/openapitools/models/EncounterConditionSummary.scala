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
case class EncounterConditionSummary(name: String,
                url: URI
                )

object EncounterConditionSummary {
    /**
     * Creates the codec for converting EncounterConditionSummary from and to JSON.
     */
    implicit val decoder: Decoder[EncounterConditionSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[EncounterConditionSummary] = deriveEncoder
}
