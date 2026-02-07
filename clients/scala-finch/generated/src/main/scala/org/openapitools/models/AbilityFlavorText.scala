package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LanguageSummary
import org.openapitools.models.VersionGroupSummary

/**
 * 
 * @param flavorUnderscoretext 
 * @param language 
 * @param versionUnderscoregroup 
 */
case class AbilityFlavorText(flavorUnderscoretext: String,
                language: LanguageSummary,
                versionUnderscoregroup: VersionGroupSummary
                )

object AbilityFlavorText {
    /**
     * Creates the codec for converting AbilityFlavorText from and to JSON.
     */
    implicit val decoder: Decoder[AbilityFlavorText] = deriveDecoder
    implicit val encoder: ObjectEncoder[AbilityFlavorText] = deriveEncoder
}
