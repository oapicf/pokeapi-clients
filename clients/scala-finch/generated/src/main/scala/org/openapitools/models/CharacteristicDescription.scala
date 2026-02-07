package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LanguageSummary

/**
 * 
 * @param description 
 * @param language 
 */
case class CharacteristicDescription(description: Option[String],
                language: LanguageSummary
                )

object CharacteristicDescription {
    /**
     * Creates the codec for converting CharacteristicDescription from and to JSON.
     */
    implicit val decoder: Decoder[CharacteristicDescription] = deriveDecoder
    implicit val encoder: ObjectEncoder[CharacteristicDescription] = deriveEncoder
}
