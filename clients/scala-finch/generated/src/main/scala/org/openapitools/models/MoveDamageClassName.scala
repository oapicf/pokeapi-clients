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
case class MoveDamageClassName(name: String,
                language: LanguageSummary
                )

object MoveDamageClassName {
    /**
     * Creates the codec for converting MoveDamageClassName from and to JSON.
     */
    implicit val decoder: Decoder[MoveDamageClassName] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveDamageClassName] = deriveEncoder
}
