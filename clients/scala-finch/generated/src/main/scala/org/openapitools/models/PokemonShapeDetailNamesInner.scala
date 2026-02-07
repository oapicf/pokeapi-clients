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
 * @param name 
 */
case class PokemonShapeDetailNamesInner(url: URI,
                name: String
                )

object PokemonShapeDetailNamesInner {
    /**
     * Creates the codec for converting PokemonShapeDetailNamesInner from and to JSON.
     */
    implicit val decoder: Decoder[PokemonShapeDetailNamesInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonShapeDetailNamesInner] = deriveEncoder
}
