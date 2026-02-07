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
case class MachineSummary(url: URI
                )

object MachineSummary {
    /**
     * Creates the codec for converting MachineSummary from and to JSON.
     */
    implicit val decoder: Decoder[MachineSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[MachineSummary] = deriveEncoder
}
