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
 * @param text 
 * @param versionUnderscoregroup 
 * @param language 
 */
case class ItemFlavorText(text: String,
                versionUnderscoregroup: VersionGroupSummary,
                language: LanguageSummary
                )

object ItemFlavorText {
    /**
     * Creates the codec for converting ItemFlavorText from and to JSON.
     */
    implicit val decoder: Decoder[ItemFlavorText] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemFlavorText] = deriveEncoder
}
