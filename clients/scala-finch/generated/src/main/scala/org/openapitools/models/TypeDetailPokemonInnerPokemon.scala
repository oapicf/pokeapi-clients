package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param name The name of the pokemon
 * @param url The URL to get more information about the pokemon
 */
case class TypeDetailPokemonInnerPokemon(name: Option[String],
                url: Option[URI]
                )

object TypeDetailPokemonInnerPokemon {
    /**
     * Creates the codec for converting TypeDetailPokemonInnerPokemon from and to JSON.
     */
    implicit val decoder: Decoder[TypeDetailPokemonInnerPokemon] = deriveDecoder
    implicit val encoder: ObjectEncoder[TypeDetailPokemonInnerPokemon] = deriveEncoder
}
