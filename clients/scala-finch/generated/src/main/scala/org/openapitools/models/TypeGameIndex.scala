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
case class TypeGameIndex(gameUnderscoreindex: Int,
                generation: GenerationSummary
                )

object TypeGameIndex {
    /**
     * Creates the codec for converting TypeGameIndex from and to JSON.
     */
    implicit val decoder: Decoder[TypeGameIndex] = deriveDecoder
    implicit val encoder: ObjectEncoder[TypeGameIndex] = deriveEncoder
}
