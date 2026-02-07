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
case class AbilityEffectText(effect: String,
                shortUnderscoreeffect: String,
                language: LanguageSummary
                )

object AbilityEffectText {
    /**
     * Creates the codec for converting AbilityEffectText from and to JSON.
     */
    implicit val decoder: Decoder[AbilityEffectText] = deriveDecoder
    implicit val encoder: ObjectEncoder[AbilityEffectText] = deriveEncoder
}
