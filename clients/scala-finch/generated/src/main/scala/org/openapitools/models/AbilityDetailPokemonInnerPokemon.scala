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
case class AbilityDetailPokemonInnerPokemon(name: String,
                url: URI
                )

object AbilityDetailPokemonInnerPokemon {
    /**
     * Creates the codec for converting AbilityDetailPokemonInnerPokemon from and to JSON.
     */
    implicit val decoder: Decoder[AbilityDetailPokemonInnerPokemon] = deriveDecoder
    implicit val encoder: ObjectEncoder[AbilityDetailPokemonInnerPokemon] = deriveEncoder
}
