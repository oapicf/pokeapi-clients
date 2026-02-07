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
 * @param color 
 * @param language 
 */
case class ContestTypeName(name: String,
                color: String,
                language: LanguageSummary
                )

object ContestTypeName {
    /**
     * Creates the codec for converting ContestTypeName from and to JSON.
     */
    implicit val decoder: Decoder[ContestTypeName] = deriveDecoder
    implicit val encoder: ObjectEncoder[ContestTypeName] = deriveEncoder
}
