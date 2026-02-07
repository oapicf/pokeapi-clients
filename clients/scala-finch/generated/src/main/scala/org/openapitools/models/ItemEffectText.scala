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
 * @param shortUnderscoreeffect 
 * @param language 
 */
case class ItemEffectText(effect: String,
                shortUnderscoreeffect: String,
                language: LanguageSummary
                )

object ItemEffectText {
    /**
     * Creates the codec for converting ItemEffectText from and to JSON.
     */
    implicit val decoder: Decoder[ItemEffectText] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemEffectText] = deriveEncoder
}
