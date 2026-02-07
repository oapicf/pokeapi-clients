package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LanguageSummary

/**
 * 
 * @param name 
 * @param language 
 */
case class EvolutionTriggerName(name: String,
                language: LanguageSummary
                )

object EvolutionTriggerName {
    /**
     * Creates the codec for converting EvolutionTriggerName from and to JSON.
     */
    implicit val decoder: Decoder[EvolutionTriggerName] = deriveDecoder
    implicit val encoder: ObjectEncoder[EvolutionTriggerName] = deriveEncoder
}
