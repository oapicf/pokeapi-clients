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
case class PokemonColorSummary(name: String,
                url: URI
                )

object PokemonColorSummary {
    /**
     * Creates the codec for converting PokemonColorSummary from and to JSON.
     */
    implicit val decoder: Decoder[PokemonColorSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonColorSummary] = deriveEncoder
}
