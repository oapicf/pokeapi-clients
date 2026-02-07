package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LanguageSummary

/**
 * 
 * @param name 
 * @param language 
 */
case class MoveBattleStyleName(name: String,
                language: LanguageSummary
                )

object MoveBattleStyleName {
    /**
     * Creates the codec for converting MoveBattleStyleName from and to JSON.
     */
    implicit val decoder: Decoder[MoveBattleStyleName] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveBattleStyleName] = deriveEncoder
}
