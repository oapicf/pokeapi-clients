package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.GenerationSummary

/**
 * 
 * @param gameUnderscoreindex 
 * @param generation 
 */
case class LocationGameIndex(gameUnderscoreindex: Int,
                generation: GenerationSummary
                )

object LocationGameIndex {
    /**
     * Creates the codec for converting LocationGameIndex from and to JSON.
     */
    implicit val decoder: Decoder[LocationGameIndex] = deriveDecoder
    implicit val encoder: ObjectEncoder[LocationGameIndex] = deriveEncoder
}
