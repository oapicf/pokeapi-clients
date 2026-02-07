package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param level 
 * @param experience 
 */
case class Experience(level: Int,
                experience: Int
                )

object Experience {
    /**
     * Creates the codec for converting Experience from and to JSON.
     */
    implicit val decoder: Decoder[Experience] = deriveDecoder
    implicit val encoder: ObjectEncoder[Experience] = deriveEncoder
}
