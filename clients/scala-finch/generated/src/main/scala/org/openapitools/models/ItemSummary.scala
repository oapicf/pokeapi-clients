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
case class ItemSummary(name: String,
                url: URI
                )

object ItemSummary {
    /**
     * Creates the codec for converting ItemSummary from and to JSON.
     */
    implicit val decoder: Decoder[ItemSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemSummary] = deriveEncoder
}
