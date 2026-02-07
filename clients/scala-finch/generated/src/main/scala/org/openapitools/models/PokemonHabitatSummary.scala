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
case class PokemonHabitatSummary(name: String,
                url: URI
                )

object PokemonHabitatSummary {
    /**
     * Creates the codec for converting PokemonHabitatSummary from and to JSON.
     */
    implicit val decoder: Decoder[PokemonHabitatSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonHabitatSummary] = deriveEncoder
}
