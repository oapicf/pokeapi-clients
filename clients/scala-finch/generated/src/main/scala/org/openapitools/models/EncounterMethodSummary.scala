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
case class EncounterMethodSummary(name: String,
                url: URI
                )

object EncounterMethodSummary {
    /**
     * Creates the codec for converting EncounterMethodSummary from and to JSON.
     */
    implicit val decoder: Decoder[EncounterMethodSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[EncounterMethodSummary] = deriveEncoder
}
