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
case class ItemPocketSummary(name: String,
                url: URI
                )

object ItemPocketSummary {
    /**
     * Creates the codec for converting ItemPocketSummary from and to JSON.
     */
    implicit val decoder: Decoder[ItemPocketSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemPocketSummary] = deriveEncoder
}
