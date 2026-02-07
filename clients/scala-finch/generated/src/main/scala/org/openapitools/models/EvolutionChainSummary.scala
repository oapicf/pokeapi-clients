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
case class EvolutionChainSummary(url: URI
                )

object EvolutionChainSummary {
    /**
     * Creates the codec for converting EvolutionChainSummary from and to JSON.
     */
    implicit val decoder: Decoder[EvolutionChainSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[EvolutionChainSummary] = deriveEncoder
}
