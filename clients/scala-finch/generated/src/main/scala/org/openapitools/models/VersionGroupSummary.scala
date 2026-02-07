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
case class VersionGroupSummary(name: String,
                url: URI
                )

object VersionGroupSummary {
    /**
     * Creates the codec for converting VersionGroupSummary from and to JSON.
     */
    implicit val decoder: Decoder[VersionGroupSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[VersionGroupSummary] = deriveEncoder
}
