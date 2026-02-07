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
 * @param _default 
 */
case class PokemonFormDetailSprites(_default: Option[URI]
                )

object PokemonFormDetailSprites {
    /**
     * Creates the codec for converting PokemonFormDetailSprites from and to JSON.
     */
    implicit val decoder: Decoder[PokemonFormDetailSprites] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonFormDetailSprites] = deriveEncoder
}
