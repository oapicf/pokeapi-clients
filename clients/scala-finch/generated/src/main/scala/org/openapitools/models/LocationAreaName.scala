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
case class LocationAreaName(name: String,
                language: LanguageSummary
                )

object LocationAreaName {
    /**
     * Creates the codec for converting LocationAreaName from and to JSON.
     */
    implicit val decoder: Decoder[LocationAreaName] = deriveDecoder
    implicit val encoder: ObjectEncoder[LocationAreaName] = deriveEncoder
}
