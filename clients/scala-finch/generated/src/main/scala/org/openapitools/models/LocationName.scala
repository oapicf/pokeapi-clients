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
case class LocationName(name: String,
                language: LanguageSummary
                )

object LocationName {
    /**
     * Creates the codec for converting LocationName from and to JSON.
     */
    implicit val decoder: Decoder[LocationName] = deriveDecoder
    implicit val encoder: ObjectEncoder[LocationName] = deriveEncoder
}
