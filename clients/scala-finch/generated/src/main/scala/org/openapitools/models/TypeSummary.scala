package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param name 
 * @param url 
 */
case class TypeSummary(name: String,
                url: URI
                )

object TypeSummary {
    /**
     * Creates the codec for converting TypeSummary from and to JSON.
     */
    implicit val decoder: Decoder[TypeSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[TypeSummary] = deriveEncoder
}
