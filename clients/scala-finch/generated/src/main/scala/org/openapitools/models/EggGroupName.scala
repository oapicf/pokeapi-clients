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
case class EggGroupName(name: String,
                language: LanguageSummary
                )

object EggGroupName {
    /**
     * Creates the codec for converting EggGroupName from and to JSON.
     */
    implicit val decoder: Decoder[EggGroupName] = deriveDecoder
    implicit val encoder: ObjectEncoder[EggGroupName] = deriveEncoder
}
