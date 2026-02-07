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
case class PokemonFormSummary(name: String,
                url: URI
                )

object PokemonFormSummary {
    /**
     * Creates the codec for converting PokemonFormSummary from and to JSON.
     */
    implicit val decoder: Decoder[PokemonFormSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonFormSummary] = deriveEncoder
}
