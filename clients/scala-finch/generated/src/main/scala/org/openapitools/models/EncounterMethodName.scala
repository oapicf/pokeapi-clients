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
case class EncounterMethodName(name: String,
                language: LanguageSummary
                )

object EncounterMethodName {
    /**
     * Creates the codec for converting EncounterMethodName from and to JSON.
     */
    implicit val decoder: Decoder[EncounterMethodName] = deriveDecoder
    implicit val encoder: ObjectEncoder[EncounterMethodName] = deriveEncoder
}
