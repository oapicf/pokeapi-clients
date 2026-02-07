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
case class SuperContestEffectFlavorText(flavorUnderscoretext: String,
                language: LanguageSummary
                )

object SuperContestEffectFlavorText {
    /**
     * Creates the codec for converting SuperContestEffectFlavorText from and to JSON.
     */
    implicit val decoder: Decoder[SuperContestEffectFlavorText] = deriveDecoder
    implicit val encoder: ObjectEncoder[SuperContestEffectFlavorText] = deriveEncoder
}
