package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param url 
 */
case class CharacteristicSummary(url: URI
                )

object CharacteristicSummary {
    /**
     * Creates the codec for converting CharacteristicSummary from and to JSON.
     */
    implicit val decoder: Decoder[CharacteristicSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[CharacteristicSummary] = deriveEncoder
}
