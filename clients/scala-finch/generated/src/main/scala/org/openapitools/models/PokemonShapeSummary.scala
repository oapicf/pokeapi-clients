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
case class PokemonShapeSummary(name: String,
                url: URI
                )

object PokemonShapeSummary {
    /**
     * Creates the codec for converting PokemonShapeSummary from and to JSON.
     */
    implicit val decoder: Decoder[PokemonShapeSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonShapeSummary] = deriveEncoder
}
