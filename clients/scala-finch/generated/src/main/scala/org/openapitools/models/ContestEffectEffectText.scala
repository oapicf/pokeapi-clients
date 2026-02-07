package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LanguageSummary

/**
 * 
 * @param effect 
 * @param language 
 */
case class ContestEffectEffectText(effect: String,
                language: LanguageSummary
                )

object ContestEffectEffectText {
    /**
     * Creates the codec for converting ContestEffectEffectText from and to JSON.
     */
    implicit val decoder: Decoder[ContestEffectEffectText] = deriveDecoder
    implicit val encoder: ObjectEncoder[ContestEffectEffectText] = deriveEncoder
}
