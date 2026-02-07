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
case class ItemFlingEffectEffectText(effect: String,
                language: LanguageSummary
                )

object ItemFlingEffectEffectText {
    /**
     * Creates the codec for converting ItemFlingEffectEffectText from and to JSON.
     */
    implicit val decoder: Decoder[ItemFlingEffectEffectText] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemFlingEffectEffectText] = deriveEncoder
}
