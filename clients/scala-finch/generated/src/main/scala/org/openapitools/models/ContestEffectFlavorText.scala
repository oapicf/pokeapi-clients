package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LanguageSummary

/**
 * 
 * @param flavorUnderscoretext 
 * @param language 
 */
case class ContestEffectFlavorText(flavorUnderscoretext: String,
                language: LanguageSummary
                )

object ContestEffectFlavorText {
    /**
     * Creates the codec for converting ContestEffectFlavorText from and to JSON.
     */
    implicit val decoder: Decoder[ContestEffectFlavorText] = deriveDecoder
    implicit val encoder: ObjectEncoder[ContestEffectFlavorText] = deriveEncoder
}
