package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param latest 
 * @param legacy 
 */
case class PokemonDetailCries(latest: URI,
                legacy: URI
                )

object PokemonDetailCries {
    /**
     * Creates the codec for converting PokemonDetailCries from and to JSON.
     */
    implicit val decoder: Decoder[PokemonDetailCries] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonDetailCries] = deriveEncoder
}
