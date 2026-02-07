package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI
import scala.collection.immutable.HashMap

/**
 * 
 * @param frontUnderscoredefault 
 */
case class PokemonDetailSprites(frontUnderscoredefault: Option[URI]
                )

object PokemonDetailSprites {
    /**
     * Creates the codec for converting PokemonDetailSprites from and to JSON.
     */
    implicit val decoder: Decoder[PokemonDetailSprites] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonDetailSprites] = deriveEncoder
}
