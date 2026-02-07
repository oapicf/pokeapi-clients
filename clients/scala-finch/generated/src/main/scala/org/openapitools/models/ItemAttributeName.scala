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
case class ItemAttributeName(name: String,
                language: LanguageSummary
                )

object ItemAttributeName {
    /**
     * Creates the codec for converting ItemAttributeName from and to JSON.
     */
    implicit val decoder: Decoder[ItemAttributeName] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemAttributeName] = deriveEncoder
}
