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
case class MoveTargetDescription(description: Option[String],
                language: LanguageSummary
                )

object MoveTargetDescription {
    /**
     * Creates the codec for converting MoveTargetDescription from and to JSON.
     */
    implicit val decoder: Decoder[MoveTargetDescription] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveTargetDescription] = deriveEncoder
}
