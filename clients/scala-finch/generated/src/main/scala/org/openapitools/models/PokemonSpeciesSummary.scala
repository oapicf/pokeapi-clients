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
case class PokemonSpeciesSummary(name: String,
                url: URI
                )

object PokemonSpeciesSummary {
    /**
     * Creates the codec for converting PokemonSpeciesSummary from and to JSON.
     */
    implicit val decoder: Decoder[PokemonSpeciesSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonSpeciesSummary] = deriveEncoder
}
