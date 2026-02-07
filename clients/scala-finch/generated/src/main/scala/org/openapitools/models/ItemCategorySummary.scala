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
case class ItemCategorySummary(name: String,
                url: URI
                )

object ItemCategorySummary {
    /**
     * Creates the codec for converting ItemCategorySummary from and to JSON.
     */
    implicit val decoder: Decoder[ItemCategorySummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemCategorySummary] = deriveEncoder
}
