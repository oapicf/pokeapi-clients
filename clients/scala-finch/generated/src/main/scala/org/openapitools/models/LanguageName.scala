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
case class LanguageName(name: String,
                language: LanguageSummary
                )

object LanguageName {
    /**
     * Creates the codec for converting LanguageName from and to JSON.
     */
    implicit val decoder: Decoder[LanguageName] = deriveDecoder
    implicit val encoder: ObjectEncoder[LanguageName] = deriveEncoder
}
